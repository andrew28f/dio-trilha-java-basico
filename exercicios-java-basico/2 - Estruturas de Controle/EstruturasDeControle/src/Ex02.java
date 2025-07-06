import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Insira seu nome:");
        var nome = scanner.nextLine();

        System.out.println("Informe sua altura:");
        var altura = scanner.nextDouble();

        System.out.println("Informe seu peso:");
        var peso = scanner.nextDouble();

        //Cálculo do IMC do usuário
        var imc = peso / (Math.pow(altura, 2));

        //Exibir mensagem de acordo com o resultado
        if (imc <= 18.5) {
            System.out.printf("IMC = %.2f -> Abaixo do peso\n", imc);
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.printf("IMC = %.2f -> Peso ideal\n", imc);
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.printf("IMC = %.2f -> Levemente acima do peso\n", imc);
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.printf("IMC = %.2f -> Obesidade Grau I\n", imc);
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.printf("IMC = %.2f -> Obesidade Grau II (Severa)\n", imc);
        } else if (imc >= 40) {
            System.out.printf("IMC = %.2f -> Obesidade III (Mórbida)\n", imc);
        }
    }
}
