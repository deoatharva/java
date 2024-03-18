class Base
{
	protected int x;
	/*Base(int x)
	{
		this.x=x;
	}	
	//private int x;
	*/
	/*public int valueX(int x)
	{
		this.x=x;
		
	}*/
	public void setX(int x)
	{
		this.x=x;
	}
	public int getX(int x)
	{
		return(x);	
	}
}

	//sub		//super
class Derived extends Base
{	
	//private int y;
	protected int y;
	Derived()
	{
			
		super(x);
		this.y=y;
	}
	
	public void setY(int y)
	{
		this.y=y;
	}
	public int getY(int y)
	{
		return(y);
	}
}
/*class Derived1 extends Derived
{
	private int result;
	public int calcResult()
	{
		result=x*y;
		return(result);
	}
	public void setXY(int x,int y)
	{
		//super.setX(x);
		//super.setY(y);
		super.x=x;
		super.y=y;
	}
}*/
class Test8
{
	public static void main(String args[])
	{
		Derived dobj = new Derived(10,25);
			//int yval=dobj.y;
			//int result=dobjvalueX(10) * dobjvalueY(10);
			//dobj.setX(10);
			//dobj.setY(10);
			//int result=dobj.getX(10) * dobj.getY(10);
			//dobj.setXY(10,20);
			//int x1=dobj.x;
			//dobj.x=100;
			//System.out.println(dobj.calcResult());
		System.out.println(dobj.getX());
		System.out.println(dobj.getY());
	}
}


