package basicsDemo;

import java.util.Scanner;

class Bank
{
	Scanner reader=new Scanner(System.in);
	
	private int passwd, amount, total=10000;
	private String accName, transaction;
	
	void getAcc()
	{
		System.out.println("Enter your User Name: ");
		accName=reader.nextLine();
		reader.reset();
		System.out.println("Enter your Password: ");
		passwd=reader.nextInt();
		System.out.println("Enter your mode of transaction: ");
		transaction=reader.nextLine();
		System.out.println("Enter your the amount: ");
		amount=reader.nextInt();

		accountHolders();
	}
	private void accountHolders()
	{
		if(accName=="Bheema" && passwd==12345)
		{
			if(transaction=="deposit")
			{
				total=total+amount;
				System.out.println("Your Account deposited by "+ amount + " and total balance is: "+total);	
			}
			else if(transaction=="withdrawal")
			{
				if(total>=amount)
				{
					total=total-amount;
					System.out.println("Your Account deposited with "+ amount + " and total balance is: "+total);
				}
				else
					System.out.println("Insufficient balance");
			}
			else if(transaction=="balance")
				System.out.println("Your account balance is: " + total);
		}
	}
}
public class ProjDemo {

	public static void main(String[] args) {
		
		Bank bank=new Bank();
		bank.getAcc();
	}

}
