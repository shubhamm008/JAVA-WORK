
public class recursion 
{
    public static int sum1=0;
    public static int sum2=0;
        static void print(int num)
        {
            if(num>10)return;
            System.out.print(num + " ");
            print(num+1);
        }
        static void print1(int num)
        {
            if(num<1)return;
            System.out.print(num + " ");
            print1(num-1);
        }
        static void sum(int num)
        {
            if(num>10)return;
            sum1=sum1+num;
            sum(num+1);
        }
        static int fibo(int n)
        {
            if(n==0 || n==1)
            {
                return n;
            }
            sum2=fibo(n-1)+fibo(n-2);
            return sum2;
        }
    public static void main(String[] args) 
    {
        print(1);
        System.out.println();
        print1(10);
        System.out.println();
        sum(1);
        System.out.println(sum1);
        int ok=fibo(7);
        System.out.println(ok);
    }
}
