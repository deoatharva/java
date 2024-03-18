
abstract class Vehicles
{
	public abstract void noofwheels();

	public void disp()
	{
		System.out.println("Normal method of abstract class");
	}
}
class Car extends Vehicles
{
	public void noofwheels()
	{
		System.out.println("A car has 4 wheels");
	}
}
public class AbstractDemo
{
	public static void main(String args[])
	{
		Vehicles v;
		System.out.println("variable of Vehicles datatype created");
		//v=new Vehicles();
		Car c=new Car();
		c.disp();
		c.noofwheels();
	}
}