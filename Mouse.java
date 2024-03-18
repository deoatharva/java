import java.awt.*;
import java.awt.event.*;

public class Mouse extends Frame implements MouseListener,MouseMotionListener
{
	String msg;
	int mx,my,moux,mouy;

	public Mouse()
	{
		//setLayout(new FlowLayout());
		msg=" ";
		mx=my=moux=mouy=0;
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mouseClicked(MouseEvent me)
	{
		mx=me.getX();
		my=me.getY();
		msg="Mouse was clicked here";
		repaint();
	}
	
	public void mouseEntered(MouseEvent me)
	{
		mx=me.getX();
		my=me.getY();
		msg="Mouse entered the frame";
		repaint();
	}

	public void mouseExited(MouseEvent me)
	{
		mx=me.getX();
		my=me.getY();
		msg="Mouse exited the frame";
		repaint();
	}

	public void mousePressed(MouseEvent me)
	{
		mx=me.getX();
		my=me.getY();
		msg="Mouse was pressed";
		repaint();
	}

	public void mouseReleased(MouseEvent me)
	{
		mx=me.getX();
		my=me.getY();
		msg="Mouse was released";
		repaint();
	}

	public void mouseDragged(MouseEvent me)
	{
		mx=me.getX();
		my=me.getY();
		msg="Mouse was dragged";
		moux=me.getX();
		mouy=me.getY();
		repaint();
	}

	public void mouseMoved(MouseEvent me)
	{
		mx=me.getX();
		my=me.getY();
		msg="Mouse was moved";
		moux=me.getX();
		mouy=me.getY();
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,mx,my);
		g.drawString("Mouse at "+moux+","+mouy,130,208);
	}

	public static void main(String args[])
	{
		Mouse m=new Mouse();
		m.setSize(400,400);
		m.setVisible(true);
	}	
}