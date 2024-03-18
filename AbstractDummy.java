abstract class Computer
{
	public abstract void no_of_ram();
	public void disp()
	{
		System.out.println("Normal abstract class method");
	}
}
class Memory extends Computer
{
	public void no_of_ram()
	{
		System.out.println("Memory of 8 gb ram");
	}
}
public class AbstractDummy
{
	public static void main(String args[])
	{
		Computer c;
		System.out.println("variable of Computer datatype is created");
		Memory m = new Memory();
		m.disp();
		m.no_of_ram();
	}
	
}