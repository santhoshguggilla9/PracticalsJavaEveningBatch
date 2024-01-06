package methodsDemo;

class methodcall
{
		//method without arguments without returntype
		//method definition
		public String someone(String s)
		{
			
			System.out.println("value recieved is: " +s);
			return "handover this bag too";
		}
}
public class MethodSampleExample {

	public static void main(String[] args) {
	
		methodcall c1 = new methodcall();
		
		String reciever;
		
		System.out.println("i am going to call the someone method...");
		//calling a method
		reciever = c1.someone("bag");
		
		System.out.println("reciver recived the value is: " +reciever);
		
		
				
	}
	

}
