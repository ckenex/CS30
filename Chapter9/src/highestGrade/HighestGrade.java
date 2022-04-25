/*

Program: HighestGrade.java        Last Date of this Revision: April 22, 2022

Purpose: finding highest grade/number within 5 different grades

Author: Caden, 
School: CHHS
Course: Computer Programming 30
 

*/

package highestGrade;
import java.util.*;

public class HighestGrade 
{
	public static void main(String[] args)
	{
		
		int[] gradeArray = new int[5];
		Scanner uIN = new Scanner(System.in);
		int grIN;
		int entryNum = 1;
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("enter grade number " + entryNum + ":");
			grIN = uIN.nextInt();
			gradeArray[i] = grIN;
			entryNum++;
		}
		int highest = SearchGrade.getHighestGrade(gradeArray);
		System.out.println("The highest grade is: " + highest);
	}
	
}

/* Screen Dump

enter grade number 1:
90
enter grade number 2:
23
enter grade number 3:
45
enter grade number 4:
74
enter grade number 5:
88
The highest grade is: 90


*/