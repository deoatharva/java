import java.awt.*;

public class Banner extends Frame implements Runnable
{
	Thread t1;
	String msg="A simple moving banner";
	boolean stopflag;
		
	public Banner()
	{
		setLayout(new FlowLayout());
		t1=new Thread(this);
		t1.start();
	}
	
	public void run()
	{
		char ch;
		for(;;)
		{
			try
			{
				ch=msg.charAt(0);
				msg=msg.substring(1,msg.length());
				msg+=ch;
				if(stopflag)
					break;	
				Thread.sleep(500);
				repaint();
			}
			catch(InterruptedException e)
			{
				System.out.println("problem!");
			}
		}	
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,50,50);
	}	

	public static void main(String args[])
	{
		Banner b=new Banner();
		b.setSize(400,400);
		b.setVisible(true);
	}
}