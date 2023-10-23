package br.edu.ifpi.poo.conta;
import br.edu.ifpi.poo.cliente.Cliente;
import br.edu.ifpi.poo.notificacoes.Notificacoes;

public abstract class Conta {
    private final String numero;
    private double saldo;
    private Cliente cliente;
    private Notificacoes notificacoes;

    public Conta(String numero, double saldo, Cliente cliente, Notificacoes notificacoes) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
        this.notificacoes = notificacoes;
    }

    public Conta(String numero, double saldo, Cliente cliente, Notificacoes notificacoes) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
        this.notificacoes = notificacoes;
    }

    public void saque(double valor) {
        this.saldo -= valor;
        this.notificacoes.enviaNotificacoes("saque", "hoje", valor);
    }

    public void transacao (Conta destino, double valor) {
        this.saldo -= valor;
        destino.saldo += valor;
        this.notificacoes.enviaNotificacoes("transacao", "hoje", valor);
      
    }

    public String getNumero() {
        return numero;
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
     
}


