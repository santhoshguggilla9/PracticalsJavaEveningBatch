package basicsDemo;

class first
{
	public void sum(int i, int j)
	{
		System.out.println("sum: " +(i+j));
	}
}
class second
{
	first ob = new first();
	public void add(int x,int y)
	{
		ob.sum(x,y);
	}
}
public class PracticeEample {

	public static void main(String[] args) 
	{
			second obj = new second();
			
			obj.add(20, 30);
	}
}
