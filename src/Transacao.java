public class Transacao {
    private double valor;
    private String data;
    private String tipo;
    
    public Transacao(double valor, String data, String tipo) {
        this.valor = valor;
        this.data = data;
        this.tipo = tipo;
    
    }
        public double getValor() {
            return valor;
        }
        
        public String getData() {
            return data;
        }
        
        public String getTipo() {
            return tipo;
            
        
        }
        @Override
        public String toString() {
            return "Transacao [valor=" + valor + ", data=" + data + ", tipo=" + tipo + "]";
        }
}


