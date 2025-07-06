import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o tamanho do lado do quadrado: ");
        var lado = sc.nextDouble();

        System.out.printf("A área de um quadrado de lado %.2f é %.2f\n", lado, Math.pow(lado, 2));
    }
}
