package staticDemo;


class MyDate
{
private int dd, mm, yy ;
void show()
{
System.out.println ( "Reached here" ) ;
System.out.println ( this ) ;
}
}
public class MyClass {

	public static void main(String[] args) {
		
		MyDate obj = new MyDate();
		obj.show();
	}

}