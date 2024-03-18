
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.io.*;

public class Practical7 extends JFrame implements ActionListener
{
    JLabel lblnm,lblrk;
    JButton insert,display;
    JTextField txtnm;
    JTextArea txtrk,txt1;
    JScrollPane jsp1,jsp2;
    JPanel p1,p2;
    
    File f;
    
    String str,str1;
    public Practical7()
    {
        f=new File("dummy.txt");  
        
        lblnm=new JLabel("Name");
        lblrk=new JLabel("Remark");
        txt1=new JTextArea();
        txt1.setRows(4);
        txt1.setColumns(6);
        txtnm=new JTextField(5);
        txtrk=new JTextArea();
        
        txt1.setBorder(null);
        txt1.setEditable(false);
        
        jsp1=new JScrollPane();
        jsp1.setViewportView(txtrk);
       
        jsp2=new JScrollPane(txt1,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
       
        //jsp2.setViewportView(txt1);
        
        insert=new JButton("Insert");
        display=new JButton("Display");
        
        p1=new JPanel();        
        p2=new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setBorder(null);
        p2.setBorder(null);
        p2.setBackground(Color.WHITE);
        //p2.setSize(200,200);
        p1.setLayout(new GridBagLayout());
        GridBagConstraints c=new GridBagConstraints();
        c.fill=GridBagConstraints.HORIZONTAL;
        c.gridx=0;
        c.gridy=0;
        p1.add(lblnm,c);
                
        c.gridx=1;
        c.gridy=0;
        p1.add(txtnm,c);        
        
        c.gridx=0;
        c.gridy=1;
        p1.add(lblrk,c);
        
        c.gridx=1;
        c.gridy=1;
        p1.add(jsp1,c);
        
        c.gridx=0;
        c.gridy=3;
        p1.add(insert,c);
        
        c.gridx=1;
        c.gridy=3;
        p1.add(display,c);
        
        p2.add(jsp2);
        //p1.setSize(50,50);
        //p2.setSize(10,10);
        insert.addActionListener(this);
        display.addActionListener(this);
        getContentPane().add(p1,BorderLayout.CENTER);
        getContentPane().add(p2,BorderLayout.EAST);
        pack();
        setVisible(true);
        System.out.println(getSize());
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(insert))
        {  
                try
		{
                    FileReader fr=new FileReader(f);
                    BufferedReader br=new BufferedReader(fr);
                    PrintWriter pw=new PrintWriter(new FileWriter(f,true));
                    
                    String s,s1;
                    s=txtnm.getText()+txtrk.getText();
                    
                    if(s.equals(null))
                    {
                        JOptionPane.showMessageDialog(null,"Enter Text");
                    }
                    
                    s1=br.readLine();
                    while((s1=br.readLine())!=null)
                    {
                        System.out.println(s1);
                        s1=br.readLine();                        
                    }
                    System.out.println(s1);
                    if(s1!=null)
                    {
                        pw.append(s);                         
                    }
                    else
                    {
                        pw.println(s);
                    }
                   
                    br.close();
                    pw.close();		
                    System.out.println("Finished");
                    txtnm.setText("");
                    txtrk.setText("");
		}
		catch(FileNotFoundException evt)
		{
			System.out.println("The file was not found");
		}
		catch(IOException evt)
		{
			evt.printStackTrace();
		}
        }
        if(e.getSource().equals(display))
        {
                
                try
                {
                        FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String s;
			s=br.readLine();
			while(s!=null)
			{
				System.out.println(s);
                                txt1.append(s);
                                txt1.append("\n");
				s=br.readLine();
			}
			br.close();
                        System.out.println("Finished");
		}
		catch(FileNotFoundException evt)
		{
			System.out.println("The file was not found");
		}
		catch(IOException evt)
		{
			evt.printStackTrace();
		}
        }
    }  
    public static void main(String args[])
    {
        new Practical7();
    }
}
//<JApplet code="Practical7.class" width="229" height="111"></JApplet>
