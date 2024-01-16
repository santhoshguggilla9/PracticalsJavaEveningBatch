package inheritanceDemo;

class A
{
	int x = 10;
	
	public void show()
	{
		System.out.println("Super x: " +x);
	}
}
class B extends A
{
	int x=20;
	
	public void show()
	{
		System.out.println("sub x: " +x);
	}
	public void display()
	{
		super.show();
		show();
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.display();
	}
}
