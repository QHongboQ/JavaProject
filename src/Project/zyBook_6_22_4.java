 package Project;
import java.util.Arrays;
import java.util.Random;

public class zyBook_6_22_4 {
    /*
    Runs Methods
    Runs each of the methods and creates final and changeable variables
    */
    public static void main(String[] args)
    {
        final int MAX_NUMBER=44;
        final int MAX =9;
        final int MIN =1;
        int[] lookupArray = new int[MAX];
        lookupArray=createLookupArray(lookupArray, MAX, MIN);
        int[] cardHand=createRandomCardHand(MAX_NUMBER);
        while(!Arrays.equals(lookupArray,cardHand))
        {
            System.out.println(Arrays.toString(cardHand));
            for(int i = 0; i < cardHand.length; i++)
            {
                cardHand[i]--;
            }
            cardHand=resizeArray(cardHand);
            cardHand[cardHand.length-1]=cardHand.length-1;
            boolean haszero=false;
            for(int i=0;i<cardHand.length;i++)
            {
                if(cardHand[i] == 0)
                {
                    haszero = true;
                }
            }
            while(haszero)
            {
                cardHand=removeCell(cardHand);
                haszero = false;
                for(int i=0;i<cardHand.length;i++)
                {
                    if(cardHand[i] == 0)
                    {
                        haszero = true;
                    }
                }
            }

        }
        System.out.println(Arrays.toString(cardHand));
    }

    /**
     Creates Card Hand
     Create a card hand by taking the max number and finding a random number under it and adding it to the array until max number reaches zero, resize if necessary
     @param int MAX_NUMBER
     @return int[] Cardhand
     **/
    public static int[] createRandomCardHand (int MAX_NUMBER)
    {
        int maxNum=MAX_NUMBER;
        Random random = new Random();
        int[] cardHand= new int[1];
        int counter=0;
        while(maxNum + 1 > 0)
        {
            int num=0;
            if(maxNum<2)num=1;
            else num=random.nextInt(Math.abs(maxNum)+1);
            cardHand[counter]=num;
            maxNum=maxNum-num;
            cardHand = resizeArray(cardHand);
            counter++;
        }
        while(cardHand[cardHand.length-1]==0)
        {
        cardHand=removeCell(cardHand);
        }
        return cardHand;
    }


    /**
     Resize Array
     Check the element of the array is less than 10, if not, increase the length to 45.
     @param int[] array containing the random element
     @return  int[] array
     **/
    public static int[]  resizeArray(int[] handArray)
    {
        int[] resizedarray= new int[handArray.length+1];
        for(int i=0;i<handArray.length;i++)
        {
            resizedarray[i]=handArray[i];
        }
         return resizedarray;
    }

    /**
     Removes Zeros
     Takes in an array and loops through it and  removes any of the zeros contained in the array.
     @param integer[] handArray
     @return integer[] noZeroArray
     **/
    public static int[] removeCell (int[] handArray)
    {
        boolean hasZero=false;
        int[] noZeroArray=new int[handArray.length-1];
        int buffer=0;
        for(int i=0;i<handArray.length;i++)
        {
            if(handArray[i]==0)
            {
                hasZero=true;
                buffer++;
            }
            else noZeroArray[i-buffer]=handArray[i];
        }
        if(hasZero)return noZeroArray;
        else return handArray;
    }

