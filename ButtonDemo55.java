import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo55 extends JFrame implements ActionListener
{
	JButton b1,b2;
	String str;

	public ButtonDemo55()
	{
		setLayout(new FlowLayout());
		
		str=new String();
		b1=new JButton("One");
		b2=new JButton("Two");
		
		b1.addActionListener(this);
	       b2.addActionListener(this);
	
		b1.setForeground(Color.RED);
		b2.setForeground(new Color(0,0,255));

		
		
		getContentPane().add(b1);
		getContentPane().add(b2);
		//add(b1,BorderLayout.EAST);
		//add(b2);

	}

	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		if(s.equals("One"))
		{
			b1.setBackgroundground(Color.RED);
			str="Button1";
		}
		if(ae.getSource()==b2)
		{
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
		ButtonDemo55 bd=new ButtonDemo55();
		bd.setSize(400,400);
		bd.setVisible(true);
	}
	
}