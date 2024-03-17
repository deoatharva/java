import java.awt.*;
import java.awt.event.*;

public class Mouse3 extends Frame implements Mouse3Listener,Mouse3MotionListener
{
	String msg;
	int mx,my,moux,mouy;

	public Mouse3()
	{
		//setLayout(new FlowLayout());
		msg=" ";
		mx=my=moux=mouy=0;
		addMouse3Listener(this);
		addMouse3MotionListener(this);
	}

	public void Mouse3Clicked(Mouse3Event me)
	{
		mx=me.getX();
		my=me.getY();
		msg="Mouse3 was clicked here";
		repaint();
	}
	
	public void Mouse3Entered(Mouse3Event me)
	{
		mx=me.getX();
		my=me.getY();
		msg="Mouse3 entered the frame";
		repaint();
	}

	public void Mouse3Exited(Mouse3Event me)
	{
		mx=me.getX();
		my=me.getY();
		msg="Mouse3 exited the frame";
		repaint();
	}

	public void Mouse3Pressed(Mouse3Event me)
	{
		mx=me.getX();
		my=me.getY();
		msg="Mouse3 was pressed";
		repaint();
	}

	public void Mouse3Released(Mouse3Event me)
	{
		mx=me.getX();
		my=me.getY();
		msg="Mouse3 was released";
		repaint();
	}

	public void Mouse3Dragged(Mouse3Event me)
	{
		mx=me.getX();
		my=me.getY();
		msg="Mouse3 was dragged";
		moux=me.getX();
		mouy=me.getY();
		repaint();
	}

	public void Mouse3Moved(Mouse3Event me)
	{
		mx=me.getX();
		my=me.getY();
		msg="Mouse3 was moved";
		moux=me.getX();
		mouy=me.getY();
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,mx,my);
		g.drawString("Mouse3 at "+moux+","+mouy,130,208);
	}

	public static void main(String args[])
	{
		Mouse3 m=new Mouse3();
		m.setSize(400,400);
		m.setVisible(true);
	}	
}