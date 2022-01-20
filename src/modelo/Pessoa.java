package modelo;

/**
 *
 * @author laisp
 */
public class Pessoa {
    private int idpessoa;
    private String sus ;
    private String nome = "";
    private String estCivil = "";
    private String etinia = "";
    private String sexo = "";
    private String rg;
    private String endereco = "";
    private String num;
    private String cep;
    private String cidade = "";
    private String estado = "";
    private String tel;
    private String login;
    private String senha;
    private String corem;
    private String crm;
    private int tipo;
    private int idpaciente;

   
    
    //contrutor
    public Pessoa() {
        
    }
    
    /**
     * 
     * @param id id do usuario
     * @param cartao numero do cartão do sus
     * @param nome nome do paciente
     * @param estCivil estado cicvil do paciente
     * @param cor cor do paciente
     * @param sexo sexo do paciente
     * @param rg rg do paciente
     * @param nacionalidade nacionalidade do apciente
     * @param endereco endereco do paciente
     * @param num numero da residenciaa
     * @param cep cep do paciente
     * @param cidade cidade do paciente
     * @param estado estado do paciente
     * @param tel contato do paciente
     */
    
    public Pessoa(int id, String sus, String nome, String estCivil, String etnia, String sexo, String rg, String nacionalidade, String endereco, String num, String cep, String cidade, String estado, String tel, String login, String senha, String corem, String crm, int tipo) {
        this.idpessoa = idpessoa;
        this.sus = sus;
        this.nome = nome;
        this.estCivil = estCivil;
        this.etinia = etnia;
        this.sexo = sexo;
        this.rg = rg;
        this.endereco = endereco;
        this.num = num;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.tel = tel;
        this.login = login;
        this.senha = senha;
        this.corem = corem;
        this.crm = crm;
        this.tipo = tipo;
    }

    public int getIdPessoa() {
        return idpessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idpessoa = idPessoa;
    }

    public String getSus() {
        return sus;
    }

    public void setSus(String sus) {
        this.sus = sus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public String getEtnia() {
        return etinia;
    }

    public void setEtnia(String etnia) {
        this.etinia = etinia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

   

    public String getendereco() {
        return endereco;
    }

    public void setendereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public String getlogin() {
        return login;
    }

    public void setlogin(String login) {
        this.login = login;
    }
    
    public String getsenha() {
        return senha;
    }

    public void setsenha(String senha) {
        this.senha = senha;
    }
    
    public String getcorem() {
        return corem;
    }

    public void setcorem (String corem) {
        this.corem = corem;
    }
    
    public String getcrm() {
        return crm;
    }

    public void setcrm(String crm) {
        this.crm = crm;
    }
    
    public int gettipo() {
        return tipo;
    }

    public void settipo(int tipo) {
        this.tipo = tipo;
    }
    
     public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }
    
   
  }