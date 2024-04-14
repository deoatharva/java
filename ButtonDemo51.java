import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo51 extends JFrame implements ActionListener
{
	JButton b1,b2;
	String str;

	public ButtonDemo51()
	{
		//setLayout(new FlowLayout());
		
		str=new String();
		b1=new JButton("One");
		b2=new JButton("Two");
		
		b1.addActionListener(this);
	       b2.addActionListener(this);
	
		getContentPane().add(b1);
		add(b2);
		//add(b1,BorderLayout.EAST);
		//add(b2);

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
		ButtonDemo51 bd=new ButtonDemo51();
		bd.setSize(400,400);
		bd.setVisible(true);
	}
	
}
