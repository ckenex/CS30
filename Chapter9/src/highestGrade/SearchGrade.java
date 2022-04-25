/*

Program: SearchGrade.java        Last Date of this Revision: April 22, 2022

Purpose: object search grade to streamline process of finding the highest number in a set

Author: Caden, 
School: CHHS
Course: Computer Programming 30
 

*/

package highestGrade;

public class SearchGrade 
{
	public static int getHighestGrade(int[] array)
	{
		
		int index = 0;
		int highest = 0;
		
		while(index < array.length - 1)
		{
			if(array[index] > highest)
			{
				highest = array[index];
				
			}
			index += 1;
		}
		return(highest);
	}

}
