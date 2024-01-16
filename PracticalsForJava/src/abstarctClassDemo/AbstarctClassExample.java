package abstarctClassDemo;

//abstract class
abstract class calc
{
	abstract public void sum(int x, int y);
	abstract public void sub(int x,int y);
	
	public void mul(int x, int y)
	{
		System.out.println("Mul: " +(x*y));
	}
}
abstract class advcalc extends calc
{
	abstract public void div(int x,int y);
	abstract public void mod(int x,int y);
	
}
class myclass extends advcalc // concreate class
{
	@Override
	public void sum(int x, int y) {
		System.out.println("sum: " +(x+y));
	}
	@Override
	public void sub(int x, int y) {
		System.out.println("sum: " +(x-y));
	}
	@Override
	public void div(int x, int y) {
		System.out.println("sum: " +(x/y));
		
	}
	@Override
	public void mod(int x, int y) {
		System.out.println("sum: " +(x%y));
		
	}
}
public class AbstarctClassExample {

	public static void main(String[] args) {

		myclass obj = new myclass();
		
		obj.sum(10, 20);
		obj.sub(4, 2);
		obj.mul(2, 2);
	}
}
