package br.edu.ifpi.poo.conta;
import br.edu.ifpi.poo.cliente.Cliente;
import br.edu.ifpi.poo.notificacoes.Notificacoes;
import br.edu.ifpi.poo.transacao.Transacao;

public class ContaPoupanca extends Conta{
    private double taxaSaque = 0.1;
    private double saldo = 0.0;
    private double taxaTransacao = 0.05;
    private double rendimento = 0.1;
    private Cliente cliente;
    private Notificacoes notificacoes;
    private Transacao transacao;
    
    public ContaPoupanca(String numero, double saldo, Cliente cliente, Notificacoes notificacoes, double taxaSaque,
            double saldo2, double taxaTransacao, double rendimento, Cliente cliente2, Notificacoes notificacoes2,
            Transacao transacao) {
        super(numero, saldo, cliente, notificacoes);
        this.taxaSaque = taxaSaque;
        saldo = saldo2;
        this.taxaTransacao = taxaTransacao;
        this.rendimento = rendimento;
        cliente = cliente2;
        notificacoes = notificacoes2;
        this.transacao = transacao;
    }

    public double getTaxaSaque() {
        return taxaSaque;
    }

    public void setTaxaSaque(double taxaSaque) {
        this.taxaSaque = taxaSaque;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaTransacao() {
        return taxaTransacao;
    }

    public void setTaxaTransacao(double taxaTransacao) {
        this.taxaTransacao = taxaTransacao;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
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

    public void sacar(double valor) {
        double taxa = valor * taxaSaque;
        if (valor + taxa <= saldo) {
            saldo -= valor + taxa;
        } else {
            
        }
    }

        
}
