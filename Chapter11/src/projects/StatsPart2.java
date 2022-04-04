/*

Program: StatsPart2.java          Last Date of this Revision: April 4, 2022

Author: Caden, 
School: CHHS
Course: Computer Programming 30
 

*/


package projects;
import java.io.*;
import java.util.*;

public class StatsPart2 
{

	public static void main(String[] args)
	{
		
		File centFile = new File("C:\\StudentStats.txt");
		FileWriter out;
		BufferedWriter writeFile;
		Scanner cIn = new Scanner(System.in);
		double mark;
		String name;
		int sCount;
		double lowest = 100;
		double highest = 0;
		double averageT = 0;
		double average = 0;
		
		System.out.println("How many students would you like to input?");
		sCount = cIn.nextInt();
		
		Scanner sIn = new Scanner(System.in);
		
		try
		{
			
			out = new FileWriter(centFile);
			writeFile = new BufferedWriter(out);
			
			for (int i = 0; i < sCount; i++)
			{
				System.out.println("Enter a student name: ");
				name = sIn.next();
				System.out.println("Enter " + name + "'s test score: ");
				mark = sIn.nextDouble();
				if(mark < lowest)
				{
					lowest = mark;
				}
				if(mark > highest)
				{
					highest = mark;
				}
				averageT = averageT + mark;
				writeFile.write(name);
				writeFile.newLine();
				writeFile.write(String.valueOf(mark));
				writeFile.newLine();
			}
			
			average = averageT / sCount;
			writeFile.close();
			out.close();
			System.out.println("Success");
			System.out.println("Highest mark: " + highest);
			System.out.println("Lowest mark: " + lowest);
			System.out.println("Average mark: " + average);
		}
		catch (IOException e)
		{
			System.out.println("Problem writing to file");
			System.err.println("IOException: " + e.getMessage());
		}
		
	}
	
}

/* Screen Dump
 
How many students would you like to input?
4
Enter a student name: 
babby
Enter babby's test score: 
84
Enter a student name: 
bebby
Enter bebby's test score: 
90
Enter a student name: 
bibby
Enter bibby's test score: 
97
Enter a student name: 
bobby
Enter bobby's test score: 
81
Success
Highest mark: 97.0
Lowest mark: 81.0
Average mark: 88.0

How many students would you like to input?
5
Enter a student name: 
larry
Enter larry's test score: 
38
Enter a student name: 
barry
Enter barry's test score: 
53
Enter a student name: 
marry
Enter marry's test score: 
11
Enter a student name: 
parry
Enter parry's test score: 
45
Enter a student name: 
gary
Enter gary's test score: 
50
Success
Highest mark: 53.0
Lowest mark: 11.0
Average mark: 39.4

How many students would you like to input?
3
Enter a student name: 
katelyn
Enter katelyn's test score: 
78
Enter a student name: 
kaitlin
Enter kaitlin's test score: 
84
Enter a student name: 
caitlynn
Enter caitlynn's test score: 
71
Success
Highest mark: 84.0
Lowest mark: 71.0
Average mark: 77.66666666666667


*/