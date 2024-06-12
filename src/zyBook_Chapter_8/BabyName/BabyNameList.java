package zyBook_Chapter_8.BabyName;

import java.util.ArrayList;
import java.util.Collections;
public class BabyNameList {
    private ArrayList<BabyName> babyNames;
    int girlMaxBirthNumbers;
    int boyMaxBirthNumbers;

    /**
     constructor  a list of baby objects
     */
    public BabyNameList()
    {
        babyNames = new ArrayList<>();
        girlMaxBirthNumbers = 0;
        boyMaxBirthNumbers = 0;
    }

    /**
     constructor  a list of baby objects
     */
    public BabyNameList(BabyName babyName)
    {
        babyNames = new ArrayList<>();
        babyNames.add(babyName);
        girlMaxBirthNumbers = 0;
        boyMaxBirthNumbers = 0;
    }

    /**
     @param BabyName babyName
     @return arrayList<String> babyNameList
     */
    public void AddBabyToList(BabyName babyName)
    {
        // Add the baby name to the arrayList and return a new arrayList
        babyNames.add(babyName);
        updateMaxBirthNumbers(babyName);
    }

    /**
     @param BabyName babyName
     @return arrayList<String> babyNameList
     */
    public void RemoveBabyFromList(BabyName babyName)
    {
        //Remove the baby name to the arrayList and return a new arrayList
        babyNames.remove(babyName);
        recalculateMaxBirthNumbers();
    }


    /**
     Find the maximum number of used name
     */
    private void updateMaxBirthNumbers(BabyName baby) {
        if (baby.getSex() && baby.getBirthNumber() > girlMaxBirthNumbers) {
            girlMaxBirthNumbers = baby.getBirthNumber();
        } else if (!baby.getSex() && baby.getBirthNumber() > boyMaxBirthNumbers) {
            boyMaxBirthNumbers = baby.getBirthNumber();
        }
    }

    private void recalculateMaxBirthNumbers() {
        girlMaxBirthNumbers = 0;
        boyMaxBirthNumbers = 0;
        for (BabyName baby : babyNames) {
            updateMaxBirthNumbers(baby);
        }
    }

    public int getMaxBirthNumbers(boolean isGirl) {
        return isGirl ? girlMaxBirthNumbers : boyMaxBirthNumbers;
    }




    /**
     Find and return the position of a given name
     If not found, return -1
     @param String name
     */
    public int findName(String name) {
        for (BabyName temp : babyNames) {
            if (temp.getName().equals(name)) {
                return temp.getRank();
            }
        }
        return -1; // Name not found after full pass
    }

    /**
     @return String
     */
    public String toString()
    {
        // Convert the object to String
        // Using BabyName class’ toString, return the string of babyNames
        return "BabyNameList: \n" + babyNames + '.';
    }

    public int getSize() {
        return babyNames.size();
    }

    public ArrayList<BabyName> getBabyNames() {
        return babyNames;
    }
}
