package Cinema;

public class SeatDetails {
    private boolean sold; //indicates whether seat has been sold or not
    private float price;

    public SeatDetails(boolean sold, float price) {
        this.sold = sold;
        this.price = price;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isSold() {
        return sold;
    }

    public float getPrice() {
        return price;
    }

    public String toString(){
        if (isSold())
            return " Avail "+getPrice();
        else
            return "  Booked! "+getPrice();
    }
}
