import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class P8
{

	static Container cp;
	public static void main(String[] args)
	{

		JFrame frm = new JFrame("Color Choice");
		cp = frm.getContentPane( );
		cp.setLayout(new GridBagLayout());

		JButton button = new JButton("select color");
		cp.add(button);
   
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Color c = JColorChooser.showDialog(frm,"Choose a color", Color.red);
				cp.setBackground(c);
			}
		});

		frm.setSize(200, 300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
   }
}
