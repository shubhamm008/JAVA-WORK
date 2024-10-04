import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;
class myframe extends JFrame implements ActionListener
{
    private 
    JTextField txt1,txt2,txt3;
    JButton btn;
    int ctr;
    myframe()
    {
        ctr=0;
        txt1=new JTextField();
        txt2=new JTextField();
        txt3=new JTextField();
        btn=new JButton("Sum");
        btn.setBounds(20,20,150,40);
        btn.addActionListener(this);
        setLayout(null);
        add(txt1);
        add(txt2);
        add(txt3);
        add(btn);
        setTitle("FIRST");
        setBounds(10, 20, 800 ,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        ctr++;
        setTitle("Button clicked (" + ctr + ")Times.");
        
    }
    
}

public class swingss 
{
    public static void main(String[] args) throws Exception 
    {
        myframe myframe=new myframe();
    }
}
