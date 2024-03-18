import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mouse1 extends JFrame implements MouseListener, MouseMotionListener
{
	String msg;
	int mx,my,moux,mouy;

	public Mouse1()
	{
		setLayout(new FlowLayout());
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

	public void paintComponents(Graphics g)
	{
		super.paintComponents(g);
		g.drawString(msg,mx,my);
		g.drawString("Mouse1 at "+moux+","+mouy,130,208);
	}

	public static void main(String args[])
	{
		Mouse1 m=new Mouse1();
		m.setSize(400,400);
		m.setVisible(true);
	}	
}