package methodsDemo;

class sum
{
	public void add(int x, int y)
	{
		System.out.println("Values recieved: " +x + "," + y);
	}
	public void add(int x, int y, int z)
	{
		System.out.println("Values recieved: " +x + "," + y + "," +z);
	}
	public void add(int x, double y)
	{
		System.out.println("Values recieved: " +x + "," + y);
	}
	public void add(int x, String str)
	{
		System.out.println("Values recieved: " +x + "," + str);
	}
}
public class SumofIntegersExample {

	public static void main(String[] args) 
	{
		sum s1 = new sum();
		
		s1.add(100, "EduBridge");
		s1.add(20,20);
		s1.add(10,20,30);
		s1.add(20, 23.45);
	}
}
