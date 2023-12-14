package classAndObjectDemo;

class sample
{
	private int x=10;
	public int y;
	protected int z;

	public void showx()
	{
		System.out.println("x value is " + x);
	}	
}

public class ClassObjectExample {

	public static void main(String[] args) 
	{
		sample obj = new sample();
		sample obj1 = new sample();
		sample obj2 = new sample();

		obj.showx();
		


	}

}
