//Create an applet that displays a small figure on the screen. When mouse is moved, 
//determine whether the mouse is close to the position occupied by the figure. If so redraw the figure at a new position further away 
//from the mouse. If the figure strikes a wall of the screen, cause it to bounce off the wall.
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class BouncingFigure extends Applet implements MouseMotionListener , Runnable
{
	private int figX = 50;
	private int figY = 50;
	private int figW = 50;
	private int figH = 50;
	private int mouseX,mouseY = 50;
	private int dx = 50;
	private int dy = 50;
	public void init()
	{
		addMouseMotionListener(this);
		Thread t = new Thread(this);
		t.start();
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillRect(figX,figY,figW,figH);
	}
	public void run()
	{
		while(true)
		{
			if(mouseX>figX && mouseX<figX+figW&&mouseY>figY&&mouseY<figY+figH)
			{
				int newX = figX + dx * 2;
				int newY = figY + dy * 2;
				if(newX<0||newX+figureWidth>getWidth())
				{
					dx = -dx;
				}
				if(newY<0||newY+figureHeight>getWidth())
				{
					dy = -dy;
				}
				figX += dx;
				figY += dy;
				repaint();
			}
			try 
			{
				THread.sleep(20);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public void mouseMoved(MoueEvent e)
	{
		mouseX = e.getX();
		mouseY = e.getY();
	}
	public void mouseDragged(MouseEvent e)
	{
		//
	}
}