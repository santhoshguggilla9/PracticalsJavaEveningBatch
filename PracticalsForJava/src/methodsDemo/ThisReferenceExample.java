package methodsDemo;

class thisExam
{
	int x;
	
	public void setx(int x)
	{
		this.x=x;
		System.out.println(x);
	}
}

public class ThisReferenceExample {

	public static void main(String[] args) {
		
		thisExam e1 = new thisExam();
		e1.setx(10);
	}

}
