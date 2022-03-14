package vehicles;

public class Minivan extends Vehicle {
	
	private double trunkCapacity; //in liters
	
	public Minivan(int c, double e, int k, String b, double TrunkCap)
	{
		super(c, e, k, b);//from superclass
		trunkCapacity = TrunkCap;
	}
	
	public double getTrunkCapacity()
	{
		return(trunkCapacity);
	}

	public String description()
	{
		return("This minivan has a seating capacity of " + super.getPersonCapacity() + ", a fuel efficiency of \n" + super.getFuelEfficiency()
		+ "L/100km, " + super.getKilometers() + "km are currently on the vehicle, and it has a trunk capacity of " + trunkCapacity + "L.");
	}
}
