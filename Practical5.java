import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Practical5 extends JFrame implements ItemListener
{
	JLabel lblname,lbladdress,lblgender,lblclass,lblhobby;
	JTextField txtname;
	JRadioButton rbmale,rbfemale;
	ButtonGroup bg;
	JComboBox cboclass;
	JCheckBox chk1,chk2,chk3;
	JTextArea txtadd;
        JButton submit,display;
	GridBagConstraints gb;
	JPanel pnl1,pnl2;	
        JScrollPane jsp1,jsp2;
        JTable tbl1;
        DefaultTableModel tm;
        String nm,add,gen,cls,hob;
        int row;
        
	public Practical5() 
	{
                cls=null;
                setLayout(new BorderLayout());
                row=0;
		pnl1=new JPanel();
		pnl2=new JPanel();
                tm=new DefaultTableModel(0,5);
                
                tbl1=new JTable(tm);
                
                TableColumn c = null;
                
                c = tbl1.getColumnModel().getColumn(0);
                c.setPreferredWidth(100);
                c.setHeaderValue("Name");
                c = tbl1.getColumnModel().getColumn(1);
                c.setPreferredWidth(100);
                c.setHeaderValue("Address");
                c = tbl1.getColumnModel().getColumn(2);
                c.setPreferredWidth(100);
                c.setHeaderValue("Gender");
                c = tbl1.getColumnModel().getColumn(3);
                c.setPreferredWidth(100);
                c.setHeaderValue("Class");
                c = tbl1.getColumnModel().getColumn(4);
                c.setPreferredWidth(100);
                c.setHeaderValue("Hobby");
                tbl1.setBackground(new Color(180,180,255)); 
                tbl1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.BLACK,Color.RED));
                             
		lblname=new JLabel("Name");
		lbladdress=new JLabel("Address");
		lblgender=new JLabel("Gender");
		lblclass=new JLabel("Class");
		lblhobby=new JLabel("Hobbies");

		txtname=new JTextField(5);

		rbmale=new JRadioButton("Male");
		rbfemale=new JRadioButton("Female");

		bg=new ButtonGroup();
		bg.add(rbmale);
		bg.add(rbfemale);

		cboclass=new JComboBox();
		cboclass.addItem("FYBSC");
		cboclass.addItem("SYBSC");
		cboclass.addItem("TYBSC");

		chk1=new JCheckBox("Music");
		chk2=new JCheckBox("Reading");
		chk3=new JCheckBox("Surfing");

		txtadd=new JTextArea();
                
                submit=new JButton("Submit");
                display=new JButton("Display");
                
                jsp1=new JScrollPane();
                txtadd.setRows(1);
                txtadd.setColumns(3);
                jsp1.setViewportView(txtadd);
               
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                
		gb=new GridBagConstraints();
		pnl1.setLayout(new GridBagLayout());
                
		gb.fill=GridBagConstraints.HORIZONTAL;
		gb.gridx=0;
		gb.gridy=0;
		pnl1.add(lblname,gb);
                
                gb.gridx=1;
		gb.gridy=0;
		pnl1.add(txtname,gb);               
               
                gb.gridx=0;
		gb.gridy=3;
		pnl1.add(lbladdress,gb);
                
                gb.gridx=1;
		gb.gridy=3;
		pnl1.add(jsp1,gb);
                
                gb.gridx=0;
		gb.gridy=4;
		pnl1.add(lblgender,gb);
                
                gb.gridx=1;
		gb.gridy=4;
		pnl1.add(rbmale,gb);
                
                gb.gridx=2;
                gb.gridy=4;
		pnl1.add(rbfemale,gb);
                
                gb.gridx=0;
                gb.gridy=5;
		pnl1.add(lblclass,gb);
                
                gb.gridx=1;
                gb.gridy=5;
		pnl1.add(cboclass,gb);
                
                gb.gridx=0;
                gb.gridy=6;
		pnl1.add(lblhobby,gb);
                
                gb.gridx=1;
                gb.gridy=6;
		pnl1.add(chk1,gb);
                
                gb.gridx=2;
                gb.gridy=6;
		pnl1.add(chk2,gb);
                
                gb.gridx=3;
		pnl1.add(chk3,gb);
                
                gb.gridx=2;
                gb.gridy=7;
		pnl1.add(submit,gb);
                
                gb.gridx=3;
                gb.gridy=7;
		pnl1.add(display,gb);
                
                rbfemale.addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            gen="Female";
                        }
                    }
                );
                
                rbmale.addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            gen="Male";
                        }
                    }
                );
                
                submit.addActionListener(new MyAction());
                display.addActionListener(new MyAction());
                chk1.addActionListener(new MyAction());
                chk2.addActionListener(new MyAction());
                chk3.addActionListener(new MyAction());
                
                cboclass.addItemListener(this);
                
                jsp2 = new JScrollPane(tbl1,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER); 
                pnl2.setBounds(0,0,100,100);
                pnl2.add(jsp2);
                
		getContentPane().add(pnl1,BorderLayout.NORTH);
               
                getContentPane().add(pnl2,BorderLayout.EAST);
 
                pack();
		setVisible(true);
	}
        class MyAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                String ob1=new String();
                String ob2=new String();
                String ob3=new String();
                if(chk1.isSelected())
                {
                    ob1=chk1.getText();
                }
                if(chk2.isSelected())
                {
                   ob2=chk2.getText();
                }
                if(chk3.isSelected())
                {
                    ob3=chk3.getText();
                }
                hob=ob1+","+ob2+","+ob3;
                
                if(e.getSource().equals(submit))
                {
                    nm=txtname.getText();
                    add=txtadd.getText();
                    JOptionPane.showMessageDialog(null,"Submitted");
                }
                if(e.getSource().equals(display))
                {
                    if (row>=tbl1.getRowCount())
                    {
                        tm.addRow(new Object[] {"","","","",""});
                    } 
                    tm.setValueAt(nm,row,0);
                    tm.setValueAt(add,row,1);
                    tm.setValueAt(gen,row,2);
                    tm.setValueAt(cls,row,3);
                    tm.setValueAt(hob,row,4);
                    row=row+1; 
                }
            }
        }
        public void itemStateChanged(ItemEvent ie)
        {
             cls=(String)cboclass.getSelectedItem();            
        }
        
        public static void main(String args[])
        {
            new Practical5();
        }
}
