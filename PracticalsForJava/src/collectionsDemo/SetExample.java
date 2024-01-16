package collectionsDemo;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		Set<String> cars = new HashSet<String>();

		cars.add("Hyundai");
		cars.add("Honda");
		cars.add("Tata");
		cars.add("Ford");
		cars.add("Kia");
		
		
		System.out.println(cars);
	}

}
