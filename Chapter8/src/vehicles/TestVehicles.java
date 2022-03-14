package vehicles;

public class TestVehicles 
{

	public static void main(String[] args) 
	{
		
		Car tesla = new Car(4, 0, 44980, "tesla", "electric"); //fuel efficiency is zero because tesla is electric
		System.out.println(tesla.description());
		System.out.println();
		
		Minivan familyvan = new Minivan(8, 55, 131966, "dodge", 750);
		System.out.println(familyvan.description());
		System.out.println();
		
		Truck pickup = new Truck(5, 50, 17782, "ford", 4000);
		System.out.println(pickup.description());
		System.out.println();

	}

}
