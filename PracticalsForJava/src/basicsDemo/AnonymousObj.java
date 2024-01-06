package basicsDemo;

class sample
{
	int age;
	String name;

	public sample copyObj(sample ob) 
	{
		age=ob.age;
		name=ob.name;
		return ob;
	
	}
	public void show()
	{
		System.out.println("age: " + age);
		System.out.println("Sname: " + name);
	}
}
public class AnonymousObj {

	public static void main(String[] args) 
	{
		//array of objects
		sample [] obj = new sample[4];
		
		obj[0].age=25;
		obj[0].name="kumar";
		
		//passing object to method 
		obj[2] = obj[1].copyObj(obj[0]);
		//assigning values from one object to another object
		obj[3]=obj[2];
		
		obj[0].show();
		obj[1].show();
		obj[2].show();
		obj[3].show();
	}
}
