package domain;

public non-sealed class FamilyTicket extends Ticket {

    int numberOfPeople;
    int discount;

    public FamilyTicket(double price, String name, boolean isSubtitled, int numberOfPeople) {
        super(price, name, isSubtitled);
        this.numberOfPeople = numberOfPeople;
        this.discount = numberOfPeople > 3 ? 5 : 0;
    }

    @Override
    public double returnRealPrice() {
        return (price * discount) / 100;
    }

}
