package zyBook_Chapter_9.zyBook_36_5;

import java.util.Scanner;
import java.util.ArrayList;

public class PlantArrayListExample {

    // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;
        // TODO: Declare an ArrayList called myGarden that can hold object of type plant
        ArrayList<Plant> myGarden = new ArrayList<>();

        // TODO: Declare variables - plantName, plantCost, flowerName, flowerCost, colorOfFlowers, isAnnual
        String plantName;
        String plantCost;
        String flowerName;
        String flowerCost;
        boolean isAnnual;
        String colorOfFlowers;


        input = scnr.next();
        while(!input.equals("-1")){
            // TODO: Check if input is a plant or flower
            //       Store as a plant object or flower object
            //       Add to the ArrayList myGarden

            if (input.equals("plant")) {
                Plant plant = new Plant();
                plantName = scnr.next();
                plantCost = scnr.next();
                plant.setPlantName(plantName);
                plant.setPlantCost(plantCost);
                myGarden.add(plant);
            }else if (input.equals("flower")) {
                Flower flower = new Flower();
                flowerName = scnr.next();
                flowerCost = scnr.next();
                isAnnual = Boolean.parseBoolean(scnr.next());
                colorOfFlowers = scnr.next();
                flower.setPlantName(flowerName);
                flower.setPlantCost(flowerCost);
                flower.setPlantType(isAnnual);
                flower.setColorOfFlowers(colorOfFlowers);
                myGarden.add(flower);
            }

            input = scnr.next();
        }

        // TODO: Call the method printArrayList to print myGarden
        printArrayList(myGarden);
        scnr.close();
    }

    public static void printArrayList(ArrayList<Plant> myGarden) {
        int count = 1;
        for (Plant plant : myGarden) {
            System.out.println("Plant " + count + " Information: ");
            plant.printInfo();
            System.out.println(); // Adding a newline for better readability
            count++;
        }
    }
}