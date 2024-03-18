
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

class P6 extends JFrame implements ActionListener,ListSelectionListener//,ListDataListener
{   
    JTextField txt1;
    JList lst1;
    DefaultListModel dlm;
    JButton bt1,bt2,bt3,bt4;
    JScrollPane jsp1;
    JPanel p,p1;
    int index;
    public P6()
    {
        p=new JPanel();
        p1=new JPanel();
        
        jsp1=new JScrollPane();
        p.setLayout(new BorderLayout());
        p1.setLayout(new FlowLayout());
        txt1=new JTextField(5);
        dlm=new DefaultListModel();
        lst1=new JList(dlm);
        jsp1.setViewportView(lst1);  
        
        //dlm.addListDataListener(this);
        lst1.addListSelectionListener(this);   
        
        bt1=new JButton("Add");
        bt2=new JButton("Remove");
        bt3=new JButton("Clear");
        bt4=new JButton("Display");
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
                
        p1.add(txt1);       
        p1.add(jsp1);
        
        p.add(bt1,BorderLayout.NORTH);
        p.add(bt2,BorderLayout.EAST);
        p.add(bt3,BorderLayout.WEST);
        p.add(bt4,BorderLayout.SOUTH);
        p.add(p1,BorderLayout.CENTER);
        
        getContentPane().add(p);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        pack();
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(bt1))
        {
            if(txt1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Enter Text");
            }
            else
            {
                String str;
                str=txt1.getText();
                dlm.addElement(str);
                txt1.setText("");
            }
        }
        if(e.getSource().equals(bt2))
        {
            if(lst1.getSelectedIndex()==-1)
            {
                JOptionPane.showMessageDialog(null,"Select a Value");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Index : "+index);
                dlm.removeElementAt(index);
            }
        }
        if(e.getSource().equals(bt3))
        {
            dlm.clear();
        }
        if(e.getSource().equals(bt4))
        {
            int c;
            c=dlm.getSize();
            JOptionPane.showMessageDialog(null,"Length : "+c);
        }
    }

    public void valueChanged(ListSelectionEvent e)
    {
        index=lst1.getSelectedIndex();
    }
   
    public static void main(String args[])
    {
        new P6();
    }
}

