//Create a class called “ColouredCanvas” which extends Canvas and whose constructor takes three arguments, its color, width and height.
// When a “ColouredCanvas” is initialized, it should set its size and background colour as per the arguments.
//Create a class which extents JApplet and adds to the Applet a “ColouredCanvas” of red color with size 50,100.
//-ColouredCanvas.java + TestColouredCanvas.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ColouredCanvas extends Canvas
{
	private Color canvasColor;
	private int canvasWidth;
	private int canvasHeight;
	public ColouredCanvas(Color color,int w,int h)
	{
		canvasColor = color;
		canvasWidth = w;
		canvasHeight = h;
		setSize(w,h);
		setBackground(color);
	}
	public void paint(Graphics g)
	{
		//
	}
}