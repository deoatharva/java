public class ThreadDemo3 extends Thread
{
	Thread t=new Thread(this);
	public void disp()
	{
		t.start();
	}

	public void run()
	{
		char str[]={'H','e','l','l','o'};
		for(int ctr=0;ctr<5;ctr++)
		{
			System.out.println(str[ctr]);
			try
			{
				t.sleep(1000);
				System.out.println(t.isAlive());
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex);
			}
		}
	}
	public static void main(String args[])
	{
		ThreadDemo3 obj=new ThreadDemo3();
		obj.disp();
	}
}