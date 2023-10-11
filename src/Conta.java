import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conta {
    private final String numeroAgencia;
    private final String numeroConta;
    private Cliente cliente;
    private double saldo = 0.0;

    List <Transacao> historicosTransacao;

    
    public Conta(String numeroAgencia, Cliente cliente, String numeroConta, double saldo) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
        this.historicosTransacao = new ArrayList<>();
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public String getNome() {
        return cliente.getNome();
    }

    public void depositar(double valor2) {
        this.saldo += valor2;
        this.addHistoricoTransacao(valor2, "Deposito");
    }

    public void sacar(double valor) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            this.addHistoricoTransacao(valor, "Saque");
        }else{
            System.out.println("saldo insuficiente");
        }
    }

    public void getHistoricosTransacao() {
        for (Transacao transacao : historicosTransacao) {
            System.out.println(transacao);
        }
    }

    public boolean saque(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            this.addHistoricoTransacao(valor*-1, "Saque");
            return true;
        }else{
            return false;
        }
    }

    private void addHistoricoTransacao(double d, String string) {
        Transacao transacao = new Transacao (LocalDate.now(), d, string);
        this.historicosTransacao.add(transacao);
    }
}
