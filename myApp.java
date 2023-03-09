package practice;

import java.util.*; 
public class myApp{ 
 public static void main(String[] args) 
 { 
   
  //user prompts 
  System.out.println("Can you name the main characters from seinfeld?"); 
  System.out.println("Enter the names seperated by commas"); 
  
  //declares the scanner to be used for input 
  Scanner s = new Scanner(System.in); 
  
  //string of names 
  String seinfeld = "Jerry, Elaine, Kramer, George"; 
   
  //splits the string of names 
  String[] splitter = seinfeld.split(","); 
   
  //creates the list 
  List<String> seinfeldList = Arrays.asList(splitter); 
   
   
  //creates the list as an array 
  ArrayList<String> sArrayList = new ArrayList<String>(seinfeldList); 
   
  ////////////////////////         base list ^ and then user list below  

  //assigns input to the next Line 
  String userInput = s.nextLine(); 
   
  //creates an array with items split by the comma 
  String[] useSplit =userInput.split(","); 
   
   
  //creates the list 
  List<String> userList = Arrays.asList(useSplit); 
   
  //creates the array of the list 
  ArrayList<String>uArrayList = new ArrayList<String>(userList); 


 //compares the 2 lists of names
  if(sArrayList.containsAll(uArrayList)) { 
   System.out.println("great success"); 
  }else { 
   System.out.println("ERROR I NEED SCISSORS 61"); 
  } 
 
  s.close(); 
 } 
}
