package zyBook_Chapter_8.Artwork_label;

public class Artist {
    // TODO: Declare private fields - artistName, birthYear, deathYear
    private String artistName;
    private int birthYear;
    private int deathYear;

    // TODO: Define default constructor
    public Artist() {
        this.artistName = "unknown";
        this.birthYear = -1;
        this.deathYear = -1;
    }

    // TODO: Define second constructor to initialize
    //       private fields (artistName, birthYear, deathYear)
    public Artist(String artistName, int birthYear, int deathYear) {
        this.artistName = artistName;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    // TODO: Define get methods: getName(), getBirthYear(), getDeathYear()
    public String getName() {
        return artistName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    // TODO: Define printInfo() method
    //       If deathYear is entered as -1, only print birthYear
    public void printInfo() {
        System.out.print("Artist: " + artistName + " ");
        if (birthYear > 0 && deathYear > 0) {
            System.out.println("(" + birthYear + " to " + deathYear + ")");
        } else if ((birthYear >0) && (deathYear < 0)) {
            System.out.println("(" + birthYear + " to present)");
        } else {
            System.out.println("(unknown)");
        }
    }

}
