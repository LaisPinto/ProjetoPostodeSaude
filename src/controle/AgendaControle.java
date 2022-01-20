
package controle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Agenda;
import persistencia.ConexaoBanco;

/**
 *
 * @author laisp
 */
public class AgendaControle {
    public ArrayList<Agenda> preencherTabela()throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql = "select agenda.id_agenda, pessoa.nome, tipo_exame.exame, agenda.data from pessoa \n" +
            "inner join agenda on pessoa.id_pessoa = agenda.id_pessoa \n" +
            "inner join tipo_exame on agenda.id_tipo_exame  = tipo_exame.id_tipo_exame;";

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            ArrayList<Agenda> a = new ArrayList<>();
            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                Agenda u = new Agenda();
                
                u.setid_Agenda(rs.getInt("id_agenda"));
                u.setPaciente(rs.getString("nome"));
                u.separarData(rs.getString("data"));
                u.setexame(rs.getString("exame"));
                
                a.add(u);
            }//fecha while
            return a;
        } catch (SQLException e) {
            throw new SQLException("Erro! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }
    
    public ArrayList<String> preencherAgenda() throws SQLException{
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
    
    public void cadastrarAgenda(int idpaciente, String ano, String mes, String dia, String hora, String min, int exametipo) throws SQLException{
           Agenda a = new Agenda();
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql = "insert into agenda(data,id_pessoa,id_tipo_exame) "
                       + "value('"+a.juntarDataBanco(ano, mes, dia, hora, min)+"',"+idpaciente+","+exametipo+");";

            stat.execute(sql);

            JOptionPane.showMessageDialog(
                    null, 
                    "Agenda cadastrada com sucesso!");

        } catch (SQLException e) {
            throw new SQLException("Erro! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//cadastrarAgenda
    
     public void alterarAgenda(int id_Agenda, String ano, String mes, String dia, String hora, String min, int exametipo) throws SQLException{
          
         Agenda a = new Agenda();
         
          Connection con = ConexaoBanco.getConexao();
          Statement stat = con.createStatement();
         try {
            String sql = "update agenda set data='"+a.juntarDataBanco(ano, mes, dia, hora, min)+"', id_tipo_exame="+exametipo+" where id_agenda = "+id_Agenda;

            stat.execute(sql);

            JOptionPane.showMessageDialog(
                    null, 
                    "Agenda alterado com sucesso!");

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
