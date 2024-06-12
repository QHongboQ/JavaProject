package Project.zyBook_6_22_7;

public class Seat{
    private int price;
    private boolean available;

    public Seat(int price){
        this.price = price;
        this.available = true;
    }

    public int getPrice(){
        return price;
    }

    public boolean isAvailable(){
        return available;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }

    
}