package inheritanceDemo;

class car
{
	public void run()
	{
		System.out.println("Car is running");
	}
	public void brake()
	{
		System.out.println("applied Brake");
	}
}
// Single Inheritance
// is-a relationship
class Hyundai extends car
{
	public void gears()
	{
		System.out.println("Now, new feature added to car");
	}
}
public class SingleInheritanceExample  {

	public static void main(String[] args) 
	{
		Hyundai c1= new Hyundai();
		
		c1.run();
		c1.brake();
	}

}
