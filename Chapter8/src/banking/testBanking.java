package banking;

public class testBanking {

	public static void main(String[] args) 
	{
		
		PersonalAcct t1 = new PersonalAcct("Joseph", "Stalin", 98);
		System.out.println(t1.getBalance());

		BusinessAcct t2 = new BusinessAcct("Vladmir", "Putin", 1000000);
		System.out.println(t2.getBalance());
		
		t1.withdraw(40);
		t2.withdraw(1000000);
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());
	}

}
/* Screen Dump
 
98.0
1000000.0
you have $56 in your account.
you have $0 in your account.

*/