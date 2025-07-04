import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        nomeCliente = sc.next();

        System.out.println("Por favor, digite o número da Agência:");
        agencia = sc.next();

        System.out.println("Insira o número da sua conta:");
        numeroConta = sc.nextInt();

        System.out.println("Informe seu saldo:");
        saldo = sc.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d, e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numeroConta, saldo
        );
    }

}
