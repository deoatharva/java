//Create an applet that displays the current position of the mouse in its status bar. e. g. 
//[20,30].  As mouse is moved these numbers go on changing.
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MousePositionApplet extends Applet implements MouseMotionListener
{
	private String mousePosition = "";
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString("Mouse Position : " + mousePosition,10,20);
	}
	public void mouseMoved(MouseEvent e)
	{
		int x = e.getX();
		int y = e.getY();
		mousePosition = "[" + x + "," + y + "]";
		repaint(); 
	}
	public void mouseDragged(MouseEvent e)
	{
		// code
	}
}
