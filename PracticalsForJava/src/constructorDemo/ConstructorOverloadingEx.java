package constructorDemo;

class Human
{
	Human(){}; //Dummy Constructor
	
	Human(int hid, String H_Name)
	{
		System.out.println("Human id:" + hid + "Human Name: " +H_Name);
	}
	Human(int hid)
	{
		System.out.println("Human id:" + hid);
	}
	Human(String H_Name)
	{
		System.out.println("Human Name: " +H_Name);
	}
}

public class ConstructorOverloadingEx {

	public static void main(String[] args) 
	{
		Human obj = new Human(); 
		Human obj0 = new Human(101,"raj");
		Human obj1 = new Human(102);
		Human obj2 = new Human("Varun");
	}

}
