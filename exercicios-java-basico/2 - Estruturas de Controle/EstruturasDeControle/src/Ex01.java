import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira um número para visualizar sua tabuada:");
        var num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }
}
