import java.applet.*;
import java.awt.*;
import java.awt.event.*;
class LayoutApplet extends Applet implements ActionListener
{
	private int centerX,centerY;
	private int radius = 100;
	private double angle = 0;
	private int rectSize = 5;
	private TextArea textArea1,textArea2,textArea3;
	private Button clearButton,copyButton;
	public void init()
	{
		set void init()	
		{
			setSize(400.300);
			setLayout(new FlowLayout());
			textArea1 = new TextArea(5,20);
			textArea2 = new textArea(5,20);
			textArea3 = new TextArea(5,20);
			textArea2.setEditable(false);
			textArea3.setEditable(false);
			add(textArea1);
			add(textArea2);
			add(textArea3);
			clearButton = new Button("clear");
			copyButton = new Button("copy");
			add(clearButton);
			add(copyButton);
			clearButton.addActionListener(this);
			copyButton.addActionListener(this);
			centerX=getWidth()/2;
			centerY=getHeight()/2;
			Thread animationThread = new Thread(new Runnable()
			{
				public void run()
				{
					angle += 0.05;
					int x = (int)(centerx+radius*Math.cos(angle));
					int y = (int)(centerY+radius*Math.sin(angle));
					setLocation(x,y);
					repaint();
					try{
						Thread.sleep(50);	
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			});
			animationThread.start();
		}
		public void paint(Graphics g)
		{
			g.setColor(Color.RED);
			g.fillRect(centerX-rectSize/2,centerY-rectSize/2,rectSize,rectSize);
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == clearButton)
			{
				textArea1.setText("");
				textArea3.append("clear done \n");
			}
			else if(e.getSource() == copyButton)
			{
				textArea2.setText(textArea1.getText());
				textArea3.append("copu done\n");
			}
		}
	}
}


