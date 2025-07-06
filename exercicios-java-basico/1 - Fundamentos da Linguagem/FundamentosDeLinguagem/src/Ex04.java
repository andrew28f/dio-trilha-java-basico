import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome da primeira pessoa: ");
        var nome1 = sc.nextLine();

        System.out.println("Insira a idade da primeira pessoa: ");
        var idade1 = sc.nextInt();

        System.out.println("Insira o nome da segunda pessoa: ");
        sc.nextLine(); //Consome quebra de linha
        var nome2 = sc.nextLine();

        System.out.println("Insira a idade da segunda pessoa: ");
        var idade2 = sc.nextInt();

        System.out.printf("%s, %d anos\n", nome1, idade1);
        System.out.printf("%s, %d anos\n", nome2, idade2);
        System.out.printf("Diferença de idade: %d\n", idade1 - idade2);
    }
}
