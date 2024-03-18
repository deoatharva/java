import java.awt.*;
import java.awt.color.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo extends JFrame implements ActionListener
{
	JButton b1,b2;
	String str;

	public ButtonDemo()
	{
		setLayout(new FlowLayout());

		str=new String();
		b1=new JButton("One");
		b2=new JButton("Two");
		//add(b1, BorderLayout.EAST);
		//add(b2);

	        b1.addActionListener(this);
	        b2.addActionListener(this);
		
		b1.setForeground(Color.RED);
		b2.setForeground(new Color(0,0,255));
		getContentPane().add(b1);
		getContentPane().add(b2);


	}

	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		if(s.equals("One"))
		{
			getContentPane().setBackground(Color.RED);
			str="Button1";
		}
		if(ae.getSource()==b2)
		{

			getContentPane().setBackground(Color.RED);
			str="Button2 clicked";
		}
		//repaint();
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