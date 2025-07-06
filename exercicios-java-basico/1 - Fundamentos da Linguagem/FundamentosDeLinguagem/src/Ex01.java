import java.time.OffsetDateTime;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        var anoAtual = OffsetDateTime.now().getYear();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        var nome = sc.nextLine();

        System.out.println("Insira seu ano de nascimento: ");
        var anoNascimento = sc.nextInt();

        var idade = anoAtual - anoNascimento;

        System.out.printf("Olá, %s, sua idade é %d!\n", nome, idade);
    }
}
