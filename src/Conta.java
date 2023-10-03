import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Conta {
 private String numeroAgencia;
 private String nomeCinte;
 private String numeroConta;
 private double saldo;

 List<Conta> Conta = new ArrayList<Conta>();
 
 public Conta(String numeroAgencia, String nomeCinte, String numeroConta, double saldo) {
    this.numeroAgencia = numeroAgencia;
    this.nomeCinte = nomeCinte;
    this.numeroConta = numeroConta;
    this.saldo = saldo;
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

}
