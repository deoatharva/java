//Create a class called “ColouredCanvas” which extends Canvas and whose constructor takes three arguments, its color, width and height.
// When a “ColouredCanvas” is initialized, it should set its size and background colour as per the arguments.
//Create a class which extents JApplet and adds to the Applet a “ColouredCanvas” of red color with size 50,100.
//-ColouredCanvas.java + TestColouredCanvas.java
import java.awt.*;
import javax.swing.*;
public class TestColouredCanvas extends JApplet
{
	public void init()
	{
		ColouredCanvas canvas =new ColouredCanvas(Color.RED,50,100);
		add(canvas);
	}
}