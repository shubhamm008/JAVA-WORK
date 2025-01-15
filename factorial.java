import java.util.Scanner;
public class factorial 
{
    public static int input()
    {
        int ok;
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter a no: ");
        ok=sc.nextInt();
        return ok;
    }
    public static int input1(int num1,int num2)
    {
        return num1;
    }
    public static int fact(int num)
    {
        if(num==0)return 1;
        return num*fact(num-1);
    }
    public static int sum(int n,int n1)
    {
        if(n==n1)return n1;
        return n+sum(n+1,n1);
    }

    public static void main(String[] args) 
    {
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your choice");
            System.out.println("1 for factorial");
            System.out.println("2 for sum of ranges");
            int choice=sc.nextInt();
            if(choice==1)
            {
                int k=input();
                int p=fact(k);  
                System.out.println("Factorial is : " + p);
            }
            if(choice==2)
            {
                int num1=input();
                int num2=input();
                int summ=sum(num1,num2);
                System.out.println("Sum is " + summ);
            }
            System.out.print("Do you want to check another number:");
            String ok=sc.nextLine();
            if(ok.charAt(0)!='y')
            {
                break;
            }
        }
    }
}
