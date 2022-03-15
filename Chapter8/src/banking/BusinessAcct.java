package banking;

import java.text.NumberFormat;

public class BusinessAcct extends Account 
{
	public double balance;
	public BusinessAcct(String f, String l, double b) 
	{
		
		super(f, l); //calling from account methods
		balance = b;
	}
	
	public double getBalance()
	{
		return(balance);
	}
	
	public void withdraw(double x)
	{
		if(balance >= x)
		{
			if(x >= 500) //logic for extra charge on banking accounts
			{
				balance = balance - x;
			}
			else
			{
				balance = balance - x - 10;
			}
		}
		
	}
	public void deposit(double added)
	{
		balance = balance + added;
	}
	
	
	public String toString()
	{
		NumberFormat money = NumberFormat.getInstance();
		return("you have $" + money.format(balance) + " in your account.");
	}
}