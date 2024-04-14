//Define a class that enables the drawing of freehand lines on a screen through mouse clicking and dragging. Use anonymous inner classes to 
//implement event listeners. The drawing should be cleared when a key is pressed and the line color should be selectable. Define a test class
// to demonstrate the program. sfp
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class FreeHandDrawing extends JFrame
{
	private Color currentColor = Color.BLACK;
	private ArrayLait<Point> points = new ArrayList<>();
	public FreeHandDrawing()
	{
		setTitle("Freehand Drawing");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel drawingPanel = new JPanel()
		{
			@Override
			protected void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.setColor(currentColor);
				for(int i = 0;i<points.size();i++)
				{
					Point prev = points.get(i-1);
					Point current = points.get(i);
					g.drawLine(prev.x,prev.y,current.x,current.y);
				}
			}
		};
		drawingPanel.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				points.add(e.getPoint());
				repaint();
			}
		});
		drawingPanel.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseDragged(MouseEvent e)
			{
				points.add(e.getPoint());
			}
		});
		add(drawingPanel);
		addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode()==keyEvent.VK_C)
				{
					points.clear();
					repaint();
				}
			}
		});
		JButton colorButton = new JButton("Select color");
		colorButton.addActionListener(new addActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Color selectedColor = JColorChooser.showDialog(null,"choose a color",currentColor);
				if(selectedColor != null)
				{
					currentColor = selectedColor;
				}
			}
		});
		add(colorButton,BorderLayerout.SOUTH);
		setVisible(true);
		setFocusable(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(FreeHandDrawing::new);
	}
}