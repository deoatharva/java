import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SpinningLine extends JPanel implements ActionLstener
{
	private static final int WIDTH = 400;
	private static final int HEIGHT = 400;
	private static final int LINE_LENGTH = 150;
	private static final int LINE_WIDTH = 2;
	private static final int ANIMATION_DELAY = 50;
	private static final double ANGLE_INCREMENT = Math.PI/50;
	private static final color LINE_COLOR = color.RED;
	private double angle = 0;
	private double angleIncrement = ANGLE_INCREMENT;
	private boolean isClockwise = true;
	private Timer timer;
	public SpinningLine()
	{
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setBackground(Color.WHITE);
		JButton startButton = new JButton("Start");
		startButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				stopAnimation();
			} 
		});
		JButton stopButton = new JButton("Stop");
		stopButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				stopAnimation();
			} 
		});
		JButton clockwiseButton = new JRadioButton("clockwise",true);
		clockwiseButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				isClockwise=true;
			} 
		});
		JButton anticlockwiseButton = new JRadioButton("anti-clockwise");
		clockwiseButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				isClockwise=false;
			} 
		});
		ButtonGroup directionGroup =new ButtonGroup();
		directionGroup.add(clockwiseButton);
		directionGroup.add(anticlockwiseButton);
		JButton buttonPanel = new JPanel();
		buttonPanel.add(startButton);
		buttonPanel.add(stopButton);
		buttonPanel.add(clockwiseButton);
		buttonPanel.add(anticlockwiseButton);
		add(buttonPanel);
		timer = new Timer(ANIMATION_DELAY,this);
	}
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int centerX = getWidth()/2;
		int centerY = getHeight()/2;
		int x1 = (int) (centerX + LINE_LENGTH * math.cos(angle));
		int y1 = (int) (centerY + LINE_LENGTH * math.sin(angle));
		int x2 = (int) (centerX + LINE_LENGTH * math.cos(angle+Math.PI));
		int y2 = (int) (centerY + LINE_LENGTH * math.sin(angle+Math.PI));
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(LINE_COLOR);
		g2d.setStroke(new BasicStroke(LINE_WIDTH));
		g2d.drawLine(x1,y1,x2,y2);
	}
	public void actionPerformed(ActionEvent e)
	{
		angle += angleIncrement * (isClockwise ? 1 : -1);
		if(angle >= 2 * Math.PI)
		{
			angle -= 2 * Math.PI;
		}
		else if (angle<0) {
			angle += 2*Math.PI;
		}
		repaint();
	}
	private void startAnimation()
	{
		timer.start();
	}
	private void stopAnimation()
	{
		timer.stop();
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				JFrame frame = new JFrame("SpinningLine animation");
				frame.setDefaultCloseOperation(JFrame>EXIT_ON_CLOSE);
				frame.getContentPane().add(new SpinningLine());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}
}
