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
