package myApp;
import java.util.*;

public class Start
{

	public static void main(String[] args)
	{
		System.out.println("List the 4 main characters from seinfeld, with each name seperated by commas");
		
		Scanner k = new Scanner(System.in);
		String seinfeld = k.nextLine();
		
		String [] aNames = seinfeld.split(",");

		Arrays.sort(aNames);
		
		System.out.println(Arrays.toString(aNames));
			
			
		}
	}
