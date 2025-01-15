import java.util.Scanner;
public class digits_recurssion
{
    public static String [] arr={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigit(int num)
    {
        if(num<10)
        {
            System.out.println(arr[num]);
            return;
        }
        printDigit(num/10);
        System.out.println(arr[num%10]);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int ok=sc.nextInt();
        printDigit(ok);
    }
}
