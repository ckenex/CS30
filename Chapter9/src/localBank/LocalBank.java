package localBank;

/*
 * LocalBank.java from Chapter 9
 * Chapter 9 Case Study
 * Lawrenceville Press
 * August 21, 2011
 */

 /**
  * A bank where accounts can be opened or closed and customers can
  * make transactions.
  */

 import java.util.Scanner;

 public class LocalBank {

	public static void main(String[] args) {
		Bank easySave = new Bank();
		Scanner input = new Scanner(System.in);
		String action, acctID;
		Double amt;
		String fn, ln, s, c, p, pc;
		/* display menu of choices */
		do {
			System.out.println("\nDeposit\\Withdrawal\\Check balance");
			System.out.println("Add an account\\Remove an account");
			System.out.println("Quit\n");
			System.out.print("Enter choice: ");
			action = input.next();

			if (action.equalsIgnoreCase("A")) 
			{
				easySave.addAccount();
			} 
			else if (!action.equalsIgnoreCase("Q")) 
			{
				System.out.print("Enter account ID: ");
				acctID = input.next();
				if (action.equalsIgnoreCase("D")) {
					System.out.print("Enter deposit amount: ");
					amt = input.nextDouble();
					easySave.transaction(1, acctID, amt);
				} else if (action.equalsIgnoreCase("W")) {
					System.out.print("Enter withdrawal amount: ");
					amt = input.nextDouble();
					easySave.transaction(2, acctID, amt);
				} else if (action.equalsIgnoreCase("C")) {
					easySave.checkBalance(acctID);
				} else if (action.equalsIgnoreCase("R")) {
					easySave.deleteAccount(acctID);
				} else if (action.equalsIgnoreCase("M"))
				{	
					System.out.println("Enter firstname: ");
					fn = input.next();
					System.out.println("Enter lastname: ");
					ln = input.next();
					System.out.println("Enter new street: ");
					s = input.next();
					System.out.println("Enter new city: ");
					c = input.next();
					System.out.println("Enter new province: ");
					p = input.next();
					System.out.println("Enter new postal code: ");
					pc = input.next();
					easySave.modifyAccount(acctID, 1, fn, ln, s, c, p, pc);
				}
				//write code to modify information if action equals "M"
			}
		} while (!action.equalsIgnoreCase("Q"));
	}
}

 /* Screen Dump
 
 Deposit\Withdrawal\Check balance
Add an account\Remove an account
Quit

Enter choice:  Add an account
Enter account ID: 
Deposit\Withdrawal\Check balance
Add an account\Remove an account
Quit

Enter choice: Enter account ID: 132

Deposit\Withdrawal\Check balance
Add an account\Remove an account
Quit

Enter choice: D
Enter account ID: 132
Enter deposit amount: 10000
Account does not exist.

Deposit\Withdrawal\Check balance
Add an account\Remove an account
Quit

Enter choice: M
Enter account ID: 132
Enter firstname: 
c
Enter lastname: 
k
Enter new street: 
cresent
Enter new city: 
calgary
Enter new province: 
alberta
Enter new postal code: 
pppooo

Deposit\Withdrawal\Check balance
Add an account\Remove an account
Quit

Enter choice: Quit
Enter account ID: 132

Deposit\Withdrawal\Check balance
Add an account\Remove an account
Quit

Enter choice:  Q

 
 */