package zyBook_Chapter_8.zyBook_8_2_1;

public class Bug {
    private int position;

    /* Your code goes here */
    public void up()
    {
        position += 10;
        if(position == 100)
        {
            position = 0;
        }
    }

    public int getPosition()
    {
        return position;
    }
    // Provide the getPosition and up methods
}
