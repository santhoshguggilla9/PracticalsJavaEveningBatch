package staticDemo;

class staticBlock
{
	int x;
	static int y;
	
	static
	{
		//x=100; // ERROR - No entrace for non static varaibles.
		y=200;
		System.out.println("this is static block");
		// show(); // ERROR - No entrace for non static methods.
	}
	void show()
	{
		System.out.println("show is called");
		System.out.println("static y inside show value is " +y);
		display();
	}
	static void display()
	{
		System.out.println("static dislay called ");
		System.out.println("static y inside display value is " +y);
	}
}

public class StaticBlockExample {

	public static void main(String[] args) 
	{
		staticBlock obj = new staticBlock();
		obj.show();
	}

}
