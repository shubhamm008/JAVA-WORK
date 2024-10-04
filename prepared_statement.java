import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.sql.*;

class Myframe extends JFrame implements ActionListener 
{
    private
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton btn1,btn2,btn3;
    Myframe() 
    {
        l1=new JLabel("Enter first value:");
        l2=new JLabel("Enter second value");
        l3=new JLabel("Result is:");
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        btn1=new JButton("SUM");
        btn2=new JButton("SUBTRACT");
        btn3=new JButton("SAVE");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(btn1);
        add(btn2);
        add(btn3);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        setSize(400,300);
        btn1.setBounds(300,200,150,40);
        setTitle("Shahid's Work");
        setBounds(90,20,800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setVisible(true);
      
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==btn1)
        {
            int x=Integer.parseInt(t1.getText());
            int y=Integer.parseInt(t2.getText());
            int sum=x+y;
            t3.setText(String.valueOf(sum)); 
        }
         else if(e.getSource()==btn2)
        {
            int x=Integer.parseInt(t1.getText());
            int y=Integer.parseInt(t2.getText());
            int sub=x-y;
            t3.setText(String.valueOf(sub));
        }   
        else if(e.getSource()==btn3)
        {
            PreparedStatement prstmt;
            Connection con;
        try
        {
            setTitle("hello java");
            con=DriverManager.getConnection("jdbc:mysql://localhost/shubham?useSSL=false", "root", "Shubham@2005");
            prstmt=con.prepareStatement("insert into shubam values(?,?,?)");
            prstmt.setString(1,t1.getText());
            int y=Integer.parseInt(t2.getText());
            prstmt.setInt(2,y);
            int z=Integer.parseInt(t3.getText());
            prstmt.setInt(3, z);
            prstmt.executeUpdate();  
            setTitle("data saved");
        }
        catch(SQLException p)
        {
            System.out.println(p.getMessage());
        }
        }
    }   
}//end of class

public class prepared_statement {
    public static void main(String[] args) throws Exception
    {
        Myframe ms;
        ms=new Myframe();
    }
}
