package vehicles;

public abstract class Vehicle 
{
	
	private int pCapacity;
	private double fEfficiency;
	private int kilometers;
	private String brand;
	
	public Vehicle(int c, double e, int k, String b)
	{
		pCapacity = c;
		fEfficiency = e;
		kilometers = k;
		brand = b;
	}
	
	public int getPersonCapacity()//allows for easy access to each variable
	{
		return(pCapacity);
	}
	
	public double getFuelEfficiency()
	{
		return(fEfficiency);
	}
	
	public int getKilometers()
	{
		return(kilometers);
	}
	
	public String getBrand()
	{
		return(brand);
	}
	
	public abstract String description();//changes depending on vehicle
	
}
