package domain;

public non-sealed class HalfPriceTicket extends Ticket {

    public HalfPriceTicket(double price, String movieTitle, boolean isSubtitled) {
        super(price, movieTitle, isSubtitled);
    }

    @Override
    public double returnRealPrice() {
        return price * 0.5;
    }

}
