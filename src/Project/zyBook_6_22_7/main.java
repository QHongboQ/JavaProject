package Project.zyBook_6_22_7;

import java.util.Scanner;

public class main {

    private static Scanner in = new Scanner(System.in);
    public static int NUMBER_ROWS = 9;
    public static final int NUMBER_COLUMNS = 10;

    // Principle function
    public static void main(String[] args) {
        Seats seats = new Seats();
        //System.out.println(seats.returnPrice());
        run(seats);
    }



    public static int menu(){
        int userChoice = 0;
        // prompts user to pick either a seat or a price
        do{
            System.out.println("Please choose 1: Search by seat.");
            System.out.println("              2: Search by price.");
            System.out.print("Your choice(1 or 2) or type 3 to exit: ");
            userChoice = in.nextInt();
        }while (userChoice != 1 && userChoice != 2 && userChoice != 3);
        return userChoice;
    }

    
    /**
     Choice one prompts the user to enter rows (1-9) and columns (1-10).
     Validate them to ensure they are not out of range.
     If rowNumber and columnNumber are valid, call a method searchBySeat with a 2D array, rowNumber, and columnNumber.
     Choice two prompts the user to enter a price.
     It will call a searchByPrice method with a 2D array and a number(price).
     Validate it to be sure it is not out of range ( 10-50, defined as final).
     @param int userChoice
     @return int rowColumn ((row+1)*10 + (column+1))
     **/
    public static int searchSeats(Seats seats, int userChoice){
        if (userChoice == 3)
        {
            System.out.println("Goodbye!");
            System.exit(0);
            return -1;
        }
        else if (userChoice == 1)
        {
            // Define two choices
            int rowNumber  = 0;
            int columnNumber   = 0;

            // Ask user to enter the row number
            do{
                System.out.print("Please enter rows: ");
                rowNumber  = in.nextInt();
            }while ((rowNumber  > 9) || (rowNumber  < 1));

            // Ask user to enter the columns number
            do{
                System.out.print("Please enter columns: ");
                columnNumber   = in.nextInt();
            }while ((columnNumber  > 10) || (columnNumber  < 1));

            // Check the seat is free or not
            if(!seats.getSeats()[rowNumber - 1][columnNumber - 1].isAvailable())
            {
                System.out.println("The seat is taken!");
            }else
            {
                System.out.println("The seat is not taken!");
                System.out.println("The price is " + seats.getSeats()[rowNumber - 1][columnNumber -1].getPrice() + ".");
            }

            // To keep clear where is the choose seat
            rowNumber--;
            columnNumber--;
            return rowNumber*10 + columnNumber;
        }
        else{
            // Ask user to enter the price
            int price = -1;
            boolean correctPrice = false;

            while (!correctPrice) {
                System.out.print("Please enter price: ");
                price = in.nextInt();
                for (int i = 0; i < seats.prices.size(); i++) {
                    if (price == seats.prices.get(i)) {
                        correctPrice = true;
                        break;
                    }
                }
            }

            // According to the price search the seat
            int rowColumn = searchByPrice(seats, price);

            // Check the seat is free
            if(rowColumn == -1)
            {
                // When all seat is sold out
                // return one more time menu() and go back to this function
                System.out.println("All seat whose price is " + price + " is sold out!");
                System.out.println("Please change your choice!");
                seats.display();
                userChoice = menu();
                rowColumn = searchSeats(seats,userChoice);//recursion
            }
            return rowColumn;
        }
    }
    


    /**
     Read the user’s input. 1 means seat, 2 means price, use a while() loop to keep asking the user for the correct input 1 or 2.
     @param int[][] priceArray
     @param int rowColumn
     @return String price(-1  error, 0 the seat is taken, price means the seat is available)
     **/
    public int searchBySeat(Seats seats, int rowNumber, int columnNumber){
        // Keep the rowNumber and columnNumber is in the range of index of array
        rowNumber--;
        columnNumber--;
        if (seats.getSeats()[rowNumber][columnNumber].isAvailable())
        {
            return  0;
        }else
        {
            int price = seats.getSeats()[rowNumber][columnNumber].getPrice();
            seats.getSeats()[rowNumber][columnNumber].setAvailable(false);
            return price;
        }
    }

    /**
     Read the user’s input. 1 means seat, 2 means price, use a while() loop to keep asking the user for the correct input 1 or 2.
     @param int[][] priceArray
     @return int rowColumn
     **/
    public static int searchByPrice(Seats seats, int price){
        // counter row numbers
        for (int i = 0; i < NUMBER_ROWS; i++) {
            // counter column numbers
            for (int j = 0; j < NUMBER_COLUMNS; j++) {
                 if(seats.getSeats()[i][j].getPrice() == price && seats.getSeats()[i][j].isAvailable())
                 {
                    return (i) * 10 + (j);
                 }
            }
        }
        return -1;
    }

    /**
     Calculate row and column based on 2-digit number row column
     Validate that the row and column are in the range. If not in range, return false
     set the value of a cell in the row and column to zero
     @param int[][] priceArray
     @param int rowColumn
     @return true or false
     **/

    public static boolean sellSeat(Seats seats, int rowColumn){
        int row = 0;
        int column = 0;

        if(rowColumn != 0)        
        {
            row = (rowColumn / 10);
            column = (rowColumn % 10);
        }

        if((row <= NUMBER_ROWS) && (column <= NUMBER_COLUMNS) )
        {
            seats.takeSeat(row, column);
            return true;
        }

        return false;
    }


    public static void run(Seats seats){
        int totalSeatsSold = 0;
        // Util all seats is sold, break the loop
        while (totalSeatsSold < NUMBER_ROWS * NUMBER_COLUMNS)
        {
            // Display the array
            seats.display();
            // prompts user to pick either a seat or a price
            int userChoice = menu();
            int rowColumn = searchSeats(seats,userChoice);
            boolean sell = sellSeat(seats,rowColumn);

            if (sell)
            {
                totalSeatsSold++;
            }
        }

    }
    
}
