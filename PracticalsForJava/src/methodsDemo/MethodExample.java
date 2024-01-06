package methodsDemo;

class methoddemo
{
	public int show(int x)
	{
		System.out.println("show called");
		System.out.println(x);
		return x+x;
	}
}
public class MethodExample {

	public static void main(String[] args) 
	{
		methoddemo obj = new methoddemo();
		int result;
		
		result = obj.show(10);
		
		System.out.println(result);

	}

}
