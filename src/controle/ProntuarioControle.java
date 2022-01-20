
package controle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Agenda;
import modelo.Prontuario;
import persistencia.ConexaoBanco;

/**
 *
 * @author laisp
 */
public class ProntuarioControle {
    public ArrayList<Prontuario> preencherTabela()throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql = "select Prontuario.id_prontuario,Prontuario.data,pessoa.nome,tipo_consulta.consulta  from pessoa\n "
                    + "inner join Prontuario on pessoa.id_pessoa = Prontuario.id_pessoa\n "
                    + "inner join tipo_consulta on Prontuario.id_tipo_consulta = tipo_consulta.id_tipo_consulta\n" 
                    +"where pessoa.id_pessoa = 1;";

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            ArrayList<Prontuario> p = new ArrayList<>();
            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                Prontuario u = new Prontuario();
                
                u.setIdProntuario(rs.getInt("id_prontuario"));
                u.setpaciente(rs.getString("nome"));
                u.separarData(rs.getString("data"));
                u.setconsulta(rs.getString("consulta"));
                
                p.add(u);
            }//fecha while
            return p;
        } catch (SQLException e) {
            throw new SQLException("Erro! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }
    
    public ArrayList<String> preencherConsulta() throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "select consulta  from tipo_consulta;";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<String> ex = new ArrayList<>();
            
            while (rs.next()) {
                ex.add(rs.getString("consulta"));
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
    
     public ArrayList<String> preencherProntuario() throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
         try {
            String sql = "select consulta  from tipo_consulta;";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<String> c = new ArrayList<>();
            
            while (rs.next()) {
                c.add(rs.getString("consulta"));
            }
            return c;
         } catch (Exception e) {
              throw new SQLException("Erro! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
     }
    
    public void cadastrarProntuario(String idpaciente, String ano, String mes, String dia, String hora, String min, String consultatipo) throws SQLException{
        Prontuario p = new Prontuario();
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql = "insert into Prontuario(data,id_pessoa,id_tipo_consulta) "
                       + "value('"+p.juntarDataBanco(ano, mes, dia, hora, min)+"',"+idpaciente+","+consultatipo+");";

            stat.execute(sql);

            JOptionPane.showMessageDialog(
                    null, 
                    "Prontuario cadastrado com sucesso!");

        } catch (SQLException e) {
            throw new SQLException("Erro! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//cadastrarProntuario
    
    public void alterarProntuario(int Idprontuario, String ano, String mes, String dia, String hora, String min, int consultatipo) throws SQLException{
          
         Prontuario a = new Prontuario();
         
          Connection con = ConexaoBanco.getConexao();
          Statement stat = con.createStatement();
         try {
            String sql = "update Prontuario set data='"+a.juntarDataBanco(ano, mes, dia, hora, min)+"', id_tipo_consulta="+consultatipo+" where id_prontuario = "+Idprontuario;

            stat.execute(sql);

            JOptionPane.showMessageDialog(
                    null, 
                    "Prontuario alterado com sucesso!");

        } catch (SQLException e) {
            throw new SQLException("Erro! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//alterarAgenda
     
     public int procurarId(String nome) throws SQLException{
         Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "select id_tipo_consulta from tipo_consulta where consulta = '"+nome+"';";

            ResultSet rs = stat.executeQuery(sql);
            rs.next();
            return rs.getInt("id_tipo_consulta");
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
