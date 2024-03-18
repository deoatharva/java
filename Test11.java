class Base
{
	public int calc(int x,int y)
	{
		System.out.println("Base");
		return(x+y);
	}
}
class Derived extends Base
{
	public int calc(int x,int y)
	{
		System.out.println("Derived");
		return(x-y);
	}
}
class Test
{
	public static void main(String args[])
	{
		Derived dobj=new Derived();
		int result= dobj.calc(10,20);
		System.out.println(result);
	}
}
