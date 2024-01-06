package constructorDemo;

class bank
{
	private int accno;
	private String accName;
	
	bank(int acno, String acname) //Constructor for bank 
	{
		accno=acno;
		accName=acname;
	}
	public void showbank()
	{
		System.out.println("Acc No:" + accno + " - " + " Acc Name:" + accName);
	}
	protected void finalize()
	{
		System.out.println("finalise called");
	}
}
public class ConstructorExample {

	public static void main(String[] args) 
	{
		bank obj1 = new bank(101,"Santhosh");
		obj1.showbank();
		
		bank obj2 = new bank(102,"Varun");
		obj2.showbank();
	
		

	}

}
