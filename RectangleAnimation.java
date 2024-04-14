//Define a class that produces an applet, which performs a simple animation of drawing a rectangle on double clicking anywhere on the screen.
// At the same time the previous rectangle should get deleted.
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class RectangleAnimation extends Applet
{
	int x = 0;
	int y = 0;
	int w = 50;
	int h = 50;
	public void init()
	{
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				if(e.getClickCount() == 2)
				{
					x = e.getX() - w / 2;
					y = e.getY() - h / 2;
					repaint();
				}
			}
		});
	} 
	public void paint(Graphics g)
	{
		g.clearRect(0,0,getWidth(),getHeight());
		g.drawRect(x,y,w,h);
	}
}