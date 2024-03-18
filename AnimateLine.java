
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnimateLine extends JFrame implements Runnable,ActionListener,ItemListener
{
    Thread t1;
    boolean stopflag;
    int i=100,j=0;
    JButton btstart,btstop;
    JComboBox cbo1;
    JPanel p;
    String str="null";
    int k=0;
   
    public AnimateLine()
    {
        p=new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.TRAILING));
        p.setBounds(300,300,200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        btstart=new JButton("Start");
        btstop=new JButton("Stop");
        cbo1=new JComboBox();
        cbo1.addItem("Clockwise");
        cbo1.addItem("AntiClockwise");
        btstart.addActionListener(this);
        btstop.addActionListener(this);
        cbo1.addItemListener(this);
        p.add(btstart);
        p.add(btstop);
        p.add(cbo1);
        getContentPane().add(p);
       
        setSize(400,200);            
    }
    public void run()
    {
        i=100;
        j=0;
        int k=0,l=0;
        if(str.equals("Clockwise"))
        {
            
            i=100;
            j=0;
            k=0;
            for(;;)
            {
                try
                {  
                    //System.out.println("i="+i+";");
                    //System.out.println("j="+j+";");
                    if(k>=0 && k<200)
                    {
                        i+=10;
                        j+=10; 
                        k=i;  
                        l=j;
                    }
                    if(k>=200 && k<300)
                    {
                        i-=1;
                        j+=1;  
                        k=k+1;
                    }
                    if(k>=300 && k<400)
                    {
                        i-=1;
                        j-=1;
                        k=k+1;
                    }
                    System.out.println("k="+k);
                    if(k>=400 && k<501)
                    {
                        i+=1;
                        j-=1;
                        k=k+1;
                        if(k==501)
                           k=0;
                    }
                    if(stopflag)
                        break;	
                    Thread.sleep(100);
                    repaint();
                }
                catch(InterruptedException e)
                {
                    System.out.println("problem!");
                }
            }
        }  
        if(str.equals("AntiClockwise"))
        {
           
            i=100;
            j=0;
            k=0;
            for(;;)
            {
                try
                {  
                    System.out.println("i="+i+";");
                    System.out.println("j="+j+";");
                    if(k>=0 && k<100)
                    {
                        i-=1;
                        j+=1;
                        k=k+1;                         
                    }
                    if(k>=100 && k<200)
                    {
                        i+=1;
                        j+=1;
                        k=k+1;
                    }
                    if(k>=200 && k<300)
                    {
                        i+=1;
                        j-=1;
                        k=k+1;
                    }
                    if(k>=300 && k<401)
                    {
                        i-=1;
                        j-=1;
                        k=k+1;
                        if(k==401)
                            k=0;
                    }
                   
                    if(stopflag)
                        break;	
                    Thread.sleep(50);
                    repaint();
                }
                catch(InterruptedException e)
                {
                    System.out.println("problem!");
                }
            }
        }        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource().equals(btstart))
        {
            System.out.println(str);
            if(str.equals("null"))
            {
                JOptionPane.showMessageDialog(null,"Plz. Select an option");
            }
            else
            {
                try
                {
                    t1=new Thread(this);
                    t1.start();
                }
                catch(Exception e)
                {}
            }
            
        }
        if(ae.getSource().equals(btstop))
        {
            try
            {
                t1.stop();
            }
            catch(Exception e)
            {}
            System.out.println(t1.getState());
        }
    }
    public void itemStateChanged(ItemEvent ie)
    {
        str=(String)cbo1.getSelectedItem();
        System.out.println(str); 
    }

    public void paint(Graphics g)
    {
		super.paint(g);
                g.drawOval(50,50,100,100);
                //g.drawLine(100,100,100,0);//top
                //g.drawLine(100,100,200,100);//right              
                //g.drawLine(100,100,100,200);//down
                //g.drawLine(100,100,0,100);//left
                g.drawLine(100,100,100,0);
                g.drawLine(100,100,i,j);
    }	

	public static void main(String args[])
	{
		AnimateLine b=new AnimateLine();
		
		b.setVisible(true);
	}
}
