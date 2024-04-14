//Create an application, which is a subclass of the JFrame class with a menu on the JFrame. One of the menu items is for the 
//background color and the other is for the text color. The application contains a text component (any text component can be used) 
//where user can type any text. When a user presses either of the menus mentioned above, three scroll bars are shown on the 
//screen for red, green and blue color components. The user can adjust the positions of these scroll bars. On pressing the 
//‘ok’ button, the foreground or background of a text component on the frame changes according to the menu choice made earlier
//- SetColorFrame.java
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class SetColorFrame extends JFrame
{
	private JTextArea textarea;
	private JMenuBar menubar;
	private JMenu colormenu;
	private JMenuItem backgroundMenuItem,textMenuItem;
	private JScrollBar redScrollBar,blueScrollBar,greenScrollBar;
	private JButton okButton;
	public SetColorFrame()
	{
		setTitle("color settings");
		setSsize(400,300);
		setDefalutCloseOperation(jFrame.EXIT_ON_CLOSE);
		textArea=new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textArea);
		add(scrollPane,BorderLayout.CENTER);
		menubar=new JMenubar();
		colormenu = new JMenu("color");
		backgroundMenuItem = new JMenuItem("Background Color");
		textMenuItem = new JMenuItem("Text Color");
		backgroundMenuItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				showColorChooser(true);
			}
		});
		textMenuItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				showColorChooser(false);
			}
		});
		colorMenu.add(backgroundMenuItem);
		colorMenu.add(textMenuItem);
		menuBar.add(colorMenu);
		setJMenuBar(menuBar);
		redScrollBar = new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,256);
		greenScrollBar = new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,256);
		blueScrollBar = new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,256);
		okButton = new JButton("ok");
		okButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				applyColor();
			}
		});
		Jpanel colorPanel = new Jpanel();
		colorPanel.setLayout(new GridLayout(4,1));
		colorPanel.add(new JLabel("red"));
		colorPanel.add(redScrollBar);
		colorPanel.add(new JLabel("green"));
		colorPanel.add(greenScrollBar);
		colorPanel.add(new JLabel("blue"));
		colorPanel.add(blueScrollBar);
		colorPanel.add(okButton);
		add(colorPanel,BorderLayout.SOUTH);
		setVisible(true);
	}
	private void showColorChooser(boolean isBackground)
	{
		JScrollBar[] scrollBars = {redScrollBar,greenScrollBar,blueScrollBar};
		for(JScrollBar scrollBar : scrollBars)
		{
			scrollBar.setVisible(true);
		}
		okButton.setVisible(true);
	}
	private void applyColor()
	{
		int red = redScrollBar.getValue();
		int green = greenScrollBar.getValue();
		int blue = blueScrollBar.getValue();
		Color color = new Color(red,green,blue);
		if(colorMenu.getSelectedItem() == backgroundMenuItem)
		{
			textArea.setBackground(color);
		}
		else if(colorMenu.getSelectedItem() == textMenuItem)
		{
			textArea.setForeground(color);
		}
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(SetColorFrame::new);
	}
}