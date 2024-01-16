package exceptionsDemo;

public class ArrayoutofBoundsExample {

	public static void main(String[] args) {
		
		int [] arr = { 23,22,24,25 };
		
		try
		{
			System.out.println("array value: " +arr[2]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			for(int value : arr)//enhanced for loop
			{
				System.out.println("arr value: " +value);
			}
		}
		finally
		{
			System.out.println("Finally executed");
		}
	}

}
