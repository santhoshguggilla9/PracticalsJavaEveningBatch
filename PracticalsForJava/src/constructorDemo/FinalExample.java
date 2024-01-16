package constructorDemo;

public class FinalExample {

	final int bikeSpeed = 90; // final varaible is assigned with value 90.
	
	public void drive()
	{
		//bikeSpeed =200; // we can not change the value of final varaible
		System.out.println("bike is moving with " + bikeSpeed + " speed");
	}
	
	public static void main(String[] args) 
	{
		FinalExample f1 = new FinalExample();
		
		f1.drive();

	}

}
