package br.edu.ifpi.poo.transacao;

public class Transacao {

    private double valor;
    private String tipo;
    private String data;

    public Transacao(double valor, String tipo, String data) {
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "Transacao [data=" + data + ", tipo=" + tipo + ", valor=" + valor + "]";
    }


}
