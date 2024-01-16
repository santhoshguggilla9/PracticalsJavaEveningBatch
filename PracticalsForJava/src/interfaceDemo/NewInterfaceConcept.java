package interfaceDemo;

interface car
{
	public void mileage();
	public void gears();
}
class maruthi
{
	int model_no=101;
	String model_name="maruthi 800";
	
	public void model()
	{
		System.out.println("Model No: " + model_no);
		System.out.println("Model Name: " + model_name);
	}
}
class advCar extends maruthi implements car // implementing car's methods while extending the class maruthi
{
	@Override
	public void mileage() {
		System.out.println("car Mileage is 100");
	}
	@Override
	public void gears() {
		System.out.println("car has 5 gears");
	}
}
public class NewInterfaceConcept {

	public static void main(String[] args) {
		advCar a1 = new advCar();
		a1.mileage();
		a1.gears();
		a1.model();

	}

}
