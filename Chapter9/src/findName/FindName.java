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
