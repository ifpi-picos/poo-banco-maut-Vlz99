import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Conta> contas = new ArrayList<Conta>();

        while (true) {
            System.out.print("Digite o seu nome: ");
            String nome = scanner.next();

            System.out.print("Digite o número da conta: ");
            String numeroConta = scanner.next();

            Endereco endereco = new Endereco("", "", "", "", "");
            Cliente cliente = new Cliente(nome, "", "", endereco);
            Conta conta = new Conta(numeroConta, cliente, numeroConta, 0);
            contas.add(conta);

            boolean aux = true;

            while (aux) {
                System.out.println(cliente.getNome() + ", o que você deseja?");
                System.out.println("1- SACAR");
                System.out.println("2- DEPOSITAR");
                System.out.println("3- EXTRATO");
                System.out.println("4- TRANSFERIR");
                System.out.println("5- SAIR");

                int opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite o valor que você quer sacar: ");
                        double valor = scanner.nextDouble();
                        conta.sacar(valor);
                        break;
                    case 2:
                        System.out.println("Digite o valor que você quer depositar: ");
                        double valor2 = scanner.nextDouble();
                        conta.depositar(valor2);
                        break;
                    case 3:
                        System.out.println("Extrato: ");
                        conta.getHistoricosTransacao();
                        break;
                    case 4:
                        System.out.print("Digite o número da conta de destino: ");
                        String numeroContaDestino = scanner.next();
                        Conta contaDestino = null;
                        for (Conta c : contas) {
                            if (c.getNumeroConta().equals(numeroContaDestino)) {
                                contaDestino = c;
                                break;
                            }
                        }
                        if (contaDestino != null) {
                            System.out.println("Digite o valor que você deseja transferir: ");
                            double valorTransferencia = scanner.nextDouble();
                            conta.transferir(contaDestino, valorTransferencia);
                        } else {
                            System.out.println("Conta de destino não encontrada.");
                        }
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        aux = false;
                        break;
                    default:
                        System.out.println("Opção inválida ou saldo insuficiente.");
                }
            }

            System.out.print("Digite 0 para parar ou 1 para continuar: ");
            int op = scanner.nextInt();
            if (op == 0) {
                System.out.println("Número de contas criadas: " + contas.size());
                scanner.close();
                break;
            }
        }
    }
}
