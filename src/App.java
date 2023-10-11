import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = var.next();
        System.out.print("Digite o seu cpf: ");
        String cpf = var.next();
        System.out.print("Digite a sua data de nascimento: ");
        String dn = var.next();
        System.out.print("Digite a sua rua: ");
        String rua = var.next();
        System.out.print("Digite o seu cep: ");
        String cep = var.next();
        System.out.print("Digite o seu bairro: ");
        String bairro = var.next();
        System.out.print("Digite a sua cidade: ");
        String cidade = var.next();
        System.out.print("Digite o seu estado: ");
        String estado = var.next();

        Endereco endereco = new Endereco(rua, cep, bairro, cidade, estado);
        Cliente client = new Cliente(nome, cpf, dn, endereco);
        Conta conta = new Conta("000", client, "000", 0);

        String a = conta.getNome();
        boolean aux = true;

        while (aux == true){
            System.out.print(a);
            
            System.out.println(" O QUE VOCE DESEJA?");
            System.out.println("1- SACAR");
            System.out.println("2- DEPOSITAR");
            System.out.println("3- EXTRATO");
            System.out.println("4- SAIR");
            
            int opcao = var.nextInt();
            switch (opcao) {
            case 1:
                System.out.println("Digite o valor que voce quer sacar: ");
                double valor = var.nextDouble();
                conta.sacar(valor);
                break;
                case 2:
                System.out.println("Digite o valor que voce quer depositar: ");
                double valor2 = var.nextDouble();
                conta.depositar(valor2);
                break;
                case 3:
                System.out.println( "extrato: ");
                conta.getHistoricosTransacao();
                break;
                case 4:
                System.out.println("Saindo...");
                aux = false;
                break;
                default:
                System.out.println("Opcao invalida!");
                
            }
        }
        var.close();
    }
    
}