package innerClassDemo;

class outerClass
{
	int x =10;
	
	class innerClass
	{
		int y = 20;
	}
}


public class InnerClassExample {

	public static void main(String[] args) 
	{
		outerClass oobj = new outerClass();
		outerClass.innerClass iobj = oobj.new innerClass(); 
		
		System.out.println(oobj.x);
		System.out.println(iobj.y);
	}
}
