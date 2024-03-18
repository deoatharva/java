import java.awt.*;
import java.awt.event.*;

public class ButtonCount extends Frame implements ActionListener
{
	Button b1;
	String str;
	int i;

	public ButtonCount()
	{
		//setLayout(new FlowLayout());
		
		str=new String();
		i=0;
		b1=new Button("One");
		add(b1);
		
	        b1.addActionListener(this);
	       
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			str="Button was clicked "+i+" time(s)";
		}
		i++;
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(str,50,100);
	}

	public static void main(String args[])
	{
		ButtonCount bc=new ButtonCount();
		bc.setSize(400,400);
		bc.setVisible(true);
	}
}