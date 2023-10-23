package br.edu.ifpi.poo.notificacoes;

public class NotificacoesEmail implements Notificacoes {
    @Override
    public void enviaNotificacoes(String tipo, String data, double valor) {
        System.out.println("Enviando notificacao por email");
        System.out.println("Tipo: " + tipo);
        System.out.println("Data: " + data);
        System.out.println("Valor: " + valor);
    }

}


