import java.util.Scanner;

public class PetShop {

    private static final Scanner scanner = new Scanner(System.in);
    private static final PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        var option = -1;

        while (true) {
            System.out.println("Selecione a operação desejada:");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer com água");
            System.out.println("3 - Abastecer com shampoo");
            System.out.println("4 - Verificar nível de água");
            System.out.println("5 - Verificar nível de shampoo");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na maquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeABath();
                case 2 -> addWaterIntoThePetMachine();
                case 3 -> addShampooIntoThePetMachine();
                case 4 -> checkWaterLevel();
                case 5 -> checkShampooLevel();
                case 6 -> checkIfHasPet();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.setClean();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static void addShampooIntoThePetMachine() {
        petMachine.addShampoo();
        checkShampooLevel();
    }

    private static void addWaterIntoThePetMachine() {
        petMachine.addWater();
        checkWaterLevel();
    }

    private static void checkIfHasPet() {
        if (!petMachine.hasPet()) {
            System.out.println("Nenhum pet está no banho.");
            return;
        }

        System.out.println("O pet " + petMachine.getPet().getName() + " está no banho.");
    }

    private static void setPetInPetMachine() {
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Qual o nome do pet?");
            scanner.nextLine();
            name = scanner.nextLine();
        }
        Pet pet = new Pet(name);
        petMachine.setPet(pet);
    }

    private static void checkWaterLevel() {
        var amount = petMachine.getWater();
        System.out.println("Nível de água atual: " + amount + "L/30L");
    }

    private static void checkShampooLevel() {
        var amount = petMachine.getShampoo();
        System.out.println("Nível de shampoo atual: " + amount + "L/10L");
    }


}
