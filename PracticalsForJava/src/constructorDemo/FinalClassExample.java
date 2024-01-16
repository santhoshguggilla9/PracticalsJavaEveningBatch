package constructorDemo;

class bikes
{
	final int speed=100;
	
	public void run()
	{
		System.out.println("bike is running with" + speed+ " speed");
	}
}
class heros extends bikes // bikes class can not extend with heros class
{
	public void run()
	{
		//super.run();
		System.out.println("bike is running with 200 speed");
	}
}
public class FinalClassExample {

	public static void main(String[] args) {
		
		heros h1 = new heros();
		
		h1.run();
	}
}
