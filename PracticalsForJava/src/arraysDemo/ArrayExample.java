package arraysDemo;

public class ArrayExample {

	public static void main(String[] args) {

		//Creating an array
		int[] arr = new int[5];
		
		//initilising the array
		int[] nums = {1,3,4};
		
		//assigning the values to array
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		
		//retrieving the values from the array
		System.out.println("length of an array:" +nums.length);
		System.out.println("value of num:" +nums[0]);
		System.out.println("value of num:" +nums[1]);
		System.out.println("value of num:" +nums[2]);
		System.gc();// explicitly calling the garbage collector
		
		
	}
}
