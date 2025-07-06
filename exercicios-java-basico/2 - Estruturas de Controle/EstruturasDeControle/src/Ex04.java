import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Informe o número inicial:");
        var num = sc.nextInt();

        var continuarVerificacao = true;
        while (continuarVerificacao) {
            System.out.println("Informe o número para verificação:");
            var numVerificacao = sc.nextInt();

            if(numVerificacao < num) {
                System.out.printf("Informe um número maior que %d\n", num);
                continue;
            }

            var resultado = numVerificacao % num;
            continuarVerificacao = resultado == 0;
            System.out.printf("%d %% %d = %d\n", numVerificacao, num, resultado);
        }
    }
}
