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
