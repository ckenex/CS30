/*

Program: FindAndReplace.java          Last Date of this Revision: April 11, 2022

Author: Caden, 
School: CHHS
Course: Computer Programming 30
 

*/

package projects;
import java.io.*;
import java.util.*;


public class FindAndReplace 
{
	public static void main(String[] args)
	{
		
		Scanner uIN = new Scanner(System.in);
		System.out.println("Enter a file name");
		String fileName = uIN.next();
		System.out.println("Enter a search word or phrase"); //user prompts
		String SW = uIN.next();
		System.out.println("Enter a replacement word or phrase");
		String RW = uIN.next();
		
		File centFile = new File(fileName); 
		File newFile; //copy file to create
		FileReader in;
		BufferedReader readFile;//defining variables and files
		FileWriter out;
		BufferedWriter writeFile;
		String lineOfText;
		
		try 
		{
			
			in = new FileReader(centFile);
			readFile = new BufferedReader(in);
			fileName = fileName.replace(".", "NEW."); //changing file name to indicate to user it is the new file
			newFile = new File(fileName);
			out = new FileWriter(newFile);
			
			writeFile = new BufferedWriter(out);
			
			while((lineOfText = readFile.readLine()) != null) //until there is no writing on the text file left
			{	
				lineOfText = lineOfText.replaceAll(SW, RW);//replacing all instances of search word
				writeFile.write(lineOfText);
				writeFile.newLine();
				
			}
			
			writeFile.close();
			out.close();
			readFile.close();
			in.close(); //close in order to conserve resources
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File does not exist or could not be found");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("Problem reading file");
			System.err.println("IOException: " + e.getMessage());
		}
	}
	//check files on computer afterward
}


/*Screen Dump
 
  
  Enter a file name
C:\\f&r.txt
Enter a search word or phrase
bees										
Enter a replacement word or phrase
wasps

  
  
  
  
*/
