package constructorDemo;

class School
{
	int rno;
	String sname;
	double avg;
	
	School(){}; //Dummy Constructor
	School(int r, String s, double d)
	{
		rno=r;
		sname=s;
		avg=d;
	}
	
	School(String s, double d)
	{
		sname=s;
		avg=d;
	}
	public void printStud()
	{
		System.out.println("Student name: " + sname);
		System.out.println("Student rno: " + rno);
		System.out.println("Student avg: " + avg);
	}
}

public class ConsExample 
{
	public static void main(String[] args) 
	{
		School teacher = new School();	
		
		School stud1 = new School(101,"Santhosh", 94.40);
		School stud2 = new School("rahul", 95.00);
	
		stud1.printStud();
		stud2.printStud();
	}
}
