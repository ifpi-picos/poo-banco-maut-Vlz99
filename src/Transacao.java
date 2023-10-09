public class Transacao {
    String data;
    double valor;
    String tipo;

    public Transacao(String data, double valor, String tipo) {
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "data=" + data +
                ", valor=" + valor +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
