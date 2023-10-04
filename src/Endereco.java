public class Endereco {
    private String rua;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;
   
    public Endereco(String rua, String cep, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public String getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
    
    
}
