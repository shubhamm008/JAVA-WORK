import java.util.Scanner;

public class string_operations {
    public static void main(String[] args)
    {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string:");
        str=sc.next();
        System.out.println("Entered string is:"+str);
        String str2=str.toUpperCase();
        System.out.println("Upper case string:"+str2);
        for(int i=0;i<str2.length();i++)
        {
            System.out.println(str2.charAt(i));
        }
    }
    
}
