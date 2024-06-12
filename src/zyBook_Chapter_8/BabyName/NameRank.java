package zyBook_Chapter_8.BabyName;

public class NameRank {
    private String name;
    private int boyRank;
    private int girlRank;

    public NameRank()
    {
        // default constructor, set everything is null
        this.name = "";
        this.boyRank = 0;
        this.girlRank = 0;
    }

    /**
     @param name of baby
     */
    public NameRank(String name) {
        this.name = name;
        this.boyRank = 0;
        this.girlRank = 0;
    }

    /**
     @param name of baby
     @param number of rank
     */
    public NameRank(String name, int boyRank, int girlRank)
    {
        // constructor with all parameters
        this.name = name;
        this.boyRank = boyRank;
        this.girlRank = girlRank;

    }

    /**
     Sets the name of the BabyName
     @param String name
     */
    public void setName(String name) {
        // Change the name instance
        this.name = name;
    }

    /**
     Sets the rank
     */
    public void setRank(int boyRank, int girlRank)
    {
        // Change the rank
        this.boyRank = boyRank;
        this.girlRank = girlRank;
    }

    /**
     Returns String of information
     @return String
     */
    public String toString()
    {
        // Convert all instance to a String line, so we can print them
        return "NameRank: " +
                " name = '" + name + '\'' +
                ", boyRank =" + boyRank +
                ", girlRank =" + girlRank + "\n";
    }

    /**
     @return String name
     */
    public String getName()
    {
        return  name;
    }

    /**
     @return int rank
     */
    public int getBoyRank()
    {
        return boyRank;
    }

    /**
     @return int rank
     */
    public int getGirlRank()
    {
        return girlRank;
    }


}
