interface demo
{
    void ok();
    default void disp()//can be over ridden as per choice
    {
        System.out.println("Disp function call");
    }
    static int sum(int num1,int num2)//cannot be overridden 
    {
        return num1+num2;
    }
}
public class interface1 implements demo
{
    public void ok()
    {
        System.out.println("OK OF CLASSS");
    }
    public void disp()
    {
        System.out.println("Disp of Class");
    }
    public static void main(String[] args) 
    {
        interface1 ok1=new interface1();
        ok1.ok();
        ok1.disp();
        int k=demo.sum(10,20);
        System.out.println("Sum of interface which is static : " + k);
    }
}
