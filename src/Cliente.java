public class Cliente {
    
   public static char[] ge;
private String nome;
   private String cpf;
   private String dataNascimento;
   private Endereco endereco;
    
    
    public Cliente(String nome, String cpf, String dataNascimento, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;

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

    public Endereco getEndereco() {
        return endereco;
    }
   

}
   
