package zyBook_Chapter_8.BabyName;

import javax.swing.JFileChooser;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class BabyNameDemo {
    public static void main(String[] args) throws IOException
    {
        // Main body part
        
            ArrayList<String> originalList = readFileIntoArrayList();
        
        

        // Create one object of BabyNameList, called nameList
        BabyNameList nameList = new BabyNameList();

        // Create two objects of BabyName called boyObject and gilrObject using the default constructor.
        BabyName boyObject = new BabyName();
        BabyName girlObject = new BabyName();

        // Parsing baby names and adding to the list
        for (String line : originalList) {
            BabyName[] wholeLine = parseBabyNames(line, boyObject, girlObject);

            // Add both objects to nameList using its addBabyToList method
            nameList.AddBabyToList(wholeLine[0]);
            nameList.AddBabyToList(wholeLine[1]);
        }

        // print the result
        System.out.println(nameList);

        // Call testNameList and print if you are successful or not
        int numberOfTests = 5;
            boolean testResult = testNameList(5, nameList);
            if(testResult){
            System.out.println("All matches are correct.");
        } else {
            System.out.println("There are incorrect matches.");
        }

        // Print maxBirthNumbers() for girls and boys
        System.out.println("Maximum births of girl: " + nameList.getMaxBirthNumbers(true));
        System.out.println("Maximum births of boy: " + nameList.getMaxBirthNumbers(false));

        // Create two objects of BabyNameList, called boyNameList and girlNameList
        BabyNameList boyNameList = new BabyNameList();
        BabyNameList girlNameList = new BabyNameList();
        for (BabyName baby : nameList.getBabyNames()) {
            if (baby.getSex()) {
                girlNameList.AddBabyToList(baby);
            } else {
                boyNameList.AddBabyToList(baby);
            }
        }
        // Print maxBirthNumbers() for girls and boys on each list. Each one of them should have zero for one of the numbers.
        // Verify the numbers by printing expected values. Compare your numbers against maxBirthNumbers() from number 7 above
        System.out.println("Maximum births of boy of boyNameList: " + boyNameList.getMaxBirthNumbers(false));
        System.out.println("Maximum births of girl of boyNameList: " + boyNameList.getMaxBirthNumbers(true));
        System.out.println("Expected : 0.");
        System.out.println("Maximum births of boy of girlNameList: " + girlNameList.getMaxBirthNumbers(false));
        System.out.println("Expected : 0.");
        System.out.println("Maximum births of girl of girlNameList: " + girlNameList.getMaxBirthNumbers(true));

        // Create a new ArrayList of NameRank objects, called matchNames
        ArrayList<NameRank> matchNames = findMatchNames(boyNameList, girlNameList);
        System.out.println("Matched names: " + matchNames);
        System.out.println("findMatchNames length: " + matchNames.size());
        for (int i = 0; i<10; i++){
            System.out.println("Test result : (seed = " + i + ") " + testNameRank(i, matchNames, boyNameList, girlNameList));
        }
    }

    public static ArrayList<String> readFileIntoArrayList() throws IOException
    {
        // Read the file, using the exception
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(null);
        ArrayList<String> lines = new ArrayList<>();

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (Scanner scanner = new Scanner(selectedFile)) {
                while (scanner.hasNextLine()) {
                    lines.add(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.err.println("File not found: " + e.getMessage());
            }
        }
        return lines;
    }


    // receives a line and returns two objects of BabyName type
    // Let them be the information of a BabyName class
    private static BabyName[] parseBabyNames(String line, BabyName boyObject, BabyName girlObject) {
        // let the line to the BabyName type
        String[] info = line.split("\\s+");
        boyObject = new BabyName(false ,info[1], Integer.parseInt(info[2]), Integer.parseInt(info[0]), Double.parseDouble(info[3]));
        girlObject = new BabyName(true, info[4], Integer.parseInt(info[5]), Integer.parseInt(info[0]), Double.parseDouble(info[6]));

        // Return two BabyName classes
        return new BabyName[]{boyObject, girlObject};
    }


    public static boolean testNameList(int number, BabyNameList list) {
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            int randomIndex = random.nextInt(list.getSize());  // Generate a random index
            BabyName randomName = list.getBabyNames().get(randomIndex);  // Retrieve the baby name at the random index

            String name = randomName.getName();  // Use the getName method from BabyName class
            int expectedRank = randomName.getRank();
            int foundRank = list.findName(name);

            if (expectedRank != foundRank) {
                return false;  // Ranks do not match, return false immediately
            }
        }
        return true;
    }

    public static ArrayList<NameRank> findMatchNames (BabyNameList list1, BabyNameList list2){
        ArrayList<NameRank> matchNames = new ArrayList<>();
        for (BabyName baby1 : list1.getBabyNames()){
            for (BabyName baby2 : list2.getBabyNames()){
                if (baby1.getName().equals(baby2.getName())){
                    matchNames.add(new NameRank(baby1.getName(), baby1.getRank(), baby2.getRank()));
                }
            }
        }
        return matchNames;
    }

    public static boolean testNameRank(int number, ArrayList<NameRank> nameRanks, BabyNameList list1, BabyNameList list2) {
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            int randomIndex = random.nextInt(nameRanks.size());  // Generate a random index
            NameRank randomNameRank = nameRanks.get(randomIndex);  // Retrieve the baby name at the random index

            String name = randomNameRank.getName();  // Use the getName method from BabyName class
            int expectedRank1 = randomNameRank.getBoyRank();
            int expectedRank2 = randomNameRank.getGirlRank();
            int foundRank1 = list1.findName(name);
            int foundRank2 = list2.findName(name);

            if (expectedRank1 != foundRank1 || expectedRank2 != foundRank2) {
                return false;  // Ranks do not match, return false immediately
            }
        }
        return true;
    }
}
