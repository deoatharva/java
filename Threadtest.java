class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("from thread i :"+i);
		}
		System.out.println("exit from a");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("from thread b : j "+j);
		}
		System.out.println("exit from b");
	}
}
class C extends Thread
{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println("from thread c");
		}
		System.out.println("exit from c");
	}
}
class Threadtest
{
	public static void main(String[] args) {
	new A().start();
	new B().start();
	new C().start();
	
	}
}