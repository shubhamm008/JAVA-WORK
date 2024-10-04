import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class meh extends JFrame implements ActionListener
{
    private 
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2;
    int ctr=2;
    meh()
    {

        l1=new JLabel("Enter first number:");
        l2=new JLabel("Enter second number:");
        l3=new JLabel("Sum is:");
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        b1=new JButton("Sum");
        b2=new JButton("Reset");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        b2.addActionListener(this);
        b1.addActionListener(this);
        setSize(400,300);
        b1.setBounds(300,200,150,40);
        setTitle("meh");
        setBounds(90,20,800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==b1)
        {
            int x=Integer.parseInt(t1.getText());
            int y=Integer.parseInt(t2.getText());
            int sum=x+y;
            t3.setText(String.valueOf(sum)); 
        }
         else if(e.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }   
        
    }
}


public class demoswings {
    public static void main(String[] args) 
    {
        meh m1;
        m1=new meh();

    }
}
