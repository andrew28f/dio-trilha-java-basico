import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        var primeiroNum = scanner.nextInt();

        System.out.println("Informe o segundo número:");
        var segundoNum = scanner.nextInt();

        //Verifica se o segundo número é maior que o primeiro
        while (segundoNum <= primeiroNum) {
            System.out.printf("Informe um número maior que %d:\n", primeiroNum);
            segundoNum = scanner.nextInt();
        }

        System.out.println("Você deseja visualizar os números pares ou ímpares? (p/i)");
        var opcao = scanner.next();

        // Verifica se a opção é inválida
        while (!opcao.equalsIgnoreCase("p") && !opcao.equalsIgnoreCase("i")) {
            System.out.println("Opção Inválida. Escolha entre as opções pares ou ímpares para visualizar (p/i)");
            opcao = scanner.next();
        }

        if (opcao.equalsIgnoreCase("p")) {
            //Imprime os números pares em ordem decrescente
            for(int i = segundoNum; i >= primeiroNum; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else if (opcao.equalsIgnoreCase("i")){
            //Imprime os números ímpares em ordem decrescente
            for(int i = segundoNum; i >= primeiroNum; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
