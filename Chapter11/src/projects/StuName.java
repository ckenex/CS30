package projects;
import java.io.*;


public class StuName implements Serializable 
{						//simple class used to streamline the reading and writing process with objects
	private String firstname; 
	private String lastname;
	
	public StuName(String fn, String ln) //constructor
	{
		
		firstname = fn;
		lastname = ln;
		
	}
	
	public String toString()
	{
		return(firstname + " " + lastname);
	}
}
