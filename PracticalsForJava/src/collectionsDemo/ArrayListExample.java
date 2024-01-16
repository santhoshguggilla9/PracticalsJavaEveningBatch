package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> cars = new ArrayList<String>();
		
		cars.add("Hyundai");
		cars.add("Honda");
		cars.add("Tata");
		cars.add("Ford");
		cars.add("Kia");
	
		System.out.println(cars);
//		System.out.println("the size of list: " +cars.size() );
//		System.out.println("the value at index 2: " +cars.get(2));
//		System.out.println("value removed at index 1: " +cars.remove(1));
//		System.out.println("KIA value removed: " +cars.remove("Kia"));
		
//		System.out.println("Values are adding...");
//		cars.add("Nissan");
//		cars.add("Mahindra");
//		
//		Collections.sort(cars);
//	
//		
//		System.out.println("value at index 2" + cars.get(2));
//		
//		Iterator<String> itr = cars.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println("value inside list: " +itr.next());
//		}
//		
//		for(String car : cars)
//		{
//			System.out.println(car);
//		}
	}

}
