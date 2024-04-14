//Create an applet containing three sliders – red, green, and blue. The background color is initially set to white. 
//Depending on the slider clicked, the background color of the applet should change accordingly.
//-AppletSlider.java
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class AppletSlider extends JApplet implements ChangeListener
{
	private JSlider redSlider,greenSlider,blueSlider;
	private Jpanel colorPanel;
	public void init()
	{
		setSize(400,200);
		setLayout(new BorderLayout());
		redSlider = new JSlider(JSlider.HORIZONTAL,0,255,255);
		greenSlider = new JSlider(JSlider.HORIZONTAL,0,255,255);
		blueSlider = new JSlider(JSlider.HORIZONTAL,0,255,255);
		redSlider.setMajorTickSpacing(50);
		redSlider.setMinorTickSpacing(10);
		redSlider.setPaintTicks(true);
		redSlider.setPaintLabels(true);
		greenSlider.setMajorTickSpacing(50);
		greenSlider.setMinorTickSpacing(10);
		greenSlider.setPaintTicks(true);
		greenSlider.setPaintLabels(true);
		blueSlider.setMajorTickSpacing(50);
		blueSlider.setMinorTickSpacing(10);
		blueSlider.setPaintTicks(true);
		blueSlider.setPaintLabels(true);
		redSlider.addChangeListener(this);
		greenSlider.addChangeListener(this);
		blueSlider.addChangeListener(this);
		colorPanel = new JPanel();
		colorPanel.setPreferredSize(new Dimension(200,200));
		colorPanel.setBackground(color.WHITE);
		JPanel sliderPanel = new JPanel();
		sliderPanel.setLayout(new GridLayout(3,1));
		sliderPanel.add(redSlider);
		sliderPanel.add(greenSlider);
		sliderPanel.add(blueSlider);
		add(sliderPanel,BorderLayout.WEST);
		add(colorPanel,BorderLayout.CENTER);
	}
	public void stateChnaged(ChangeEvnet e)
	{
		int red = redSlider.getValue();
		int green = greenSlider.getValue();
		int blue = blueSlider.getValue();
		color bgColor = new Color(red,green,blue);
		colorPanel.setBackground(bgColor);
	}
}