
/*

Program: MyFile.java          Last Date of this Revision: March 28, 2022



Author: Caden, 
School: CHHS
Course: Computer Programming 30
 

*/


package projects;
import java.io.*;
import java.util.*;

public class MyFile 
{
	public static void main(String[] args)
	{
	
		File myFile = new File("C:\\Users\\105128004\\Documents\\CS30 Eclipse\\Chapter11\\supplies.txt");
		
		try
		{
			myFile.createNewFile();
			System.out.println("myFile has been created");
		} catch (IOException e)
		{
			System.out.println("file could not be created.");
			System.err.println("IOException: " + e.getMessage());
		}
		
		System.out.println("Would you like to keep or delete the file?");
		System.out.println("Press 1 to keep, or press 2 to delete.");
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		
		if(input == 1)
		{
			System.out.println("File has been kept");
		}
		else if(input == 2)
		{
			myFile.delete();
			System.out.println("file has been deleted");
		}
		
	}
}

/* Screen Dump

myFile has been created
Would you like to keep or delete the file?
Press 1 to keep, or press 2 to delete.
1
File has been kept

myFile has been created
Would you like to keep or delete the file?
Press 1 to keep, or press 2 to delete.
2
file has been deleted

*/