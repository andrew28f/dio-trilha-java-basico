import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da base do retângulo: ");
        var base = sc.nextDouble();

        System.out.println("Insira o valor da altura do retângulo: ");
        var altura = sc.nextDouble();

        System.out.printf("Um retângulo de base %.2f e altura %.2f tem uma área de valor %.2f\n", base, altura, base*altura);
    }
}
