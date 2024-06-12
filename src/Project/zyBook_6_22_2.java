package Project;

import java.util.Arrays;

public class zyBook_6_22_2 {
    /**
    *Create Random Array
    *Create array of random integers
    *Loop SAMPLE_SIZE times and add a random integer into each index
    *@param SAMPLE_SIZE size of array to be created
    */
    public static int[] createRandomNumbers(int[] randomArray, int SAMPLE_SIZE){
        // Change this times number for change the size of array
        for(int i = 0; i < SAMPLE_SIZE * (Math.random() * 10 + 1); i++)
        {
            if(i==randomArray.length)
            {
                randomArray=resizeArray(randomArray);
            }
            randomArray[i] = (int) (Math.random() * 6 + 1);

        }
        for(int i = randomArray.length-1; randomArray[i] == 0; i--)
        {
            randomArray=removeCell(randomArray);
        }
        return randomArray;
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
     Resize Array
     Check the element of the array is less than 10, if not, increase the length to 45.
     @param int[] array containing the random element
     @return  int[] array
     **/
    public static int[]  resizeArray(int[] randomArray)
    {
        int[] resizedarray= new int[randomArray.length*2];
        for(int i=0;i<randomArray.length;i++)
        {
            resizedarray[i]=randomArray[i];
        }
        return resizedarray;
    }
    /**
     * Gets Longest Run
     * This method will receive two arrays; one contains random numbers for die tosses, and
     * the other is an array of size two to return the minimum and maximum index of the
     * longest run.
     * @param randomArray of random numbers for die tosses
     * @param indexArray of longest run index
     */
    public static void longestRun(int[] randomArray, int[] indexArray){
        int maxLength = 1;
        int currentLength = 1;
        int startIndex = 0;
        int bestStartIndex = 0;

        for (int i = 1; i < randomArray.length; i++) {
            if (randomArray[i] == randomArray[i - 1]) {
                currentLength++;

                if (currentLength >= maxLength) {
                    maxLength = currentLength;
                    bestStartIndex = startIndex;
                }
                } else {
                    currentLength = 1;
                    startIndex = i;
                }
        }

        indexArray[0] = bestStartIndex ;
        indexArray[1] = bestStartIndex + maxLength - 1;
    }

    /**
     * Displays array
     * Display the random array with brackets around the longest run
     * @param randomArray of size SAMPLE_SIZE
     * @param indexArray of size
     */
    public static void displayArray(int[] randomArray, int[] indexArray){
        System.out.println("Bracketed Array: ");
        for (int i = 0; i< randomArray.length; i++)
        {
            if(indexArray[1] != 0)
            {
                if (i == indexArray[0])
                {
                    System.out.print("(" +randomArray[i] + " ");
                }else if (i == indexArray[1])
                {
                    System.out.print( +randomArray[i] + ") ");
                }else
                {
                    System.out.print( +randomArray[i] + " ");
                }
            }else
            {
                System.out.print(Arrays.toString(randomArray) + " ");
                System.out.println("There is not longest way!");
                break;
            }

        }
    }

    public static void main(String[] args)
    {
        final int SAMPLE_SIZE = 10;
        int[] randomArray = new int[SAMPLE_SIZE ];
        randomArray=createRandomNumbers(randomArray, SAMPLE_SIZE);

        int[] indexArray = {0, 0};
        longestRun(randomArray, indexArray);
        displayArray(randomArray, indexArray);
    }
}
/** Samples
 Bracketed Array:
 1 4 3 3 4 6 5 2 4 2 1 4 3 2 6 (2 2) 3 4 3 1 2
 *
 Bracketed Array:
 6 4 4 4 1 3 5 1 3 2 (4 4 4) 6 1
 *
 Bracketed Array:
 5 4 1 5 5 4 5 4 6 5 4 5 4 5 6 3 6 1 3 5 (2 2 2) 5 2 2 3 3 2 2 5 6 1
 *
 Bracketed Array:
 [6, 5, 4, 5, 4, 5, 6, 3, 6, 2, 3, 5, 3, 4, 2] There is not longest way!
 */