package banking;

import java.text.NumberFormat;
public class Account 
{
	private String fn;
	private String ln;
	private double balance;
	
	public Account(String f, String l)
	{
		fn = f;
		ln = l;

	}
	
	public String getName()
	{
		return("fn " + "ln");
	}
	
	public String toString()
	{
		return("your name is " + fn + " " + ln);
	}
}
