/*

Program: FindName.java        Last Date of this Revision: April 22, 2022

Purpose: finding a specific name within an array of names

Author: Caden, 
School: CHHS
Course: Computer Programming 30
 

*/

package findName;
import java.util.*;

public class FindName 
{

	public static void main(String[] args)
	{
		int location;
		String sName;
		String findN;
		
		Scanner uIN = new Scanner(System.in);
		System.out.println("how many names do you wish to record?");
		int nameCount = uIN.nextInt();
		
		String[] nameArray = new String[nameCount];
		
		for(int i = 0; i < nameCount; i++)
		{
			System.out.println("enter a name:");
			sName = uIN.next();
			nameArray[i] = sName;
			
		}
		
		System.out.println("What name would you like to search for?");
		findN = uIN.next();
		

		location = Search.linear(nameArray, findN);
		if(location == -1)
		{
			System.out.println("Name does not exist");
		}
		else
		{
			System.out.println("First occurrence of given name is element " + location);
		}
		
	}
	
}

/* Screen Dump


how many names do you wish to record?
3
enter a name:
jab
enter a name:
jeb
enter a name:
jib
What name would you like to search for?
jab
First occurrence of given name is element 0


how many names do you wish to record?
5
enter a name:
braden
enter a name:
brayden
enter a name:
braiden
enter a name:
bradin
enter a name:
braydin
What name would you like to search for?
brayden
First occurrence of given name is element 1


 */
