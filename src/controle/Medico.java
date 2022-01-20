
package controle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Pessoa;
import persistencia.ConexaoBanco;

/**
 *
 * @author laisp
 */
public class Medico {
    public ArrayList<Pessoa> preencherTabela()throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql = "select id_pessoa,nome,etnia,sexo,estado_civil,rg,telefone,rua,numero,cep,cidade,estado,corem,Pessoa_TIPO = 2;";

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
                u.setNome(rs.getString("Nome"));
                u.setEtnia(rs.getString("etnia"));
                u.setSexo(rs.getString("sexo"));
                u.setEstCivil(rs.getString("estado_civil"));
                u.setRg(rs.getString("rg"));
                u.setTel(rs.getString("telefone"));
                u.setendereco(rs.getString("rua"));
                u.setNum(rs.getString("Número"));
                u.setCep(rs.getString("cep"));
                u.setCidade(rs.getString("cidade"));
                u.setEstado(rs.getString("estado"));
                u.setcorem(rs.getString("corem"));

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
}
