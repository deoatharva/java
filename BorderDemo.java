// Java program to illustrate the BorderLayout
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Button;
import java.awt.Color;

// class extends JFrame
public class BorderDemo extends JFrame {

	// Constructor of BorderDemo class.
	public BorderDemo()
	{

		// set the layout
		setLayout(new BorderLayout());

		// set the background
		setBackground(Color.red);

		// creates Button (btn1)
		Button btn1 = new Button("Up");

		// creates Button (btn2)
		Button btn2 = new Button("Down");

		// creates Button (btn3)
		Button btn3 = new Button("Right");

		// creates Button (btn4)
		Button btn4 = new Button("Left");

		// creates Button (btn5)
		Button btn5 = new Button("Center");

		// Adding JButton "btn1" on JFrame.
		add(btn1, "North");

		// Adding JButton "btn2" on JFrame.
		add(btn2, "South");

		// Adding JButton "btn3" on JFrame.
		add(btn3, "East");

		// Adding JButton "btn4" on JFrame.
		add(btn4, "West");

		// Adding JButton "btn5" on JFrame.
		add(btn5, "Center");

		// function to set the title
		setTitle("Border Layout");

		// Function to set size of JFrame.
		setSize(350, 300);

		// Function to set visible status of JFrame
		setVisible(true);
	}

	// Main Method
	public static void main(String args[])
	{

		// calling the constructor
		new BorderDemo();
	}
}

