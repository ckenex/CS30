/*

Program: TestVehicles.java          Last Date of this Revision: March 15, 2022



Author: Caden, 
School: CHHS
Course: Computer Programming 30
 

*/


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

/* Screen Dump

This car has a seating capacity of 4, a fuel efficiency of 
0.0L/100km, 44980km are currently on the vehicle, and it is a(n) electric car.

This minivan has a seating capacity of 8, a fuel efficiency of 
55.0L/100km, 131966km are currently on the vehicle, and it has a trunk capacity of 750.0L.

This truck has a seating capacity of 5, a fuel efficiency of 
50.0L/100km, 17782km are currently on the vehicle, and it has a towing capacity of 4000kg.


*/