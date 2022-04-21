package localBank;

/**
 * Customer class.
 */

public class Customer {
	private String firstName, lastName, street, city, province, postalCode;

	//create String variables street, city, province, postal code	

	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String str, String c, String p, String postalC) //modify constructor to include street, city, province, postal code
	{
		firstName = fName;
		lastName = lName;
		street = str;
		city = c;
		province = p;
		postalCode = postalC;
		//reflect the changes in the parameter
	}
	

	//create changeCity method that asks the user their city and records city in a variable above
	public void changeCity(String newCity)
	{
		city = newCity;
	}
	//create changeStreet method that asks the user their street and records street in a variable above
	public void changeStreet(String newStreet)
	{
		street = newStreet;
	}
	//create changeProvince method that asks the user their province and records province in a variable above
	public void changeProvince(String newProvince)
	{
		province = newProvince;
	}
	//create changePostalCode method that asks the user their postal code and records postal code in a variable above
	public void changePostalCode(String newPostalCode)
	{
		postalCode = newPostalCode;
	}


	/** 
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Customer object has 
	 * been returned.
	 */
	public String toString() {
		String custString;

		//update this string so that it contains the street, city, province, and postal code
		custString = firstName + " " + lastName + "\n" + street + " " + city + " " + province + " " + postalCode;
	 	return(custString);
	}

}
