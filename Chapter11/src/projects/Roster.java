/*

Program: Roster.java          Last Date of this Revision: April 6 2022


Author: Caden, 
School: CHHS
Course: Computer Programming 30
 

*/


package projects;
import java.io.*;
import java.util.*;

public class Roster 
{
	
	public static void main(String[] args)
	{
		String firstName; //declared here since these change depending on for loop
		String lastName;
		
		Scanner fIn = new Scanner(System.in);
		System.out.println("Which file would you like to output names to?");
		String nF = fIn.next(); //needs file name and student count from user
		
		Scanner scIn = new Scanner(System.in);
		System.out.println("How many students would you like to record?");
		int sCount = scIn.nextInt();
		
		Scanner sIn = new Scanner(System.in);
		
		File centFile = new File(nF); //file creation based on user's input
		try
		{
			
			FileOutputStream out = new FileOutputStream(centFile);
			ObjectOutputStream writeStu = new ObjectOutputStream(out); //declaring object writers
			for (int i = 0; i < sCount; i++)
			{
				System.out.println("Enter a student's first name: ");
				firstName = sIn.next();
				System.out.println("Enter a student's last name: ");
				lastName = sIn.next();
				
				writeStu.writeObject(new StuName(firstName, lastName)); //actually writing it per loop
				
			}
			writeStu.close();
			System.out.println("Data successfully written");
			
			FileInputStream in = new FileInputStream(centFile); //declaring object readers
			ObjectInputStream readStu = new ObjectInputStream(in);
			
			for (int i = 0; i < sCount; i++) //similar loop
			{
				StuName s = (StuName)readStu.readObject(); // reading objects per loop and printing
				System.out.println(s.toString());
				
			}
			readStu.close();
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
		catch (ClassNotFoundException e) //newest catch, sees errors related to OOP
		{
			System.out.println("Class could not be used to cast object");
			System.err.println("ClassNotFoundException: " + e.getMessage());
		}
	}

}

/*Screen Dump
 
 Which file would you like to output names to?
C:\\ros.txt
How many students would you like to record?
2
Enter a student's first name: 
bon
Enter a student's last name: 
non
Enter a student's first name: 
dan
Enter a student's last name: 
pan
Data successfully written
bon non
dan pan

 Which file would you like to output names to?
C:\\ros.txt
How many students would you like to record?
4
Enter a student's first name: 
Handy
Enter a student's last name: 
Mandy
Enter a student's first name: 
Thomas
Enter a student's last name: 
thetrain
Enter a student's first name: 
Prince
Enter a student's last name: 
Ali
Enter a student's first name: 
Simba
Enter a student's last name: 
Simba
Data successfully written
Handy Mandy
Thomas thetrain
Prince Ali
Simba Simba

 Which file would you like to output names to?
C:\\roster.txt
How many students would you like to record?
3
Enter a student's first name: 
Garry
Enter a student's last name: 
Garryson
Enter a student's first name: 
Jack
Enter a student's last name: 
Jackson
Enter a student's first name: 
Brom
Enter a student's last name: 
Bromson
Data successfully written
Garry Garryson
Jack Jackson
Brom Bromson

 */
