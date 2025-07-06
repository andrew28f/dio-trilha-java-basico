import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoDigital {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Criação de conta");
        var conta = criarConta();

        int opcao = -1;

        while (true) {
            System.out.println("Selecione a operação desejada:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> conta.consultarSaldo();
                case 2 -> conta.consultarChequeEspecial();
                case 3 -> realizarDeposito(conta);
                case 4 -> realizarSaque(conta);
                case 5 -> conta.pagarBoleto();
                case 6 -> verificarUsoDeChequeEspecial(conta);
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida.");
            }
        }

    }

    public static ContaBancaria criarConta() {
        System.out.println("Insira o número da conta:");
        var numConta = scanner.nextInt();
        System.out.println("Insira o valor inicial a ser depositado:");
        var valorDeposito = scanner.nextDouble();

        var conta = new ContaBancaria(numConta, valorDeposito);
        System.out.println("Conta criada com sucesso.");

        return conta;
    }

    private static void realizarDeposito(ContaBancaria conta) {
        System.out.println("Insira o valor a ser depositado:");
        var valor = scanner.nextDouble();
        conta.depositarDinheiro(valor);
    }

    private static void realizarSaque(ContaBancaria conta) {
        System.out.println("Insira o valor do saque:");
        var valor = scanner.nextDouble();
        conta.sacarDinheiro(valor);
    }

    private static void verificarUsoDeChequeEspecial(ContaBancaria conta) {
        if (conta.isUsandoChequeEspecial())
            System.out.println("A conta está utilizando cheque especial.");
        else
            System.out.println("A conta não está utilizando cheque especial.");
    }

}
