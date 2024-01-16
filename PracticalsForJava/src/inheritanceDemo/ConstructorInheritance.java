package inheritanceDemo;

class student
{
	int r;
	String name;
	student(int rno, String sname)
	{
		r=rno;
		name=sname;
	}
}
class marks extends student
{
	int sum,m,n;
	double a;
	marks(int m1,int m2)
	{
		super(12,"santhosh");
		m=m1;
		n=m2;
		sum=m1+m2;
		a= sum/2;
	}
}
class result extends marks
{
	result()
	{
		super(55,75);

		System.out.println("Sname: " + name);
		System.out.println("rno: " + r);
		System.out.println("m1: " + m);
		System.out.println("m2: " + n);
		System.out.println("Total Marks: " + sum);
		System.out.println("avg of Marks: " + a);
	}
}
public class ConstructorInheritance {

	public static void main(String[] args) {

		result coll = new result();
	}

}
