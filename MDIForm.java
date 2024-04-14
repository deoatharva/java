import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MDIForm extends JFrame
{
	private JDesktopPane desktopPane;
	public MDIForm()
	{
		setTitle("MDIForm");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Panels");
		JMenuItem colorMenuItem = new JMenuItem("Colors Panels");
		JMenuItem citiesMenuItem = new JMenuItem("Cites Panels");
		JMenuItem flavourMenuItem = new JMenuItem("Flavour Panels");
		colorMenuItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ColorPanel colorPanel = new ColorPanel();
				addInternalFrame(colorPanel);
			}
		});
		citiesMenuItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				CitiesPanel citiesPanel = new citiesPanel();
				addInternalFrame(citiesPanel);
			}
		});
		flavourMenuItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				FlavourPanel flavourPanel = new flavourPanel();
				addInternalFrame(flavourPanel);
			}
		});
		menu.add(colorMenuItem);
		menu.add(citiesMenuItem);
		menu.add(flavourMenuItem);
		menuBar.add(menu);
		setJMenuBar(menuBar);
		desktopPane=new JDesktopPane();
		getContentPane().add(desktopPane,BorderLayout.CENTER);
		setVisible(true);
	}
	private void addInternalFrame(JInternalFrame internalFrame)
	{
		desktopPane.add(internalFrame);
		internalFrame.setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(MDIForm::new);
	}
}



