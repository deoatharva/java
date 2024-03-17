import java.awt.*;
import java.awt.event.*;
//import javax.swing.*;

public class ButtonDemo extends Frame implements ActionListener
{
	Button b1,b2;
	String str;

	public ButtonDemo()
	{
		//setLayout(new FlowLayout());
		
		str=new String();
		b1=new Button("One");
		b2=new Button("Two");
		add(b1,BorderLayout.EAST);
		add(b2);

	       b1.addActionListener(this);
	       b2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		if(s.equals("One"))
		{
			str="Button1";
		}
		if(ae.getSource()==b2)
		{
			str="Button2 clicked";
		}
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(str,50,100);
	}

	public static void main(String args[])
	{
		ButtonDemo bd=new ButtonDemo();
		bd.setSize(400,400);
		bd.setVisible(true);
	}
	
}