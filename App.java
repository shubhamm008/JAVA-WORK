class Maths 
{
    private int num1;
    private int num2;
    private int res;
    Maths()
    {
        System.out.println("Default Constructor");
        num1=0;
        num2=0;
    }
    public void sum(int x,int y)
    {
        num1=x;
        num2=y;
        res=num1+num2;
        System.out.println("The sum is:"+res);
    }
}
public class App {
    public static void main(String[] args) 
    {
        Maths mt;
        mt=new Maths();
        mt.sum(10,20);
    }
}
