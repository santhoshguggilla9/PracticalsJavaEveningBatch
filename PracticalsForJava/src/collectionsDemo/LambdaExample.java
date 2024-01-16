package collectionsDemo;

interface bigger
{
	public int big(int x, int y);
}

public class LambdaExample {

	public static void main(String[] args)
	{
		bigger obj = (x, y) -> x*y;

		int res= obj.big(20, 30);
		System.out.println("Result: " +res);
	}
}
