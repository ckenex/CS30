package vehicles;

public class Car extends Vehicle
{
	private String type; //electric, gasoline, hybrid (maybe hydrogen?)
	
	public Car(int c, double e, int k, String b, String a)
	{
		super(c, e, k, b);//from superclass
		type = a;
	}
	
	public String getType()
	{
		return(type);
	}
	
	public String description()
	{
		return("This car has a seating capacity of " + super.getPersonCapacity() + ", a fuel efficiency of \n" + super.getFuelEfficiency()
		+ "L/100km, " + super.getKilometers() + "km are currently on the vehicle, and it is a(n) " + type + " car.");
	}
}
