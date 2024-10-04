import java.util.Scanner;
class Maths
        {
            private int num1;
            private int num2;
            private int res;
            Scanner sc;
            Maths()
            {
                sc=new Scanner(System.in);
            }
            public static int ctr;
            public static void increment()
            {
                ctr++;
                System.out.println("ctr is:"+ctr);
            }
            public void input()
            {
                System.out.println("Enter first number:");
                num1=sc.nextInt();
                System.out.println("Enter second number:");
                num2=sc.nextInt();
            }
            public void display()
            {
                res=num1+num2;
                System.out.println("Sum is:"+res);
            }

        }
public class static_variable {
    public static void main(String[] args)
    {
        Maths mt1,mt2,mt3;
        mt1=new Maths();
        mt2=new Maths();
        mt3=new Maths();
        mt1.ctr=100;
        System.out.println("ctr through mt3 is:"+mt3.ctr);
        Maths.increment();
        mt1.input();
        mt1.display();

    }  
}
