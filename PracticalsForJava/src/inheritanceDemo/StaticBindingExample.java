package inheritanceDemo;

class human
{
	int age=10;
	
	public void showAge()
	{
		System.out.println("age is "+age);
	}
	public void showhuman()
	{
		System.out.println("human method running");
	}
}
class rakesh extends human
{
	public void showAge()
	{
		System.out.println("this is age of rakesh");
	}
	public void showrakesh()
	{
		System.out.println("rakesh method running");
	}
}
public class StaticBindingExample {

	public static void main(String[] args) {
		
		human r1 = new rakesh();
		r1.showAge();
		r1.showhuman();
		((rakesh) r1).showrakesh(); // down casting object reference from super to sub class 
	}
}
