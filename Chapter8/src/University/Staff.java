package University;

public class Staff extends UEmployee
{
	private String job;
	
	public Staff(String n, double s, String j)
	{
		super(n, s);
		job = j;
	}
	
	public String getJob()
	{
		return(job);
	}
	
	public String toString()
	{
		return(super.getName() + " has salary: $" + super.getSalary() + " and works as a " + job + ".");
	}
}
