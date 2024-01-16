package abstarctClassDemo;

abstract class bank
{
	abstract public void addInt();
}

class sbi
{
	public void addUser()
	{
		System.out.println("User added -sbi");
	}
	
}
class hdfc extends bank
{
	public void addUser()
	{
		System.out.println("User added-hdfc");
	}

	@Override
	public void addInt() {
		// TODO Auto-generated method stub
		
	}
	
}
class axis extends bank
{
	public void addUser()
	{
		System.out.println("User added-axis");
	}

	@Override
	public void addInt() {
		// TODO Auto-generated method stub
		
	}
	
}
class icici
{
	public void addUser()
	{
		System.out.println("User added-icici");
	}
	
}
public class BankAbstractionExample {

	public static void main(String[] args) {
		

	}

}
