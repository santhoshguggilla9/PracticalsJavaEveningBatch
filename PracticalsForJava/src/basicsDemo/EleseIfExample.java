package basicsDemo;

public class EleseIfExample {

	public static void main(String[] args) {

		int vid,adhar,pan=12;

		vid=100;
		adhar =1234;

		if(vid==100)
			System.out.println("You can cast you vote");
		else
			System.out.println("first else block");
		if(adhar==12345)
			System.out.println("Hey, You can cast you vote");
		else
			System.out.println("second else");
		if(pan==12)
			System.out.println("Pan allowed");
		else
			System.out.println("YOU ARE NOT ALLOWED TO CAST THE VOTE");


	}

}
