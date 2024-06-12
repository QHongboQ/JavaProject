package zyBook_Chapter_8.zyBook_8_5;

public class zyBook_8_5_1 {
    /*
    Definition of public interface:
    The features (methods, variables, and nested types) of a class that are accessible to all clients.
     */

    /*
    Definition of instance variable:
    A variable defined in a class for which every object of the class has its own value.
     */

    /*
    The instance variables are declared in the class,
    but outside any methods, with the private modifier
     */
    public static void main(String[] args)
    {
        CashRegister reg = new CashRegister();
        reg.addItem(12.50);
        reg.addItem(5.65);
        reg.addItem(7.23);
        reg.undo();
        reg.addItem(7.25);
        reg.enterPayment(20);
        reg.enterPayment(10);
        double change = reg.giveChange();
        System.out.printf("Change: %.2f%n", change);
        System.out.println("Expected: 4.60");

        reg.clear();
        reg.undo(); // Should have no effect
        reg.addItem(5.75);
        reg.addItem(25.00);
        reg.undo();
        reg.undo(); // Should have no effect
        reg.addItem(24.99);
        reg.addItem(2.25);
        reg.addItem(16.72);
        reg.enterPayment(60);
        change = reg.giveChange();
        reg.undo(); // Should have no effect
        double change2 = reg.giveChange();
        System.out.printf("Change: %.2f %.2f%n", change, change2);
        System.out.println("Expected: 10.29 0.00");
    }
}
