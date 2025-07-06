public class Gear {

    private int gearNumber;
    private int minSpeed;
    private int maxSpeed;

    public Gear(int gearNumber, int minSpeed, int maxSpeed) {
        this.gearNumber = gearNumber;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
    }

    public int getGearNumber() {
        return gearNumber;
    }

    public void setGearNumber(int gearNumber) {
        this.gearNumber = gearNumber;
    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public void setMinSpeed(int minSpeed) {
        this.minSpeed = minSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Gear{" +
                "gearNumber=" + gearNumber +
                ", minSpeed=" + minSpeed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
