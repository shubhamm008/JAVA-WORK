abstract class ok
{
    abstract void disp();
    void display()
    {
        System.out.println("Hello this is ok display");
    }
}
public class anonymous_class 
{
    public static void main(String[] args) 
    {
        ok n=new ok() {
            public void disp()
            {
                System.out.println("this is disp of anonymous ckass");
            }
        };
        n.disp();
        n.display();
    }
}
