package collectionsDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class customers
{
	private int age;
	private String name;
	
	customers(int age, String name)
	{
		this.age=age;
		this.name=name;
	}

	@Override
	public String toString() {
		return "customers [age=" + age + ", name=" + name + "]";
	}
}
public class CollectionsObjectsExam {

	public static void main(String[] args) {
		
		List<customers> accs = new LinkedList<customers>();
		
		customers c1 = new customers(101,"santhosh");
		customers c2 = new customers(102,"kumar");
		customers c3 = new customers(103,"rahul");
		customers c4 = new customers(104,"mani");
		customers c5 = new customers(105,"varun");
		
		
		accs.add(c1);
		accs.add(c2);
		accs.add(c3);
		accs.add(c4);
		accs.add(c5);
		
		//System.out.println(accs);
		
		Iterator<customers> itr = accs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
//		for(customers customer : accs)
//		{
//			System.out.println(customer);
//		}
	}

}
