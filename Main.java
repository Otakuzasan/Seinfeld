package org.example;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] predeterminedNames = {"Jerry", "Elaine", "Kramer", "George"};

        System.out.println("Enter 4 main characters from seinfeld first names(separated by commas):");
        String userInput = scanner.nextLine();

        String[] inputNames = userInput.split(",");
        int validNameCount = 0;

        for (String inputName : inputNames) {
            String trimmedInput = inputName.trim();
            if (containsIgnoreCaseAndWhiteSpace(predeterminedNames, trimmedInput)) {
                validNameCount++;
            }
        }

        if (validNameCount == 4) {
            System.out.println("GREAT SUCCESS.");
        } else {
            System.out.println("Sorry, ....NO SOUP FOR YOU.");
        }
    }

    public static boolean containsIgnoreCaseAndWhiteSpace(String[] array, String searchTerm) {
        for (String item : array) {
            if (item.replaceAll("\\s+", "").equalsIgnoreCase(searchTerm.replaceAll("\\s+", ""))) {
                return true;
            }
        }
        return false;
    }






   ////ORIGINAL CODE IS BELOW







        /*
        //user prompts
        System.out.println("Can you name the main characters from seinfeld?");
        System.out.println("Enter the names with the first letter UPPERCASE and the names seperated by commas");

        //create scanner for user input
        Scanner s = new Scanner(System.in);

        // create the string of seinfeld names
        String seinfeld = "Jerry,Elaine,Kramer,George";

        //split each string name by the comma
        String[] splitter = seinfeld.split(",");

        //turn the seinfeld string into array with each item seperated by the comma
        List<String> seinfeldList = Arrays.asList(splitter);

        //create the array list populated by the seinfeld array
        ArrayList<String> sArrayList = new ArrayList(seinfeldList);

        //get user input
        String userInput = s.nextLine();

        //split each user item by a comma
        String[] useSplit = userInput.split(",");

        //create list of items based off of the split user items
        List<String> userList = Arrays.asList(useSplit);

        //turns the list of user items into array
        ArrayList<String> uArrayList = new ArrayList(userList);



        //checks if the seinfeld list contains the same items as user list
        if (sArrayList.containsAll(uArrayList)) {
            System.out.println("great success");
        } else {
            System.out.println("ERROR I NEED SCISSORS 61");
        }

        s.close();


         */
    }