    /**
     Create Check Array
     This method will receive an array, minimum, and maximum number. It creates an array starting with minimum and ending with maximum. In our example, it will create an array from 1-9.
     @param int[] lookupArray
     @param int max
     @param int min
     @return int[] lookupArray
     **/
    public static  int[]  createLookupArray (int[] lookupArray,int max,int min)
    {
        int[] lookuparray=new int[max];
        for(int i = min;i <= max;i++)
        {
            lookuparray[i-1]=i;
        }
        return lookuparray;
    }

}
/** SIMPLE 1:
 * [13, 26, 2, 1, 1, 1, 1]
 * [12, 25, 1, 7]
 * [11, 24, 6, 4]
 * [10, 23, 5, 3, 4]
 * [9, 22, 4, 2, 3, 5]
 * [8, 21, 3, 1, 2, 4, 6]
 * [7, 20, 2, 1, 3, 5, 7]
 * [6, 19, 1, 2, 4, 6, 7]
 * [5, 18, 1, 3, 5, 6, 7]
 * [4, 17, 2, 4, 5, 6, 7]
 * [3, 16, 1, 3, 4, 5, 6, 7]
 * [2, 15, 2, 3, 4, 5, 6, 8]
 * [1, 14, 1, 2, 3, 4, 5, 7, 8]
 * [13, 1, 2, 3, 4, 6, 7, 9]
 * [12, 1, 2, 3, 5, 6, 8, 8]
 * [11, 1, 2, 4, 5, 7, 7, 8]
 * [10, 1, 3, 4, 6, 6, 7, 8]
 * [9, 2, 3, 5, 5, 6, 7, 8]
 * [8, 1, 2, 4, 4, 5, 6, 7, 8]
 * [7, 1, 3, 3, 4, 5, 6, 7, 9]
 * [6, 2, 2, 3, 4, 5, 6, 8, 9]
 * [5, 1, 1, 2, 3, 4, 5, 7, 8, 9]
 * [4, 1, 2, 3, 4, 6, 7, 8, 10]
 * [3, 1, 2, 3, 5, 6, 7, 9, 9]
 * [2, 1, 2, 4, 5, 6, 8, 8, 9]
 * [1, 1, 3, 4, 5, 7, 7, 8, 9]
 * [2, 3, 4, 6, 6, 7, 8, 9]
 * [1, 2, 3, 5, 5, 6, 7, 8, 8]
 * [1, 2, 4, 4, 5, 6, 7, 7, 9]
 * [1, 3, 3, 4, 5, 6, 6, 8, 9]
 * [2, 2, 3, 4, 5, 5, 7, 8, 9]
 * [1, 1, 2, 3, 4, 4, 6, 7, 8, 9]
 * [1, 2, 3, 3, 5, 6, 7, 8, 10]
 * [1, 2, 2, 4, 5, 6, 7, 9, 9]
 * [1, 1, 3, 4, 5, 6, 8, 8, 9]
 * [2, 3, 4, 5, 7, 7, 8, 9]
 * [1, 2, 3, 4, 6, 6, 7, 8, 8]
 * [1, 2, 3, 5, 5, 6, 7, 7, 9]
 * [1, 2, 4, 4, 5, 6, 6, 8, 9]
 * [1, 3, 3, 4, 5, 5, 7, 8, 9]
 * [2, 2, 3, 4, 4, 6, 7, 8, 9]
 * [1, 1, 2, 3, 3, 5, 6, 7, 8, 9]
 * [1, 2, 2, 4, 5, 6, 7, 8, 10]
 * [1, 1, 3, 4, 5, 6, 7, 9, 9]
 * [2, 3, 4, 5, 6, 8, 8, 9]
 * [1, 2, 3, 4, 5, 7, 7, 8, 8]
 * [1, 2, 3, 4, 6, 6, 7, 7, 9]
 * [1, 2, 3, 5, 5, 6, 6, 8, 9]
 * [1, 2, 4, 4, 5, 5, 7, 8, 9]
 * [1, 3, 3, 4, 4, 6, 7, 8, 9]
 * [2, 2, 3, 3, 5, 6, 7, 8, 9]
 * [1, 1, 2, 2, 4, 5, 6, 7, 8, 9]
 * [1, 1, 3, 4, 5, 6, 7, 8, 10]
 * [2, 3, 4, 5, 6, 7, 9, 9]
 * [1, 2, 3, 4, 5, 6, 8, 8, 8]
 * [1, 2, 3, 4, 5, 7, 7, 7, 9]
 * [1, 2, 3, 4, 6, 6, 6, 8, 9]
 * [1, 2, 3, 5, 5, 5, 7, 8, 9]
 * [1, 2, 4, 4, 4, 6, 7, 8, 9]
 * [1, 3, 3, 3, 5, 6, 7, 8, 9]
 * [2, 2, 2, 4, 5, 6, 7, 8, 9]
 * [1, 1, 1, 3, 4, 5, 6, 7, 8, 9]
 * [2, 3, 4, 5, 6, 7, 8, 10]
 * [1, 2, 3, 4, 5, 6, 7, 9, 8]
 * [1, 2, 3, 4, 5, 6, 8, 7, 9]
 * [1, 2, 3, 4, 5, 7, 6, 8, 9]
 * [1, 2, 3, 4, 6, 5, 7, 8, 9]
 * [1, 2, 3, 5, 4, 6, 7, 8, 9]
 * [1, 2, 4, 3, 5, 6, 7, 8, 9]
 * [1, 3, 2, 4, 5, 6, 7, 8, 9]
 * [2, 1, 3, 4, 5, 6, 7, 8, 9]
 * [1, 2, 3, 4, 5, 6, 7, 8, 9]
 *
 *SIMPLE 2:
 *[16, 18, 7, 3, 1]
 * [15, 17, 6, 2, 5]
 * [14, 16, 5, 1, 4, 5]
 * [13, 15, 4, 3, 4, 6]
 * [12, 14, 3, 2, 3, 5, 6]
 * [11, 13, 2, 1, 2, 4, 5, 7]
 * [10, 12, 1, 1, 3, 4, 6, 8]
 * [9, 11, 2, 3, 5, 7, 8]
 * [8, 10, 1, 2, 4, 6, 7, 7]
 * [7, 9, 1, 3, 5, 6, 6, 8]
 * [6, 8, 2, 4, 5, 5, 7, 8]
 * [5, 7, 1, 3, 4, 4, 6, 7, 8]
 * [4, 6, 2, 3, 3, 5, 6, 7, 9]
 * [3, 5, 1, 2, 2, 4, 5, 6, 8, 9]
 * [2, 4, 1, 1, 3, 4, 5, 7, 8, 10]
 * [1, 3, 2, 3, 4, 6, 7, 9, 10]
 * [2, 1, 2, 3, 5, 6, 8, 9, 9]
 * [1, 1, 2, 4, 5, 7, 8, 8, 9]
 * [1, 3, 4, 6, 7, 7, 8, 9]
 * [2, 3, 5, 6, 6, 7, 8, 8]
 * [1, 2, 4, 5, 5, 6, 7, 7, 8]
 * [1, 3, 4, 4, 5, 6, 6, 7, 9]
 * [2, 3, 3, 4, 5, 5, 6, 8, 9]
 * [1, 2, 2, 3, 4, 4, 5, 7, 8, 9]
 * [1, 1, 2, 3, 3, 4, 6, 7, 8, 10]
 * [1, 2, 2, 3, 5, 6, 7, 9, 10]
 * [1, 1, 2, 4, 5, 6, 8, 9, 9]
 * [1, 3, 4, 5, 7, 8, 8, 9]
 * [2, 3, 4, 6, 7, 7, 8, 8]
 * [1, 2, 3, 5, 6, 6, 7, 7, 8]
 * [1, 2, 4, 5, 5, 6, 6, 7, 9]
 * [1, 3, 4, 4, 5, 5, 6, 8, 9]
 * [2, 3, 3, 4, 4, 5, 7, 8, 9]
 * [1, 2, 2, 3, 3, 4, 6, 7, 8, 9]
 * [1, 1, 2, 2, 3, 5, 6, 7, 8, 10]
 * [1, 1, 2, 4, 5, 6, 7, 9, 10]
 * [1, 3, 4, 5, 6, 8, 9, 9]
 * [2, 3, 4, 5, 7, 8, 8, 8]
 * [1, 2, 3, 4, 6, 7, 7, 7, 8]
 * [1, 2, 3, 5, 6, 6, 6, 7, 9]
 * [1, 2, 4, 5, 5, 5, 6, 8, 9]
 * [1, 3, 4, 4, 4, 5, 7, 8, 9]
 * [2, 3, 3, 3, 4, 6, 7, 8, 9]
 * [1, 2, 2, 2, 3, 5, 6, 7, 8, 9]
 * [1, 1, 1, 2, 4, 5, 6, 7, 8, 10]
 * [1, 3, 4, 5, 6, 7, 9, 10]
 * [2, 3, 4, 5, 6, 8, 9, 8]
 * [1, 2, 3, 4, 5, 7, 8, 7, 8]
 * [1, 2, 3, 4, 6, 7, 6, 7, 9]
 * [1, 2, 3, 5, 6, 5, 6, 8, 9]
 * [1, 2, 4, 5, 4, 5, 7, 8, 9]
 * [1, 3, 4, 3, 4, 6, 7, 8, 9]
 * [2, 3, 2, 3, 5, 6, 7, 8, 9]
 * [1, 2, 1, 2, 4, 5, 6, 7, 8, 9]
 * [1, 1, 3, 4, 5, 6, 7, 8, 10]
 * [2, 3, 4, 5, 6, 7, 9, 9]
 * [1, 2, 3, 4, 5, 6, 8, 8, 8]
 * [1, 2, 3, 4, 5, 7, 7, 7, 9]
 * [1, 2, 3, 4, 6, 6, 6, 8, 9]
 * [1, 2, 3, 5, 5, 5, 7, 8, 9]
 * [1, 2, 4, 4, 4, 6, 7, 8, 9]
 * [1, 3, 3, 3, 5, 6, 7, 8, 9]
 * [2, 2, 2, 4, 5, 6, 7, 8, 9]
 * [1, 1, 1, 3, 4, 5, 6, 7, 8, 9]
 * [2, 3, 4, 5, 6, 7, 8, 10]
 * [1, 2, 3, 4, 5, 6, 7, 9, 8]
 * [1, 2, 3, 4, 5, 6, 8, 7, 9]
 * [1, 2, 3, 4, 5, 7, 6, 8, 9]
 * [1, 2, 3, 4, 6, 5, 7, 8, 9]
 * [1, 2, 3, 5, 4, 6, 7, 8, 9]
 * [1, 2, 4, 3, 5, 6, 7, 8, 9]
 * [1, 3, 2, 4, 5, 6, 7, 8, 9]
 * [2, 1, 3, 4, 5, 6, 7, 8, 9]
 * [1, 2, 3, 4, 5, 6, 7, 8, 9]
 *
 * SIMPLE 3:
 * [40, 1, 2, 1, 1]
 * [39, 1, 5]
 * [38, 4, 3]
 * [37, 3, 2, 3]
 * [36, 2, 1, 2, 4]
 * [35, 1, 1, 3, 5]
 * [34, 2, 4, 5]
 * [33, 1, 3, 4, 4]
 * [32, 2, 3, 3, 5]
 * [31, 1, 2, 2, 4, 5]
 * [30, 1, 1, 3, 4, 6]
 * [29, 2, 3, 5, 6]
 * [28, 1, 2, 4, 5, 5]
 * [27, 1, 3, 4, 4, 6]
 * [26, 2, 3, 3, 5, 6]
 * [25, 1, 2, 2, 4, 5, 6]
 * [24, 1, 1, 3, 4, 5, 7]
 * [23, 2, 3, 4, 6, 7]
 * [22, 1, 2, 3, 5, 6, 6]
 * [21, 1, 2, 4, 5, 5, 7]
 * [20, 1, 3, 4, 4, 6, 7]
 * [19, 2, 3, 3, 5, 6, 7]
 * [18, 1, 2, 2, 4, 5, 6, 7]
 * [17, 1, 1, 3, 4, 5, 6, 8]
 * [16, 2, 3, 4, 5, 7, 8]
 * [15, 1, 2, 3, 4, 6, 7, 7]
 * [14, 1, 2, 3, 5, 6, 6, 8]
 * [13, 1, 2, 4, 5, 5, 7, 8]
 * [12, 1, 3, 4, 4, 6, 7, 8]
 * [11, 2, 3, 3, 5, 6, 7, 8]
 * [10, 1, 2, 2, 4, 5, 6, 7, 8]
 * [9, 1, 1, 3, 4, 5, 6, 7, 9]
 * [8, 2, 3, 4, 5, 6, 8, 9]
 * [7, 1, 2, 3, 4, 5, 7, 8, 8]
 * [6, 1, 2, 3, 4, 6, 7, 7, 9]
 * [5, 1, 2, 3, 5, 6, 6, 8, 9]
 * [4, 1, 2, 4, 5, 5, 7, 8, 9]
 * [3, 1, 3, 4, 4, 6, 7, 8, 9]
 * [2, 2, 3, 3, 5, 6, 7, 8, 9]
 * [1, 1, 2, 2, 4, 5, 6, 7, 8, 9]
 * [1, 1, 3, 4, 5, 6, 7, 8, 10]
 * [2, 3, 4, 5, 6, 7, 9, 9]
 * [1, 2, 3, 4, 5, 6, 8, 8, 8]
 * [1, 2, 3, 4, 5, 7, 7, 7, 9]
 * [1, 2, 3, 4, 6, 6, 6, 8, 9]
 * [1, 2, 3, 5, 5, 5, 7, 8, 9]
 * [1, 2, 4, 4, 4, 6, 7, 8, 9]
 * [1, 3, 3, 3, 5, 6, 7, 8, 9]
 * [2, 2, 2, 4, 5, 6, 7, 8, 9]
 * [1, 1, 1, 3, 4, 5, 6, 7, 8, 9]
 * [2, 3, 4, 5, 6, 7, 8, 10]
 * [1, 2, 3, 4, 5, 6, 7, 9, 8]
 * [1, 2, 3, 4, 5, 6, 8, 7, 9]
 * [1, 2, 3, 4, 5, 7, 6, 8, 9]
 * [1, 2, 3, 4, 6, 5, 7, 8, 9]
 * [1, 2, 3, 5, 4, 6, 7, 8, 9]
 * [1, 2, 4, 3, 5, 6, 7, 8, 9]
 * [1, 3, 2, 4, 5, 6, 7, 8, 9]
 * [2, 1, 3, 4, 5, 6, 7, 8, 9]
 * [1, 2, 3, 4, 5, 6, 7, 8, 9]
 *
 * SIMPLE 4:
 * [10, 29, 3, 1, 1, 1]
 * [9, 28, 2, 6]
 * [8, 27, 1, 5, 4]
 * [7, 26, 4, 3, 5]
 * [6, 25, 3, 2, 4, 5]
 * [5, 24, 2, 1, 3, 4, 6]
 * [4, 23, 1, 2, 3, 5, 7]
 * [3, 22, 1, 2, 4, 6, 7]
 * [2, 21, 1, 3, 5, 6, 7]
 * [1, 20, 2, 4, 5, 6, 7]
 * [19, 1, 3, 4, 5, 6, 7]
 * [18, 2, 3, 4, 5, 6, 7]
 * [17, 1, 2, 3, 4, 5, 6, 7]
 * [16, 1, 2, 3, 4, 5, 6, 8]
 * [15, 1, 2, 3, 4, 5, 7, 8]
 * [14, 1, 2, 3, 4, 6, 7, 8]
 * [13, 1, 2, 3, 5, 6, 7, 8]
 * [12, 1, 2, 4, 5, 6, 7, 8]
 * [11, 1, 3, 4, 5, 6, 7, 8]
 * [10, 2, 3, 4, 5, 6, 7, 8]
 * [9, 1, 2, 3, 4, 5, 6, 7, 8]
 * [8, 1, 2, 3, 4, 5, 6, 7, 9]
 * [7, 1, 2, 3, 4, 5, 6, 8, 9]
 * [6, 1, 2, 3, 4, 5, 7, 8, 9]
 * [5, 1, 2, 3, 4, 6, 7, 8, 9]
 * [4, 1, 2, 3, 5, 6, 7, 8, 9]
 * [3, 1, 2, 4, 5, 6, 7, 8, 9]
 * [2, 1, 3, 4, 5, 6, 7, 8, 9]
 * [1, 2, 3, 4, 5, 6, 7, 8, 9]
 */
