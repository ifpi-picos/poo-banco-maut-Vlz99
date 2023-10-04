import java.util.List;
import java.util.ArrayList;
public class Conta {
 private final String numeroAgencia;
 private final String nomeCinte;
 private final String numeroConta;
 private final String cpf;
 private double saldo;
 private String trasacao;

 List<Conta> Conta = new ArrayList<Conta>();
 
 public Conta(String numeroAgencia, String nomeCinte, String numeroConta, double saldo, String cpf, String trasacao) {
    this.numeroAgencia = numeroAgencia;
    this.nomeCinte = nomeCinte;
    this.numeroConta = numeroConta;
    this.saldo = saldo;
    this.cpf = cpf;
}

public String getNumeroAgencia() {
    return numeroAgencia;
}

public String getNomeCinte() {
    return nomeCinte;
}

public String getNumeroConta() {
    return numeroConta;
}

public double getSaldo() {
    return saldo;
}

public String getCpf(){
    return cpf;
}

public String getTrasacao() {
    return trasacao;
}

}
