class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			if(i==1) yield();
			System.out.println("from threads A : i ="+i);
		}
		System.out.println("exit from A");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("from threads b: j "+j);
			if(j==3) stop();
		}
		System.out.println("exit from B");
	}
}
class C extends Thread
{
	public void run()
	{
		for (int k=1;k<=5;k++) {
			System.out.println("from threads C : k "+k);
			if(k==1)
				try
					{
						sleep(1000);
					}
				catch(Exception e)
					{

					}
		}
		System.out.println("exit from C");
	}
}
class ThreadMethods
{
	public static void main(String[] args) {
		A threadA=new A();
		B threadB=new B();
		C threadC=new C();
		System.out.println("start thread A");
		threadA.start();
		System.out.println("start thread B");
		threadB.start();
		System.out.println("start thread C");
		threadC.start();
	}
}