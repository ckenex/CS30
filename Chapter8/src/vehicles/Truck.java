package vehicles;

public class Truck extends Vehicle 
{
	
	private int towingCapacity; //in kilograms
	
	public Truck(int c, double e, int k, String b, int TowingCap)
	{
		super(c, e, k, b); //from superclass
		towingCapacity = TowingCap;
	}
	
	public int getTowingCapacity()
	{
		return(towingCapacity);
	}

	public String description()
	{
		return("This truck has a seating capacity of " + super.getPersonCapacity() + ", a fuel efficiency of \n" + super.getFuelEfficiency()
		+ "L/100km, " + super.getKilometers() + "km are currently on the vehicle, and it has a towing capacity of " + towingCapacity + "kg.");
	}
}
