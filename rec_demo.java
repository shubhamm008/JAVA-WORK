import java.util.Scanner;

public class rec_demo 
{
    public static int sum(int x)
        {
            if(x<10)//23
            {
                System.out.println(x);
                return x;
            }
            int ok=x%10;
            sum(x/10);
            System.out.println(ok);
        }   
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int ok=sc.nextInt();
            sum(ok);
    }
}
