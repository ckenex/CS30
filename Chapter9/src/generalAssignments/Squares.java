/*

Program: Squares.java        Last Date of this Revision: April 22, 2022

Purpose: displaying first 5 square numbers

Author: Caden, 
School: CHHS
Course: Computer Programming 30
 

*/

package generalAssignments;

public class Squares 
{
	
	public static void main (String[] args)
	{
		
		int[] squares = new int[5];
		
		for(int i = 0; i < squares.length; i++)
		{
			squares[i] = i*i;
		}
		for(int i = 0; i < squares.length; i++)
		{
			System.out.println(squares[i]);
		}
	}

}

/* Screen Dump
 
0
1
4
9
16

 
 
 */
