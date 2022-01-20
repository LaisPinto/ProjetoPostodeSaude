
package modelo;

/**
 *
 * @author laisp
 */
public class Exame {
    private int idexame;
    private int idpaciente;
    private String paciente;
    private String ano;
    private String mes;
    private String dia;
    private String hora;
    private String min;
    private String exame;
    private int exametipo;
    
     public Exame() {
    }
    
     /**
     * 
     * @param idexame  recebe o id do usuario
     * @param paciente   rcebe o nome do paciente
     * @param exame  recebe o tipo de exame 
     * @param problema   recebe o tipo de sintomas que o paciente
     
    
     */
    
    
    public Exame(int idexame, String paciente, String ano, String mes, String dia, String hora, String min, String exame) {
        
        this.idexame = idexame;
        this.paciente = paciente;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.min = min;
        this.exame = exame;  
    }

    public int getExametipo() {
        return exametipo;
    }

    public void setExametipo(int exametipo) {
        this.exametipo = exametipo;
    }
    
    
    public int getIdExame() {
        return idexame;
    }

    public void setIdExame(int idexame) {
        this.idexame = idexame;
    }

     public String getpaciente() {
        return paciente;
    }

    public void setpaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
    public String gethora() {
        return hora;
    }

    public void sethora(String hora) {
        this.hora = hora;
    }
    
    public String getmin() {
        return min;
    }

    public void setmin(String min) {
        this.min = min;
    }
    
    public String getexame() {
        return exame;
    }
    
     public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    public void setexame(String exame) {
        this.exame = exame;
    }
    
    
   public void separarData(String data){
       String dia = "", mes = "", ano = "", hora = "", min = "";
       
       ano += data.charAt(0);
       ano +=data.charAt(1);
       ano +=data.charAt(2);
       ano +=data.charAt(3);
       setAno(ano);
       mes += data.charAt(5);
       mes +=data.charAt(6);
       setMes(mes);
       dia += data.charAt(8);
       dia +=data.charAt(9);
       setDia(dia);
       hora += data.charAt(11);
       hora +=data.charAt(12);
       sethora(hora);
       min += data.charAt(14);
       min +=data.charAt(15);
       setmin(min);
   }
   
   public void Data(String data){
       String dia = "", mes = "", ano = "", hora = "", min = "";
       
       dia += data.charAt(0);
       dia += data.charAt(1);
       setDia(dia);
       mes += data.charAt(3);
       mes +=data.charAt(4);
       setMes(mes);
       ano += data.charAt(6);
       ano +=data.charAt(7);
       ano +=data.charAt(8);
       ano +=data.charAt(9);
       setAno(ano);
       hora += data.charAt(11);
       hora +=data.charAt(12);
       sethora(hora);
       min += data.charAt(14);
       min +=data.charAt(15);
       setmin(min);
       
   }
   
   public String juntarDataTabela(){
       String data = "";
       data += dia+"/"+mes+"/"+ano+" "+hora+":"+min;
       return data;
   }
   
   public String juntarDataBanco(String ano, String mes, String dia, String hora, String min){
       String data = "";
       data+= ano+"/"+mes+"/"+dia+" "+hora+":"+min+":00";
       return data;
   }
}
