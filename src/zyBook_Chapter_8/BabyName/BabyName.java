package zyBook_Chapter_8.BabyName;

public class BabyName implements Comparable<BabyName> {
    private boolean isGirl;
    private String name;
    private int birth;
    private int rank;
    private double percent;

    public BabyName()
    {
        // default constructor, set everything is null
        this.isGirl = false;
        this.name = "";
        this.birth = 0;
        this.rank = 0;
        this.percent = 0;
    }

    /**
     @param isGirl of baby
     */
    public BabyName(Boolean isGirl)
    {
        // constructor with all parameters
        this.isGirl = isGirl;
        this.name = "";
        this.birth = 0;
        this.rank = 0;
        this.percent = 0;
    }

    /**
     @param name of baby
     @param number of births
     @param number of percent
     */
    public BabyName(String name, int birth, double percent)
    {
        // constructor with all parameters without sex
        this.isGirl = false;
        this.name = name;
        this.birth = birth;
        this.rank = 0;
        this.percent = percent;
    }

    /**
     @param sex of baby
     @param name of baby
     @param number of births
     @param number of percent
     */
    public BabyName(boolean isGirl, String name, int birth, int rank, double percent)
    {
        // constructor with all parameters
        this.isGirl = isGirl;
        this.name = name;
        this.birth = birth;
        this.rank = rank;
        this.percent = percent;
    }

    /**
     Sets the name of the BabyName
     @param String name
     */
    public void setName(String name)
    {
        // Change the name instance
        this.name = name;
    }

    /**
     Sets the sex of the BabyName,
     If girl true, if boy false
     @param boolean isGirl
     */
    public void setSex(boolean isGirl)
    {
        // Change the sex instance
        this.isGirl = isGirl;
    }

    /**
    Sets birth number of the babyName
    @param int birthNumber
    */
    public void setBirthNumber(int birth)
    {
        // Change the birth instance
        this.birth = birth;
    }

    /**
     Sets the percent of the BabyName
     @param int rank
     */
    public void setRank(int rank)
    {
        // Change the percent instance
        this.rank = rank;
    }

    /**
    Sets the percent of the BabyName
    @param double percent
    */
    public void setPercent(double percent)
    {
    // Change the percent instance
        this.percent = percent;
    }

    public String getName()
    {
        return name;
    }

    public int getBirthNumber() {
        return birth;
    }

    public boolean getSex()
    {
        return isGirl;
    }

    public int getRank()
    {
        return rank;
    }

    public double getPercent()
    {
        return percent;
    }


    /**
    Compares two BabyName objects
    return 0 if two name are equal, negative integer when the current object is less than the other object, positive if the current object is greater than the other object
    @param BabyNam other
    @return int result
    */
    public int compareTo(BabyName other)
    {
        // compare two object
        return this.name.compareTo(other.name);
    }

    /**
    Returns String of information in the BabyName object
    @return String
    */
    public String toString()
    {
        // Convert all instance to a String line, so we can print them
        return "BabyName = {" + "Rank : " + rank + ", Name:" + name  +", BirthNumbers :" +birth + ", Percent :"
                + percent + ", isGirl : " + isGirl + "}.\n";
    }
}
