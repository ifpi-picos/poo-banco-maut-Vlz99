package br.edu.ifpi.poo.conta;
import br.edu.ifpi.poo.cliente.Cliente;
import br.edu.ifpi.poo.notificacoes.Notificacoes;
import br.edu.ifpi.poo.transacao.Transacao;

public class ContaCorrente extends Conta {
    private double taxa = 0.1;
    private double saldo = 0.0;
    private Cliente cliente;
    private Notificacoes notificacoes;
    private Transacao transacao;
   
   
    public ContaCorrente(String numero, double saldo, Cliente cliente, Notificacoes notificacoes, double taxa,
            double saldo2, Cliente cliente2, Notificacoes notificacoes2, Transacao transacao) {
        super(numero, saldo, cliente, notificacoes);
        this.taxa = taxa;
        saldo = saldo2;
        cliente = cliente2;
        notificacoes = notificacoes2;
        this.transacao = transacao;
    }


    public double getTaxa() {
        return taxa;
    }


    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public Notificacoes getNotificacoes() {
        return notificacoes;
    }


    public void setNotificacoes(Notificacoes notificacoes) {
        this.notificacoes = notificacoes;
    }


    public Transacao getTransacao() {
        return transacao;
    }


    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }

}

