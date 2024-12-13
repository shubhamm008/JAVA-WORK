import java.util.*;
public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number you want to convert into binary");
        int ok=sc.nextInt();
        String ok1=Integer.toBinaryString(ok);
        System.out.println(ok1);
    }
}
