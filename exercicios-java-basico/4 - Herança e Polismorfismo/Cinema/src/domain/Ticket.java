package domain;

public abstract sealed class Ticket permits HalfPriceTicket, FamilyTicket{

    protected double price;
    protected String movieTitle;
    protected boolean isSubtitled;

    public Ticket(double price, String movieTitle, boolean isSubtitled) {
        this.price = price;
        this.movieTitle = movieTitle;
        this.isSubtitled = isSubtitled;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public boolean isSubtitled() {
        return isSubtitled;
    }

    public void setSubtitled(boolean subtitled) {
        isSubtitled = subtitled;
    }

    public abstract double returnRealPrice();
}
