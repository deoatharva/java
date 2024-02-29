class X implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("threadX : "+i);
		}
		System.out.println("end of threadX ");
	}
}
class RunnableTest
{
	public static void main(String[] args) {
		X runnable = new X();
		Thread ThreadX = new Thread(runnable);
		ThreadX.start();
		System.out.println("End of main thread");
	}
}