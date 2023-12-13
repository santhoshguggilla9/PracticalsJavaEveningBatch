package basicsDemo;

public class SwitchExample {

	public static void main(String[] args) {
		
		
		char letter = 'A';
		String str = "Beginner";
		int age=18;
				
		switch(age)
		{
		
		case 18:
			System.out.println("Level 1");
			break;
			
		
		default:
			System.out.println("wrong expression");
			//System.out.println("this is end of switch");
		}
		System.out.println("this is out of the switch");
	}

}
