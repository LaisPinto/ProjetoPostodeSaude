
package modelo;

/**
 *
 * @author laisp
 */
public class Tipo_Exame {
    private int id_tipo_exame;
    private String exame;
    
    public Tipo_Exame(){
        
    }
    
    public Tipo_Exame(int id_tipo_exame, String exame){
        
        this.id_tipo_exame = id_tipo_exame;
        this.exame = exame;
    }
    
    public int getid_tipo_exame(){
        return id_tipo_exame;
    }
    
    public void setid_tipo_exame(int id_tipo_exame){
        this.id_tipo_exame = id_tipo_exame;
    }
    
    public String getexame(){
        return exame;
        
    }
    
    public void setexame(String exame){
        this.exame = exame;
    }
}
