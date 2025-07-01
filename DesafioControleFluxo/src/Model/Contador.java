package Model;

import Exceptions.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro paramêtro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo paramêtro:");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException ex) {
            throw new ParametrosInvalidosException(ex.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //Valida se o parametroUm é maior que o parametroDois e lança a exceção
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo paramêtro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;
        //Realizar a contagem de números conforme variável contagem
        for(int i = 0; i < contagem; i++) {
            System.out.printf("Imprimindo o número %d\n", i + 1);
        }
    }
}
