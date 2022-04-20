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
