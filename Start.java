package myApp;
import java.util.*;
public class Start{
	public static void main(String[] args)
	{
		System.out.println("Can you name the main characters from seinfeld?");
		System.out.println("Enter the names seperated by spaces");
		Scanner uText = new Scanner(System.in);
		//creates the array of names
		
		
		String [] seinfeld = {"Jerry", "Elaine", "Kramer", "George"};
		
		//Allows the user input
		String check = uText.next(); 
		// call for the user input 
		if (check.equalsIgnoreCase(seinfeld[2])) {
			System.out.println("CODE ACCEPTED ^_^  BE WELL");
		}else if(check.equalsIgnoreCase(seinfeld[0])){
			System.out.print("CODE ACCEPTED ^_^  BE WELL");
		}else if(check.equalsIgnoreCase(seinfeld[1])) {
			System.out.print("CODE ACCEPTED ^_^  BE WELL");

		}else if(check.equalsIgnoreCase(seinfeld[3])) {
			System.out.print("CODE ACCEPTED ^_^  BE WELL");

		}else {
			System.out.print("error i need scissors 61");

		}
		uText.close();		
		}					

}
	