package constructorDemo;

class bike
{
	public final void run()
	{
		System.out.println("bike is running");
	}
}
class hero extends bike
{
//	public void run()// can not override the methods run due to its final
//	{
//		System.out.println("bike is running with 200 speed");
//	}
}
public class FinalMethodExample {

	public static void main(String[] args) {
		
		hero b1 = new hero();
		
		b1.run();
	}

}
