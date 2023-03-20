package myApp;
import java.util.*;
public class Start{
	//program that asks the user to input the 4 main characters of SEINFELD
	//with the FIRST letter of each name capitalized and each name 
	//separated by commas. no spaces
	
	
	public static void main(String[] args)
	{
		 do {
			  //User Instructions
			  System.out.println("Can You Name The 4 Main Characters Of Seinfeld");
			  System.out.println("With The First Letter Of Each Name Capitalized");
			  System.out.println("And Each Name Seperated By Commas, NO SPACES");
			  
		  //declares scanner for input
		  Scanner s = new Scanner(System.in);
		  //sets uInput to the nextLine
			String userInput = s.nextLine();

		  //create arraylist for seinfeld characters
		  ArrayList<String>seinfeld = new ArrayList<>();
		  //add characters to that list
		  seinfeld.add("Jerry");
		  seinfeld.add("Elaine");
		  seinfeld.add("George");
		  seinfeld.add("Kramer");
			//creates an array with items split by the comma
			String[] useSplit =userInput.split(",");
			
			
			//creates the list of user input
			List<String> userList = Arrays.asList(useSplit);
			//creates the user input array
			ArrayList<String>uArrayList = new ArrayList<String>(userList);
			

			
			// statement to compare the 2 arrayLists
			if(uArrayList.containsAll(seinfeld)) {
				System.out.println("great success");
			}else {
				System.out.println("ERROR I NEED SCISSORS 61");
			}

		  
		
		  
		  
		  //ends loop
		  }while(true);

		}
	  

		
	}
	