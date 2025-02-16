class Mathss
{
    void Mathss()
    {
        System.out.println("Default constructor of maths");
    }
}
class Demook extends Mathss implements Runnable
{
    public void run()
    {
        System.out.println("RUNNABLE FUNCTION");
    }
}
public class multi_threading extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) 
    {
        multi_threading m1=new multi_threading();
        m1.start();
        multi_threading m2=new multi_threading();
        m2.start();
        //m2.sleep(null);
        multi_threading m3=new multi_threading();
        m3.start();
        Demook n=new Demook();
        Thread d=new Thread(n);
        d.start();
    }
}
