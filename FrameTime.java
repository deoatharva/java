import java.util.*;
public class FrameTime implements Runnable
{
	Thread t;
	String msg;
	
	public FrameTime()
	{
		msg=" ";
		t=new Thread(this);
		t.start();
	}

	public void run()
	{	
		for(;;)
		{
			try
			{
				GregorianCalendar cal=new GregorianCalendar();
				msg=cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);
				t.sleep(1000);
				System.out.println(msg);
			}
			catch(InterruptedException e)
			{
				System.out.println("interrupted");
			}
		}
	}	

	public static void main(String args[])
	{
		FrameTime ft=new FrameTime();
	}
}