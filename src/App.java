import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int operacao;
        Cliente cliente = new Cliente(null, null, null, null);
        ContaPoupanca contaPoupanca =
                new ContaPoupanca(null, null, cliente, 0.01, 0.01, 0.01, 0, new NotificacaoSms());
        ContaCorrente contaCorrente =
                new ContaCorrente(null, null, cliente, 0.01, 0, new NotificacaoEmail());

        contaCorrente.depositar(100);
        contaCorrente.exibirExtrato();// não está exibindo o extrado. Está exibindo o saldo atual
        contaCorrente.sacar(50);
        contaCorrente.exibirExtrato();// não está exibindo o extrado. Está exibindo o saldo atual
        // contaCorrente.transferir(contaPoupanca, 10);
        // contaCorrente.transferir(contaPoupanca, 10);
        // contaCorrente.transferir(contaPoupanca, 10);
        // contaCorrente.transferir(contaPoupanca, 10);
        // contaCorrente.transferir(contaPoupanca, 10);
        // contaCorrente.transferir(contaPoupanca, 20);
        contaCorrente.exibirExtrato(); // resultado aqui está incorreto


        contaPoupanca.exibirExtrato();// não está exibindo o extrado. Está exibindo o saldo atual
        contaPoupanca.depositar(100);
        contaPoupanca.exibirExtrato();
        contaPoupanca.sacar(10); // calculo da taxa parece errada
        contaPoupanca.exibirExtrato(); // não está exibindo o extrado. Está exibindo o saldo atual


    }
}

