
package controle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Exame;
import modelo.Tipo_Exame;
import persistencia.ConexaoBanco;

/**
 *
 * @author laisp
 */
public class ExameControle {
    public ArrayList<Exame> preencherTabela()throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql = "select exame.id_exame,exame.data,pessoa.nome,tipo_exame.exame  from pessoa\n "
                    + "inner join exame on pessoa.id_pessoa = exame.id_pessoa\n "
                    + "inner join tipo_exame on exame.id_tipo_exame = tipo_exame.id_tipo_exame;";

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            ArrayList<Exame> e = new ArrayList<>();
            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                Exame u = new Exame();
                
                u.setIdExame(rs.getInt("id_exame"));
                u.setpaciente(rs.getString("nome"));
                u.separarData(rs.getString("data"));
                u.setexame(rs.getString("exame"));
                
                e.add(u);
            }//fecha while
            return e;
        } catch (SQLException e) {
            throw new SQLException("Erro! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }
    
    public ArrayList<String> preencherExame() throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "select exame  from tipo_exame;";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<String> ex = new ArrayList<>();
            
            while (rs.next()) {
                ex.add(rs.getString("exame"));
            }
            return ex;
        } catch (SQLException e) {
            throw new SQLException("Erro! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }
    
    public ArrayList<String> preencherPaciente() throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql = "select nome from pessoa;";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<String> pp = new ArrayList();
            
            while (rs.next()) {
                pp.add(rs.getString("nome"));
                
            }
            return pp;
        } catch (SQLException e) {
            throw new SQLException("Erro!" + e.getMessage());
        }finally{
            con.close();
            stat.close();
        }
    }

    
    public void cadastrarExame(int idpaciente, String ano, String mes, String dia, String hora, String min, int exametipo) throws SQLException{
        Exame ex = new Exame();
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql = "insert into Exame(data,id_pessoa,id_tipo_exame) "
                       + "value('"+ex.juntarDataBanco(ano, mes, dia, hora, min)+"',"+idpaciente+","+exametipo+");";

            stat.execute(sql);

            JOptionPane.showMessageDialog(
                    null, 
                    "Exame cadastrado com sucesso!");

        } catch (SQLException e) {
            throw new SQLException("Erro! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//cadastrarPessoa
    
    public void alterarExame(int idexame, String ano, String mes, String dia, String hora, String min, int exametipo) throws SQLException{
          
        Exame ex = new Exame();
       
        
          Connection con = ConexaoBanco.getConexao();
          Statement stat = con.createStatement();
         try {
            String sql = "update Exame set data='"+ex.juntarDataBanco(ano, mes, dia, hora, min)+"', id_tipo_exame="+exametipo+" where id_exame = "+idexame;

            stat.execute(sql);
            
            

            JOptionPane.showMessageDialog(
                    null, 
                    "Exame alterado com sucesso!");

        } catch (SQLException e) {
            throw new SQLException("Erro! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//alterarExame
    
    public int procurarId(String nome)throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql = "select id_tipo_exame from tipo_exame where exame = '"+nome+"';";

            ResultSet rs = stat.executeQuery(sql);
            rs.next();
            return rs.getInt("id_tipo_exame");
        } catch (SQLException e) {
            throw new SQLException("Erro! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//procurar id
   
     public int procurarIdPaciente(String nome) throws SQLException{
         Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "select id_pessoa from pessoa where nome = '"+nome+"';";

            ResultSet rs = stat.executeQuery(sql);
            rs.next();
            return rs.getInt("id_pessoa");
        } catch (SQLException e) {
            throw new SQLException("Erro! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//procurar id
    
}
