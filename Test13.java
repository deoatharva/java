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
		int result= dobj.super.calc(10,20);
		System.out.println(result);
		

		/*Base bobj = new Derived();
		int r = bobj.calc(10,20);
		System.out.println(r);*/
	}
}
/*what if
Derived.super.calc(10,20);
Derivedcalc(10,20);*/


