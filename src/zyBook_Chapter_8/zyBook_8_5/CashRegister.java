package zyBook_Chapter_8.zyBook_8_5;

public class CashRegister {
    private int itemCount;
    private double totalPrice;
    /* Your code goes here */
    private double previous;

    /**
     Adds an item to this cash register.
     @param price the price of this item
     */
    public void addItem(double price)
    {
        itemCount++;
        totalPrice = totalPrice + price;
        previous = price;
    }

    /**
     Undo the last entry.
     */
    public void undo()
    {
        if (previous != 0)
        {
            totalPrice = totalPrice - previous;
            itemCount--;
            /* Your code goes here */
            previous = 0;
        }
    }

    /**
     Makes a payment modifying the totalPrice.
     @param amount the amount paid.
     */
    public void enterPayment(double amount)
    {
        totalPrice = totalPrice - amount;
    }

    /**
     Returns the change.
     @return the change due.
     */
    public double giveChange()
    {
        double change = -totalPrice;
        totalPrice = 0;
        itemCount = 0;
        /* Your code goes here */
        previous = 0;
        return change;
    }

    /**
     Clears the item count and the total.
     */
    public void clear()
    {
        itemCount = 0;
        totalPrice = 0;
        previous = 0;
        /* Your code goes here */
    }
}
