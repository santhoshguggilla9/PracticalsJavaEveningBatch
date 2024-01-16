package collectionsDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		
		List<Integer> nums = new LinkedList<Integer>();
		
		nums.add(200);
		nums.add(700);
		nums.add(800);
		nums.add(900);
		nums.add(300);
		
		System.out.println(nums);

		System.out.println("the size of list: " +nums.size() );
		System.out.println("the value at index 2: " +nums.get(2));
		System.out.println("value removed at index 1: " +nums.remove(1));
//		System.out.println("value removed: " +nums.remove(900));
		
		
		Iterator<Integer> itr = nums.iterator();
		while(itr.hasNext())
		{
			if(nums.contains(200))
				System.out.println("value found");
			else
				System.out.println("not found");
		}
	}

}
