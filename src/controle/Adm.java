
package controle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Pessoa;
import persistencia.ConexaoBanco;

/**
 *
 * @author laisp
 */
public class Adm {
    
      public ArrayList<Pessoa> preencherTabela()throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql = "select id_pessoa,nome,estado_civil,rua,numero,cep,cidade,estado,telefone  from pessoa where Pessoa_TIPO = 4;";

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            ArrayList<Pessoa> p = new ArrayList<>();
            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                Pessoa u = new Pessoa();

                u.setIdPessoa(rs.getInt("id_pessoa"));
                u.setNome(rs.getString("nome"));
                u.setEstCivil(rs.getString("estado_civil"));
                u.setendereco(rs.getString("rua"));
                u.setNum(rs.getString("numero"));
                u.setCep(rs.getString("cep"));
                u.setCidade(rs.getString("cidade"));
                u.setEstado(rs.getString("estado"));
                u.setTel(rs.getString("telefone"));

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
    
      public void cadastrarPessoa(String nome, String sus, String estCivil, String etinia, String sexo, String rg, String endereco, String num,String cep,String cidade, String estado, String tel, int tipo) throws SQLException{
          
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql = "insert into Pessoa(nome,sus,etnia,sexo,estado_civil,rg,rua,numero,cep,cidade,estado,telefone,Pessoa_TIPO) "
                       + "value('"+nome+"','"+sus+"','"+etinia+"','"+sexo+"','"+estCivil+"','"+rg+"','"+endereco+"','"+num+"','"+cep+"','"+cidade+"','"+estado+"','"+tel+"',"+tipo+");";

            stat.execute(sql);

            JOptionPane.showMessageDialog(
                    null, 
                    "Paciente cadastrado com sucesso!");

        } catch (SQLException e) {
            throw new SQLException("Erro! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//cadastrarPessoa
      
      public void alterarPessoa(int id_Pessoa, String Nome, String estCivil, String endereco, String num, String cep, String cidade, String estado, String tel) throws SQLException{
          
          Connection con = ConexaoBanco.getConexao();
          Statement stat = con.createStatement();
         try {
            String sql = "update Pessoa set nome='"+Nome+"', estado_civil='"+estCivil+"', rua='"+endereco+"',  numero='"+num+"', cep='"+cep+"', cidade='"+cidade+"', estado='"+estado+"', telefone='"+tel+"' where id_pessoa = "+id_Pessoa;

            stat.execute(sql);

            JOptionPane.showMessageDialog(
                    null, 
                    "Cadastro alterado com sucesso!");

        } catch (SQLException e) {
            throw new SQLException("Erro! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//alterarPessoa
         
}
