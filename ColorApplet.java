import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ColorApplet extends Applet implements MouseListener
{
	private color bgColor=Color.bLACK;
	public void init()
	{
		setSize(400,300);
		setBackground(bgColor);
		addMouseListener(this);
	}
	public void paint(Graphics g)
	{
		//
	}
	public void mouseClicked(MouseEvent e)
	{
		int r=bgColor.getRed();
		int g=bgColor.getGreen();
		int b=bgColor.getBlue();
		r = Math.min(r+10,255);
		g = Math.min(g+10,255);
		b = Math.min(b+10,255);
		bgColor = new Color(r,b,g);
		setBackground(bgColor);
	}
	public void mouseEntered(MouseEvent e)
	{
		//
	}
	public void mouseExited(MouseEvent e)
	{
		//
	}
	public void mousePressed(MouseEvent e)
	{
		//
	}
	public void mouseReleased(MouseEvent e)
	{
		//
	}
	
}