package exceptionsDemo;

public class ExceptionHandleExample {

	public static void main(String[] args) {

		int x=10;

		try
		{
			int y = x/0;
			System.out.println("y val: " +y);

			String z="SBI10";
			
				y = Integer.parseInt(z);

				System.out.println(y);
		}
			catch(NumberFormatException e)
			{
				System.out.println("Type of error is " + e);
			}
		
			catch(Exception e)
			{
				System.out.println("Type of error is " + e);
			}
	}
}