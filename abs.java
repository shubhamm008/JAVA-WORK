abstract class B
{
    public
    int a=10;
    int b=20;
    abstract void disp();
    void display()
    {
        System.out.println(a + " " + b);
    }
}
public class abs extends B{
    public static void main(String[] args) {
        abs a=new abs();
        a.disp();
        a.display();
    }
    void disp()
    {
        System.out.println("This is virtual function of the class");
    }
}
