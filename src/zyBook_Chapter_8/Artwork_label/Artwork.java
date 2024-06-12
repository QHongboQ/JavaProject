package zyBook_Chapter_8.Artwork_label;

public class Artwork {
    // TODO: Declare private fields - title, yearCreated
    private String title;
    private int yearCreated;
    private Artist artist;

    // TODO: Declare private field artist of type Artist

    // TODO: Define default constructor
    public Artwork() {
        this.title = "unknown";
        this.yearCreated = -1;
        this.artist = new Artist();
    }

    // TODO: Define get methods: getTitle(), getYearCreated()
    public String getTitle() {
        return title;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    // TODO: Define second constructor to initialize
    //       private fields (title, yearCreated, artist)
    public Artwork(String title, int yearCreated, Artist artist) {
        this.title = title;
        this.yearCreated = yearCreated;
        this.artist = artist;
    }

    // TODO: Define printInfo() method
    //       Call the printInfo() method in Artist.java to print an artist's information
    public void printInfo() {
        artist.printInfo();
        System.out.println("Title: " + title + ", " + yearCreated);
    }
}
