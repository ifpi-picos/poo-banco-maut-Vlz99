public class Cliente {
    
    String nome;
    String cpf;
    String dataNascimento;
    String cep;
    
    public Cliente(String nome, String cpf, String dataNascimento, String cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCep() {
        return cep;
    }
   

}
   
