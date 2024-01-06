package classAndObjectDemo;

class GS
{
	private int age;
	String sname;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
}
public class GettersandSettersExample {

	public static void main(String[] args) {
		
		GS obj = new GS();
		
		obj.setAge(10);
		obj.setSname("san");
		
		System.out.println(obj.getAge());
		System.out.println(obj.getSname());

	}

}
