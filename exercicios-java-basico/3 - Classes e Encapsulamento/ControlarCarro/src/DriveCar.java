import java.util.Scanner;

public class DriveCar {

    private static final Car car = new Car();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        var option = -1;

        while(true) {
            System.out.println("Selecione a ação desejada:");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar para esquerda/direita");
            System.out.println("6 - Verificar velocidade");
            System.out.println("7 - Trocar a marcha");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> car.startTheCar();
                case 2 -> car.turnOffTheCar();
                case 3 -> car.accelerate();
                case 4 -> car.slowDown();
                case 5 -> car.turnVehicle();
                case 6 -> car.checkSpeed();
                case 7 -> car.switchGear();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida.");
            }
        }

    }

}
