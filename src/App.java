import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int operacao;
        Cliente cliente = new Cliente("João", "123456789", "01/01/2000", null);
        ContaPoupanca contaPoupanca = new ContaPoupanca("123", "123", cliente, 0.01, 0.01, 0.01);
        ContaCorrente contaCorrente = new ContaCorrente("123", "123", cliente, 0.01);       

        do {
            System.out.println("***********************************");
            System.out.println("********** Banco Maut *************");
            System.out.println("********** Seja Bem Vindo *********");
            System.out.println("***********************************");
            System.out.println("********** Menu Principal *********");
            System.out.println("********** Escolha uma opção! ******");
            System.out.println("***********************************");
            System.out.println("OBS: Para realizar qualquer operação, é necessário abrir uma conta!");
            System.out.println("********************************************************************");
            System.out.println("1. Abrir Conta");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Transferir");
            System.out.println("5. Extrato");
            System.out.println("6. Sair");

            operacao = input.nextInt();

            if(operacao == 1){
                System.out.println("***********************************");
                System.out.println("********** Abrir Conta ************");
                System.out.println("***********************************");
                System.out.println("********** Escolha uma opção! ******");
                System.out.println("***********************************");
                System.out.println("1. Conta Poupança");
                System.out.println("2. Conta Corrente");
                System.out.println("3. Voltar");
                operacao = input.nextInt();

                if(operacao == 1){
                    contaPoupanca = new ContaPoupanca("123", "123", cliente, 0.01, 0.01, 0.01);
                    System.out.println("***********************************");
                    System.out.println("********** Abrir Conta ************");
                    System.out.println("***********************************");
                    System.out.println("********** Conta Poupança *********");
                    System.out.println("***********************************");
                    System.out.println("Digite o nome do cliente: ");
                    String nome = input.next();
                    System.out.println("Digite o cpf do cliente: ");
                    String cpf = input.next();
                    System.out.println("Digite a data de nascimento do cliente: ");
                    String dataNascimento = input.next();
                    System.out.println("Digite o numero do cliente: ");
                    String numero = input.next();
                    System.out.println("Digite o cep do cliente: ");
                    String cep = input.next();
                    System.out.println("Digite a agencia do cliente: ");
                    String agencia = input.next();
                    System.out.println("Digite o numero da conta do cliente: ");
                    String numeroConta = input.next();
                    System.out.println("Digite o valor do saldo inicial: ");
                    double saldo = input.nextDouble();
                    System.out.println("Parabens, sua conta foi criada com sucesso!");
                }else{
                    contaCorrente = new ContaCorrente("123", "123", cliente, 0.01);
                    System.out.println("***********************************");
                    System.out.println("********** Abrir Conta ************");
                    System.out.println("***********************************");
                    System.out.println("********** Conta Corrente *********");
                    System.out.println("***********************************");
                    System.out.println("Digite o nome do cliente: ");
                    String nome = input.next();
                    System.out.println("Digite o cpf do cliente: ");
                    String cpf = input.next();
                    System.out.println("Digite a data de nascimento do cliente: ");
                    String dataNascimento = input.next();
                    System.out.println("Digite o numero do cliente: ");
                    String numero = input.next();
                    System.out.println("Digite o cep do cliente: ");
                    String cep = input.next();
                    System.out.println("Digite a agencia do cliente: ");
                    String agencia = input.next();
                    System.out.println("Digite o numero da conta do cliente: ");
                    String numeroConta = input.next();
                    System.out.println("Digite o valor do saldo inicial: ");
                    double saldo = input.nextDouble();
                    System.out.println("Parabens, sua conta foi criada com sucesso!");
                }
            }else if(operacao == 2){
                System.out.println("***********************************");
                System.out.println("********** Sacar ******************");
                System.out.println("***********************************");
                System.out.println("********** Escolha uma opção! ******");
                System.out.println("***********************************");
                System.out.println("1. Conta Poupança");
                System.out.println("2. Conta Corrente");
                System.out.println("3. Voltar");
                operacao = input.nextInt();

                if(operacao == 1){
                    System.out.println("***********************************");
                    System.out.println("********** Sacar ******************");
                    System.out.println("***********************************");
                    System.out.println("********** Conta Poupança *********");
                    System.out.println("***********************************");
                    System.out.println("Digite o valor do saque: ");
                    double sacar = input.nextDouble();
                    contaPoupanca.sacar(sacar);
                    System.out.println("Seu saldo " + contaPoupanca.getSaldo());


                }else{
                    System.out.println("***********************************");
                    System.out.println("********** Sacar ******************");
                    System.out.println("***********************************");
                    System.out.println("********** Conta Corrente *********");
                    System.out.println("***********************************");
                    System.out.println("Digite o valor do saque: ");
                    double sacar = input.nextDouble();
                    contaCorrente.sacar(sacar);
                    System.out.println("Saque realizado com sucesso!" + contaCorrente.getSaldo());
                }

            }else if(operacao == 3){
                System.out.println("***********************************");
                System.out.println("********** Depositar **************");
                System.out.println("***********************************");
                System.out.println("********** Escolha uma opção! ******");
                System.out.println("***********************************");
                System.out.println("1. Conta Poupança");
                System.out.println("2. Conta Corrente");
                System.out.println("3. Voltar");
                operacao = input.nextInt();

                if(operacao == 1){
                    System.out.println("***********************************");
                    System.out.println("********** Depositar **************");
                    System.out.println("***********************************");
                    System.out.println("********** Conta Poupança *********");
                    System.out.println("***********************************");
                    System.out.println("Digite o valor do deposito: ");
                    double depositar = input.nextDouble();
                    contaPoupanca.depositar(depositar);
                    System.out.println("Deposito realizado com sucesso!" + contaPoupanca.getSaldo());

                }else{
                    System.out.println("***********************************");
                    System.out.println("********** Depositar **************");
                    System.out.println("***********************************");
                    System.out.println("********** Conta Corrente *********");
                    System.out.println("***********************************");
                    System.out.println("Digite o valor do deposito: ");
                    double depositar = input.nextDouble();
                    contaCorrente.depositar(depositar);
                    System.out.println("Deposito realizado com sucesso!" + contaCorrente.getSaldo());
                }

            }else if(operacao == 4){
                System.out.println("***********************************");
                System.out.println("********** Transferir *************");
                System.out.println("***********************************");
                System.out.println("********** Escolha uma opção! ******");
                System.out.println("***********************************");
                System.out.println("1. Conta Poupança");
                System.out.println("2. Conta Corrente");
                System.out.println("3. Voltar");
                operacao = input.nextInt();

                if(operacao == 1){
                    System.out.println("***********************************");
                    System.out.println("********** Transferir *************");
                    System.out.println("***********************************");
                    System.out.println("********** Conta Poupança *********");
                    System.out.println("***********************************");
                    System.out.println("Digite o valor da transferencia: ");
                    double transferir = input.nextDouble();
                    contaPoupanca.transferir(contaCorrente, transferir);
                    System.out.println("Transferencia realizada com sucesso!" + contaPoupanca.getSaldo());

                }else{
                    System.out.println("***********************************");
                    System.out.println("********** Transferir *************");
                    System.out.println("***********************************");
                    System.out.println("********** Conta Corrente *********");
                    System.out.println("***********************************");
                    System.out.println("Digite o valor da transferencia: ");
                    double transferir = input.nextDouble();
                    contaCorrente.transferir(contaPoupanca, transferir);
                    System.out.println("Transferencia realizada com sucesso!" + contaCorrente.getSaldo());
                }

            }else if(operacao == 5){
                System.out.println("***********************************");
                System.out.println("********** Extrato ****************");
                System.out.println("***********************************");
                System.out.println("********** Escolha uma opção! ******");
                System.out.println("***********************************");
                System.out.println("1. Conta Poupança");
                System.out.println("2. Conta Corrente");
                System.out.println("3. Voltar");
                operacao = input.nextInt();

                if(operacao == 1){
                    System.out.println("***********************************");
                    System.out.println("********** Extrato ****************");
                    System.out.println("***********************************");
                    System.out.println("********** Conta Poupança *********");
                    System.out.println("***********************************");
                    System.out.println("Extrato: ");
                    contaPoupanca.exibirExtrato();

                }else{
                    System.out.println("***********************************");
                    System.out.println("********** Extrato ****************");
                    System.out.println("***********************************");
                    System.out.println("********** Conta Corrente *********");
                    System.out.println("***********************************");
                    System.out.println("Extrato: ");
                    contaCorrente.exibirExtrato();
                }

            }else if(operacao == 6){
                System.out.println("Saindo...");
                break;

                
            }
            
        
        }while(operacao != 6);
    }
}

