import java.awt.*;

public class AnimationFrame extends Frame implements Runnable
{
	Image img[];
	Thread t;
	int i;

	public AnimationFrame()
	{
		setLayout(new FlowLayout());
		i=0;
		img=new Image[5];
 		Toolkit tk = Toolkit.getDefaultToolkit();
				
		for(;i<5;i++)
		{
			img[i]=tk.getImage("party"+i+".jpg");
		}
		i=0;
		t=new Thread(this);
		t.start();
	}

	public void run()
	{
		for(;;)
		{
			repaint();
			i++;
			if(i==5)
				i=0;
			try
			{
				t.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}	
	}

	public void paint(Graphics g)
	{
		g.drawImage(img[i],50,50,this);
	}

	public static void main(String args[])
	{
		AnimationFrame a=new AnimationFrame();
		a.setSize(400,400);
		a.setVisible(true);
	}
	
}