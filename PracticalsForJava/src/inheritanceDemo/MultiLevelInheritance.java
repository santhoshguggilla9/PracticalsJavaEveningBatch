package inheritanceDemo;

class animal
{
	public void weep()
	{
		System.out.println("Dog is weeping");
	}
	public void bark()
	{
		System.out.println("dog is barking");
	}
}
class Dog extends animal
{
	public void walk()
	{
		System.out.println("Dog is walking");
	}
}
class cat extends animal
{
	public void sleep()
	{
		System.out.println("Cat is sleeping");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		cat a1 = new cat();
		Dog b1 = new Dog();
		
		//b1.sleep();//Dog can not access the property of cat
		
		a1.bark();
		//a1.walk();// cat can not access the property of Dog
		a1.sleep();

	}

}
