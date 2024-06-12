package zyBook_Chapter_8.zyBook_8_2_2;

public class Bug
{
    private String climbed = "";

    private int position = 0;
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
}