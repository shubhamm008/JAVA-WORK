import java.util.Scanner;

public class decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary number you want to convert into decimal: ");
        int ok=sc.nextInt();
        int digit,decimal=0,power=0;
        while(ok>=1)
        {
            digit=ok%10;
            decimal+=digit*Math.pow(2,power);
            power++;
            ok=ok/10;
        }
        System.out.println(decimal);
    }
}
