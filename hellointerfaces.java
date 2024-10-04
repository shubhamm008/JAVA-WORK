interface Myinterface
{
    public void fun1();
    public void fun2();
}
class MyThread implements Runnable
{
    public void run()
    {
        for(int i=1;i<=300;i++)
        {
        System.out.println("value of i " + i);
        }
    }
}

public class hellointerfaces {
    public static void main(String[] args)throws InterruptedException {
        System.out.println("I am main");
        MyThread m1=new MyThread();
        MyThread m2=new MyThread();
        MyThread m3=new MyThread();
        Thread th1=new Thread(new MyThread());
        Thread th2=new Thread(m2);
        Thread th3=new Thread(new MyThread());
        th1.start();
        th2.start();
        th3.start();
        Thread.sleep(50);
        System.out.println("exiting from main");
    }
}

