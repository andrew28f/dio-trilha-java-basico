import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car {

    private int speed;
    private Gear currentGear;
    private static final List<Gear> gears = new ArrayList<>();
    private boolean engineOn;

    public Car() {
        this.speed = 0;
        this.engineOn = false;
        generateGears();
        this.currentGear = gears.getFirst();
    }

    private void generateGears() {
        gears.add(new Gear(0, 0, 0));
        gears.add(new Gear(1, 0, 20));
        gears.add(new Gear(2, 21, 40));
        gears.add(new Gear(3, 41, 60));
        gears.add(new Gear(4, 61, 80));
        gears.add(new Gear(5, 81, 100));
        gears.add(new Gear(6, 101, 120));
    }

    public void startTheCar() {
        if (!engineOn) {
            engineOn = true;
            System.out.println("Carro ligado.");
        } else System.out.println("O carro já está ligado.");
    }

    public void turnOffTheCar() {
        if (!engineOn) {
            System.out.println("O carro já está desligado.");
            return;
        }

        if (currentGear.getGearNumber() == 0){
            engineOn = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("O carro deve estar em porto morto (marcha 0) para ser desligado.");
        }
    }

    public void accelerate() {
        if (!engineOn) {
            System.out.println("Ligue o carro para realizar alguma ação.");
            return;
        }

        if (speed < currentGear.getMaxSpeed()) {
            speed++;
            System.out.println("O carro acelerou 1km.");
        } else System.out.println("Troque a marcha para acelerar o carro.");
    }

    public void slowDown() {
        if (!engineOn) {
            System.out.println("Ligue o carro para realizar alguma ação.");
            return;
        }

        if (speed > currentGear.getMinSpeed()) {
            speed--;
            System.out.println("O carro desacelerou 1km.");
        } else System.out.println("Troque a marcha para desacelerar o carro.");

    }

    public String turnToSide() {
        var scanner = new Scanner(System.in);
        System.out.println("Para qual lado deseja virar o veículo? (e/d)");
        var side = scanner.next();
        var sideExtendedString = "";
        if (side.equalsIgnoreCase("e"))  sideExtendedString = "esquerda";
        else if (side.equalsIgnoreCase("d")) sideExtendedString = "direita";
        return sideExtendedString;
    }

    public void turnVehicle() {
        if (!engineOn) {
            System.out.println("Ligue o carro para realizar alguma ação.");
            return;
        }

        var side = turnToSide();
        if (speed >= 1 && speed <= 40) {
            System.out.println("O carro virou para a " + side);
        } else System.out.println("O carro deve estar entre 1km/h e 40km/h para virar.");
    }

    public void checkSpeed() {
        if (!engineOn) {
            System.out.println("Ligue o carro para realizar alguma ação.");
            return;
        }

        System.out.println("Velocidade atual do carro: " + speed + "km/h");
    }

    public void switchGear() {
        if (!engineOn) {
            System.out.println("Ligue o carro para realizar alguma ação.");
            return;
        }

        if (speed == currentGear.getMaxSpeed()) {
            var currentGearNumber = currentGear.getGearNumber();
            currentGear = gears.get(++currentGearNumber);
            speed++;
            System.out.println("Trocou para a " + currentGear.getGearNumber() + "° marcha.");
        } else if (speed == currentGear.getMinSpeed()) {
            var currentGearNumber = currentGear.getGearNumber();
            currentGear = gears.get(--currentGearNumber);
            //Verifica se a velocidade é zero, se for, não decrementa e apenas imprime a mensagem
            if (speed == 0) {
                System.out.println("Trocou a marcha para ponto morto (marcha 0).");
            }
            speed--;
            System.out.println("Trocou para a " + currentGear.getGearNumber() + "° marcha.");
        } else {
            System.out.println("Não é possível trocar a marcha na sua velocidade atual.");
            System.out.println("Velocidade para aumentar a marcha: " + currentGear.getMaxSpeed() + "km/h");
            System.out.println("Velocidade para diminuir a marcha: " + currentGear.getMinSpeed() + "km/h");
        }
    }

}
