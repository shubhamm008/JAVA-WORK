import java.util.Scanner;
public class input {
    public static void main(String[] args)
    {
        Scanner sc;
        sc=new Scanner(System.in);
        int num1;
        int num2;
        int res;
        System.out.println("enter first number:");
        num1=sc.nextInt();
        System.out.println("enter second number:");
        num2=sc.nextInt();
        res=num1+num2;
        System.out.println("The sum is:"+res);
    }
    
}
