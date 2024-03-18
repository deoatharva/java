//to implement the concept of interfaces
interface Vol
{
	final static float pi = 3.14f;
	float compute(float x,float y);
}
class Cone implements Vol
{
	public float compute(float x,float y)
	{
		return(pi*x*x*y/3);
	}
}
class Sphere implements Vol
{
	public float compute(float x,float y)
	{
		return(4/3*pi*x*x*x);
	}
}

class InterfaceDummy
{
	public static void main(String[] args) {
		Cone c = new Cone();
		Sphere s = new Sphere();
		Vol v;
		v = c;
		System.out.println("Area of Cone " +v.compute(10,30));
		v = s;   
		System.out.println("Area of sphere " +v.compute(15,20));
		
	}
}