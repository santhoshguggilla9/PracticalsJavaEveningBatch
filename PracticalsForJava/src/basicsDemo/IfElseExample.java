package basicsDemo;

public class IfElseExample {

	public static void main(String[] args) {
		
		int pin;
		float amt;
		
		pin=123;
		
		if(pin==123)
		{
			System.out.println("Hey!!, you have given the correct pin");
			amt=10000;
			System.out.println("you can withdraw the amount " + amt);
		}
		else
		{
			System.out.println("Invalid Pin");
		}
		System.out.println("there is no Money");
	}

}
