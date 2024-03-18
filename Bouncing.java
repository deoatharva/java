//BouncingBall.java
import java.awt.*;

public class BouncingBall extends Frame implements Runnable
{
	int i,j;
	Thread t;
	int ctr=0;

	public BouncingBall()
	{
		setLayout(new FlowLayout());
		i=20;
		j=20;
		setBackground(Color.white);
		setForeground(Color.red);
		t=new Thread(this);
		t.start();
	}
	
	public void run()
	{
		while(true)
		{
		
			System.out.println("i="+i);
			System.out.println("j="+j);	
			if(i==400)
			{
				i=20;
				j=20;
			}
			j+=20;
			if(j==200)
			{
				ctr=ctr+20;
				System.out.println("The value of ctr is " + ctr);
				j=ctr;
				i=i+20;
			}
			repaint();
			try
			{
				t.sleep(100);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
	public void paint(Graphics g)
	{
		g.fillOval(i,j,50,50);
		g.drawLine(0,230,200,230);
		g.drawLine(200,230,210,400);
	}

	public static void main(String args[])
	{
		BouncingBall bb=new BouncingBall();
		bb.setSize(400,400);
		bb.setVisible(true);
	}
	
}