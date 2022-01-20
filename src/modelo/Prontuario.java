
package modelo;

/**
 *
 * @author laisp
 */
public class Prontuario {
    public int idProntuario ;
    public String paciente;
    public String consulta = "";
    private String ano;
    private String mes;
    private String dia;
    private String hora;
    private String min;
    private int consultatipo;
    private int idpaciente;

    

    
    
    public Prontuario() {
    }
    
     /**
     * 
     * @param idProntuario recebe o id do usuario
     * @param paciente rcebe o nome do paciente
     * @param motivo recebe o tipo de atendimento 
     * @param data recebe a data de entrada do paciente
    
     */
    
    public Prontuario(int idProntuario, int consultatipo, String paciente,String consulta, String ano, String mes, String dia, String hora, String min, String exame) {
        this.idProntuario = idProntuario;
        this.paciente = paciente;
        this.consulta = consulta;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.min = min;
        this.consultatipo = consultatipo;
       
    }
    public int getIdprontuario() {
        return idProntuario;
    }

    public void setIdProntuario(int idProntuario) {
        this.idProntuario = idProntuario;
    }
     public String getpaciente() {
        return paciente;
    }

    public void setpaciente(String paciente) {
        this.paciente = paciente;
    }
    
    public String getconsulta() {
        return consulta;
    }

    public void setconsulta(String consulta) {
        this.consulta = consulta;
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
    
    public int getConsultatipo() {
        return consultatipo;
    }

    public void setConsultatipo(int consultatipo) {
        this.consultatipo = consultatipo;
    }
    
    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
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
