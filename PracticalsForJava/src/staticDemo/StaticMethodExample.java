package staticDemo;

class staticMethod
{
	int x =100;
	static int y=200;
	
	public void show()
	{
		System.out.println("show method called");
		System.out.println("static y: " +y);
	}
	static void display()
	{
		System.out.println("static y: " +y);
		//System.out.println("non-static x: " +x);
		System.out.println("static display method called");
	}
	
}

public class StaticMethodExample {

	public static void main(String[] args) 
	{
		staticMethod obj = new staticMethod();
		staticMethod.display();// instead of using obj ref , we can call a static method using classname
		
		staticMethod.y=300;
		obj.show();
		
		
		
	}

}
