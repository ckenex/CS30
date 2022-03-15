package University;

public class UEmployee 
{

	private String name; //name and salary for standard employee
	private double salary;
	
	public UEmployee(String n, double s)
	{
		name = n;
		salary = s;
	}

	public String getName() //returns variables for objects
	{
		return(name);
	}
	public double getSalary()
	{
		return(salary);
	}
	
	public String toString()
	{
		return(name + " has salary: $" + salary);
	}
}
