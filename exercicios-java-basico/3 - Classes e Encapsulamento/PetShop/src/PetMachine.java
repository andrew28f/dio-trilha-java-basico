public class PetMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeABath() {
        if (this.pet == null) {
            System.out.println("Coloque um pet na máquina.");
            return;
        }

        if (this.pet.isClean()) {
            System.out.println("O pet " + pet.getName() + " já está limpo.");
            return;
        }

        if (water < 10) {
            System.out.println("A máquina não possui água o suficiente para um banho. Adicione água.");
            return;
        } else if (shampoo < 2) {
            System.out.println("A máquina não possui shampoo o suficiente para um banho. Adicione shampoo.");
            return;
        }

        water -= 10;
        shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + this.pet.getName() + " tomou banho e agora está limpo.");
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("A máquina está com a quantidade máxima de água.");
            return;
        }

        water += 2;
        System.out.println("Foram adicionados 2 litros de água.");
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("A máquina está com a quantidade máxima de shampoo.");
            return;
        }

        shampoo += 2;
        System.out.println("Foram adicionados 2 litros de shampoo.");
    }

    public int getWater() {
        return this.water;
    }

    public int getShampoo() {
        return  this.shampoo;
    }

    public Pet getPet() {
        return this.pet;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja, é necessário limpá-la para utilizá-la.");
            return;
        }

        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento.");
            return;
        }

        this.pet = pet;
        System.out.println("O pet " + this.pet.getName() + " foi colocado na máquina.");
    }

    public void removePet() {
        if (!hasPet()) {
            System.out.println("A máquina não possui nenhum pet para remover.");
            return;
        }

        //Máquina fica suja caso o pet retirado esteja não esteja limpo
        this.clean = this.pet.isClean();

        System.out.println("O pet " + this.pet.getName() + " foi retirado.");
        this.pet = null;
    }

    public void setClean() {
        if (clean) {
            System.out.println("A máquina já está limpa.");
            return;
        }

        if (water < 3) {
            System.out.println("A máquina não possui água o suficiente para um banho. Adicione água.");
            return;
        } else if (shampoo < 1) {
            System.out.println("A máquina não possui shampoo o suficiente para um banho. Adicione shampoo.");
            return;
        }

        water -= 3;
        shampoo -= 1;
        this.clean = true;
        System.out.println("A máquina foi limpa.");
    }
}
