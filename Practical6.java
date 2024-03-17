import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practical6 extends JFrame implements ActionListener
{
	JDesktopPane dp;	
	JMenuBar mb;
	JMenu list;
	JMenuItem color,cities,flavour;
	JInternalFrame if1;
	
	public Practical6()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		dp=new JDesktopPane();
		setContentPane(dp);
		mb=new JMenuBar();
		setJMenuBar(mb);
		
		list=new JMenu("List");
		color=new JMenuItem("Color");
		cities=new JMenuItem("Cities");
		flavour=new JMenuItem("Flavour");

		list.add(color);
		list.add(cities);
		list.add(flavour);
		mb.add(list);		
		
		color.addActionListener(this);
                cities.addActionListener(this);
                flavour.addActionListener(this);
		
               
                setSize(800,570);
		//setSize(200,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(color))
		{			
			getContentPane().add(new colorPanel());	
		}
                if(e.getSource().equals(cities))
		{			
			getContentPane().add(new citiesPanel());	
		}
                if(e.getSource().equals(flavour))
		{		
			getContentPane().add(new flavourPanel());	
		}
	}

	public static void main(String args[])
	{
		new Practical6();
	}
	
	
}


class colorPanel extends JInternalFrame
{
	JLabel r,g,b;
	public colorPanel()
	{
                r=new JLabel("Red");
		g=new JLabel("Green");
		b=new JLabel("Blue");
		add(r);
		add(g);
		add(b);
                setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
                setClosable(true);
                setIconifiable(true);
                setMaximizable(true);
                setTitle("ColorPanel");
		setSize(200,100);
		setVisible(true);
	}
}
class citiesPanel extends JInternalFrame
{
        JButton b;
	public citiesPanel()
	{
               JButton[] b1=new JButton[10];
                //r=new JButton("Mumbai");
		//g=new JButton("Delhi");
		//b=new JButton("Bangalore");
		
                setLayout(null);
                for(int i=1;i<10;i++)
                {
                   b=new JButton();
                   b1[i]=b;
                   b1[i].setBounds(i*30,i*20,125,30);
                   add(b1[i]);
                }
                
                b1[1].setText("Mumbai");
                b1[2].setText("Delhi");
                b1[3].setText("Bangalore");
                b1[4].setText("Hyderabad");
                b1[5].setText("Jaipur");
                b1[6].setText("Chennai");
                b1[7].setText("Srinagar");
                b1[8].setText("Chandigarh");
                b1[9].setText("Nashik");
                setClosable(true);
                setIconifiable(true);
                setMaximizable(true);
                setTitle("CitiesPanel");
		setSize(800,570);
		setVisible(true);
	}
}
class flavourPanel extends JInternalFrame
{
	JButton f1,f2,f3,f4,f5;
	public flavourPanel()
	{
                f1=new JButton("Chocolate");
		f2=new JButton("Venilla");
		f3=new JButton("Strawberry");
                f4=new JButton("KesarPista");
                f5=new JButton("BlackCurrent");
                setLayout(new BorderLayout());
		add(f1,BorderLayout.NORTH);
		add(f2,BorderLayout.EAST);
		add(f3,BorderLayout.CENTER);
                add(f4,BorderLayout.WEST);
                add(f5,BorderLayout.SOUTH);               
                setClosable(true);
                setIconifiable(true);
                setMaximizable(true);
                setTitle("FlavourPanel");
		setSize(800,500);
		setVisible(true);
	}
}



