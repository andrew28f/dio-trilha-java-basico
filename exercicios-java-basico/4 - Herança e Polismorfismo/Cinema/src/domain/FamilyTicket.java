package domain;

public non-sealed class FamilyTicket extends Ticket {

    private int numberOfPeople;
    private final double discount;

    public FamilyTicket(double price, String name, boolean isSubtitled, int numberOfPeople) {
        super(price, name, isSubtitled);
        this.numberOfPeople = numberOfPeople;
        this.discount = numberOfPeople > 3 ? price * 0.05 : 0;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public double returnRealPrice() {
        return (price - discount) * numberOfPeople ;
    }

}
