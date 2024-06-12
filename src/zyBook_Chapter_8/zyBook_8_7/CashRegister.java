package zyBook_Chapter_8.zyBook_8_7;

public class CashRegister {
    /*A constructor initializes the instance variables of an object.
    The constructor is automatically called whenever an object is created with the new operator.
    (Definition of constructor: A sequence of statements for initializing a newly instantiated object.)
     */
    // 在构造函数中初始化变量的值
    //创建实例的时候，可传入argument，然后传入的argument在class中变为private variable的初始值

    /**
     A simulated cash register that tracks the item count and
     the total amount due.
     */

    private int itemCount;
    private double totalPrice;

    /**
     Constructs a cash register with cleared item count and total.
     */
    public CashRegister()
    {
        itemCount = 0;
        totalPrice = 0;
    }

    /**
     Constructs a cash register with cleared item count and total.
     若有输入变量则执行此重构，若无输入变量，则执行上则重构
     */
    public CashRegister(int a, double b)
    {
        itemCount = a;
        totalPrice = b;
    }

    /**
     Adds an item to this cash register.
     @param price the price of this item
     */
    public void addItem(double price)
    {
        itemCount++;
        totalPrice = totalPrice + price;
    }

    /**
     Gets the price of all items in the current sale.
     @return the total amount
     */
    public double getTotal()
    {
        return totalPrice;
    }

    /**
     Gets the number of items in the current sale.
     @return the item count
     */
    public int getCount()
    {
        return itemCount;
    }

    /**
     Clears the item count and the total.
     */
    public void clear()
    {
        itemCount = 0;
        totalPrice = 0;
    }
}
