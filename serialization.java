import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serialization implements Serializable{
    private int empId;
    private String Name;
    serialization(int n,String s)
    {
        this.empId=n;
        this.Name=s;
    }
    public int getEmpID()
    {
        return empId;
    }
    public String getName()
    {
        return Name;
    }
    public static void main(String[] args) {
        try
        {
            serialization s=new serialization(1, "Shubham");
            ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("Shubham.txt"));
            o.writeObject(s);
            o.close();
            ObjectInputStream s1=new ObjectInputStream(new FileInputStream("Shubham.txt"));
            serialization k=(serialization)s1.readObject();
            System.out.println(k.getEmpID());
            System.out.println(k.getName());
            s1.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
