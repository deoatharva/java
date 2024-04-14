import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
public class FrameWithModel extends JFrame
{
	private JButton buttton;
	public FrameWithModel()
	{
		setTitle("MOdel dialog example");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("show time");
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(FrameWithModel.this,new Date(),"current date and time",JOptionPane.INFORMATION_MESSAGE);

			}
		});
		getContentPane().add(buttton,BorderLayout.CENTER);
	}
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new FrameWithModal().setVisible(true);
			}
		});
	}
}