//write a program to create a form to enter biodata of student. Use variaous components such as JLabel,JButton,JTextField,JTextArea,JComboBox,
//JTable,JScrollPane,JOptionButton,JCheckkBox. Use GridBagLayout and GridBagConstraints to lay the components.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class DResume extends JFrame implements ActionListener
{
	JLabel nameLabel,ageLabel,genderLabel,addressLabel,skillsLabel,educationLabel;
	JTextField nameField,ageField;
	JTextArea addressArea,skillsArea;
	JComboBox<String> genderComboBox,educationComboBox;
	JTable skillsTable;
	JScrollPane skillsScrollPane;
	JRadioButton maleRadioButton,FemaleRadioButton;
	ButtonGroup genderButtonGroup;
	JCheckBox javaCheckbox,pythonCheckBox,cppCheckBox;
	JButton submitButton;
	public DResume()
	{
		setTitle("Student Biodata Form");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5,5,5,5);
		gbc.anchor =  GridBagConstraints.WEST;
		nameLabel = new JLabel("Name : ");
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(nameLabel,gbc);
		nameField = new JTextField("Name : ");
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(nameField,gbc);
		ageLabel = new JLabel("age : ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(ageLabel,gbc);
		ageField = new JTextField("age : ");
		gbc.gridx = 1;
		gbc.gridy = 1;
		add(ageField,gbc);
		genderLabel = new JLabel("gender : ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(genderLabel,gbc);
		genderComboBox = new JComboBox<>(new String[]{"male","female"});
		gbc.gridx = 1;
		gbc.gridy = 2;
		add(genderComboBox,gbc);
		addressLabel = new JLabel("address : ");
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(addressLabel,gbc);
		addressArea = new JTextArea(5,20);
		gbc.gridx = 1;
		gbc.gridy = 3;
		add(addressArea,gbc);
		educationLabel = new JLabel("education : ");
		gbc.gridx = 0;
		gbc.gridy = 4;
		add(educationLabel,gbc);
		educationComboBox = new JComboBox<>(new String[]{"high-school","bachelor","master","phd"});
		gbc.gridx = 1;
		gbc.gridy = 4;
		add(educationComboBox,gbc);
		skillsLabel = new JLabel("skills : ");
		gbc.gridx = 0;
		gbc.gridy = 5;
		add(skillsLabel,gbc);
		String[] columns = {"skill","Proficiency"};
		String[][] data = {{"Java","Beginner"},{"Python","Intermidiate"},{"C++","Advanced"}};
		skillsTable = new JTable(data,columns);
		skillsScrollPane = new JScrollPane(skillsTable);
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridwidth = 2;
		add(skillsScrollPane,gbc);
		gbc.gridwidth = 1;
		submitButton = new JButton("submit");
		submitButton.addActionListener(this);
		gbc.gridx = 1;
		gbc.gridy = 6;
		add(submitButton,gbc);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == submitButton)
		{
			String name = nameField.getText();
			String age = ageField.getText();
			String gender = (String)genderComboBox.getSelectedItem();
			String address = addressArea.getText();
			String education = (String)educationComboBox.getSelectedItem();
			int rows = skillsTable.getRowCount();
			StringBuilder skills = new StringBuilder();
			for(int i = 0; i < rows; i++)
			{
				String skill = (String) skillsTable.getValueAt(i,0);
				String proficiency = (String) skillsTable.getValueAt(i,1);
				skills.append(skill).append("(").append(proficiency).append(")").append(",");
			}
			JOptionPane.showMessageDialog(this,"\n name"+name+"\n age"+age+"\n gender"+gender+"\n address"+address+"\n education"+education+"\n skill"+skills.toString());
		}
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(DResume::new);
	}
} 



