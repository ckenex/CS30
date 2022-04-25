/*

Program: Search.java        Last Date of this Revision: April 22, 2022

Purpose: object used to streamline finding a specific name within an array of names

Author: Caden, 
School: CHHS
Course: Computer Programming 30
 

*/


package findName;

public class Search 
{
	
	public static int linear(String[] array, String nameToFind)
	{
		int index = 0;
		
		while((array[index].equals(nameToFind) == false) && (index < array.length - 1))
		{
			index += 1;
		}
		
		if(array[index].equals(nameToFind) == true)
		{
			return(index);
		}
		else
		{
			return(-1);
		}
	}
	

}
