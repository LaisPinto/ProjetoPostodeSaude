
package modelo;

/**
 *
 * @author laisp
 */
public class Tipo_Consulta {
    private int id_tipo_consulta;
    private String consulta;
    
    public Tipo_Consulta(){
        
    }
    
    public Tipo_Consulta(int id_tipo_consulta, String consulta){
        
        this.id_tipo_consulta = id_tipo_consulta;
        this.consulta = consulta;
    }
    
    public int getid_tipo_consulta(){
        return id_tipo_consulta;
    }
    
    public void setid_tipo_consulta(int id_tipo_consulta){
        this.id_tipo_consulta = id_tipo_consulta;
    }
    
    public String getconsulta(){
        return consulta;
        
    }
    
    public void setconsulta(String consulta){
        this.consulta = consulta;
    }
}
