package zyBook_Chapter_9.zyBook_36_5;

public class Plant {
    protected String plantName;
    protected String plantCost;

    public void setPlantName(String userPlantName) {
        plantName = userPlantName;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantCost(String userPlantCost) {
        plantCost = userPlantCost;
    }

    public String getPlantCost() {
        return plantCost;
    }

    public void printInfo() {
        System.out.println("   Plant name: " + plantName);
        System.out.println("   Cost: " + plantCost);
    }
}