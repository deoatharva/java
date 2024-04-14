import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculateor extends JFrame implements ActionListener
{   
	private JTextField displayField;
	private JButton[] numberButtons;
	private JButton addButton,subButton,mulButton,divButton,clsButton,eqButton;
	private double num1 = 0;
	private String op = "";
	private boolean startNewInput = true;
	public Calculateor()
	{
		setTitle("simple Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		displayField = new JTextField(10);
		displayField.setEditable(true);
		numberButtons = new JButton[10];
		for(int i=0;i<10;i++)
		{
			numberButtons[i]=new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this); 
		}
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		clsButton = new JButton("c");
		eqButton = new JButton("=");
		addButton.addActionListener(this);
		subButton.addActionListener(this);
		mulButton.addActionListener(this);
		divButton.addActionListener(this);
		clsButton.addActionListener(this);
		eqButton.addActionListener(this);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(displayField,gbc);
		gbc.gridwidth = 1;
		gbc.gridy = 1;
		for(int i=1;i<10;i++)
		{
			if(i%3==1)
			{
				gbc.gridx=0;
				gbc.gridy++;
			}
			else
			{
				gbc.gridx++;
			}
			add(numberButtons[i],gbc);
		}
		gbc.gridx=1;
		gbc.gridy=4;
		add(numberButtons[0],gbc);
		gbc.gridx=2;
		gbc.gridy=4;
		add(clsButton,gbc);
		gbc.gridx=3;
		gbc.gridy=4;
		add(eqButton,gbc);
		gbc.gridx=3;
		gbc.gridy=1;
		add(addButton,gbc);
		gbc.gridx=3;
		gbc.gridy=2;
		add(subButton,gbc);
		gbc.gridx=3;
		gbc.gridy=3;
		add(mulButton,gbc);
		gbc.gridx=3;
		gbc.gridy=0;
		add(divButton,gbc);
		pack();
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton button = (JButton)e.getSource();
		String buttonText = button.getText();
		if(buttonText.equals("C"))
		{
			displayField.setText("");
			num1 = 0;
			op = "";
			startNewInput = true;
		}
		else if(buttonText.equals("="))
		{
			if(!op.isEmpty()&&!startNewInput)
			{
				double num2=Double.parseDouble(displayField.getText());
				double result = 0;
				switch(op)
				{
					case "+":
						result=num1+num2;
						break;
					case "-":
						result=num1-num2;
						break;
					case "*":
						result=num1*num2;
						break;
					case "/":
						if(num2 !=0)
						{
							result=num1/num2;
							
						}
						else
						{
							displayField.setText("ERROR");
						}
						break;
				}
				displayField.setText(String.valueOf(result));
				startNewInput = true;
				num1 = result;
			}
		}
		else if(buttonText.matches("[0-9]"))
		{
			if(startNewInput)
			{
				displayField.setText(buttonText);
				startNewInput = false;
			}
			else
			{
				displayField.setText(displayField.getText()+buttonText);
			}
		}
		else
		{
			if(!startNewInput)
			{
				num1 = Double.parseDouble(displayField.getText());
				op=buttonText;
				startNewInput = true;
			}
		}
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new Calculateor();
			}
		});	
	}
}
