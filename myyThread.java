public class myyThread extends Thread
{   public void run()
    {
        int i;
        for(i=0;i<500;i++)
        {
            System.out.println(i);
        }
        
    }
    public static void main(String[] args) {
        myyThread mt1=new myyThread();
        myyThread mt2=new myyThread();
        myyThread mt3=new myyThread();
        mt1.start();
        mt2.start();
        mt3.start();
        System.out.println("End of main");
    }
}














