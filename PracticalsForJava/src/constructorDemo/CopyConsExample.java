package constructorDemo;

class student
{
	int age;
	String sname;
	
	student()
	{
		age=30;
		sname="varun";
	}
	student(student s)
	{
		age=s.age;
		sname=s.sname;
	}
	public void showstud()
	{
		System.out.println("age:" +age +"sname: " +sname);
	}
}
public class CopyConsExample {

	public static void main(String[] args) 
	{
		student sobj = new student();
		student sobj1 = new student(sobj);
		
		sobj.showstud();
		sobj1.showstud();
	}
}
