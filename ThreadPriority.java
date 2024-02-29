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
class ThreadPriority
{
	public static void main(String[] args) {
	A threadA = new A();
	B threadB = new B();
	C threadC = new C();
	threadC.setPriority(Thread.MAX_PRIORITY);
	threadB.setPriority(Thread.MAX_PRIORITY);
	threadA.setPriority(Thread.MAX_PRIORITY);
	System.out.println("start thread A");
	threadA.start();
	System.out.println("start thread B");
	threadB.start();
	System.out.println("start thread C");
	threadC.start();
	}
}