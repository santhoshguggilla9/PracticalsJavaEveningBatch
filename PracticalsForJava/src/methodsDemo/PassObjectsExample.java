package methodsDemo;

class passObjects
{
	int x;
	
	public int addx(passObjects obj1,passObjects obj2)
	{
		return obj1.x + obj2.x;
	}
}

public class PassObjectsExample {

	public static void main(String[] args) 
	{
		int result;
		
		passObjects ob1 = new passObjects();
		passObjects ob2 = new passObjects();
		passObjects ob3 = new passObjects();
		
		ob1.x=10;
		ob2.x=20;
		
		result= ob3.addx(ob1,ob2);
		System.out.println("the sum of ob1 and ob2 is: " +result);
		
	}

}
