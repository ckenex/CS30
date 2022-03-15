package banking;


public class Account 
{
	private String fn;
	private String ln;
	
	
	public Account(String f, String l)//constructor for firstname and lastname
	{
		fn = f;
		ln = l;

	} //does not yet need balance methods
	
	public String getName()
	{
		return("fn " + "ln");
	}
	
	public String toString()
	{
		return("your name is " + fn + " " + ln);
	}
}
