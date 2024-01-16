package interfaceDemo;

interface motors
{
	public void run(); // all the methods inside the interface are abstract bydefault.
	public void speed();
}
interface engine extends motors
{
	public void start();
	public void stop();
}
class HP implements engine //concreate class
{
	@Override
	public void run() {
		System.out.println("Motor is running");
	}
	@Override
	public void speed() {
		System.out.println("Speed of the motor is 10hp");
	}
	@Override
	public void start() {
		System.out.println("engine is started");
	}
	@Override
	public void stop() {
		System.out.println("engine stopped");
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		HP h1 = new HP();
		h1.run();
		h1.speed();
		h1.start();
		h1.stop();
	}
}
