package staticDemo;

class staticVar
{
	static int x;

	void showx()
	{
		System.out.println("x val is: " + x);
	
	}
}
public class StaticVaraibleExample {

	public static void main(String[] args) 
	{
		
		staticVar obj1 = new staticVar();
		staticVar obj2 = new staticVar();
		staticVar obj3 = new staticVar();
		
		staticVar.x= 500;
		obj1.showx();
		
		staticVar.x=300;
		obj1.showx();
		obj2.showx();
		obj3.showx();

	}

}
