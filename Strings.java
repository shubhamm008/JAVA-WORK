import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // System.out.println("Hello");
        // String s1=new String();
        // s1="baby";
        // String s2="Welocme to the strings";
        // System.out.println(s1);
        // System.out.println(s2);
        // char ch[]={'A','B','C','D','E','F'};
        // String s3=new String(ch);
        // System.out.println(s3);
        // String ok="hello";
        // String ok1=new String("hello");
        // System.out.println(ok==ok1);//reference check krta hai na ki value 
        // String ok="SUI";
        // String ok2="S";
        // System.out.println(ok.length());
        // System.out.println((ok2.equals("hamlo")));
        // System.out.println(ok.equalsIgnoreCase("sui"));
        // System.out.println(ok.startsWith("S"));
        // System.out.println(ok.endsWith("UI"));
        // System.out.println(ok.compareTo(ok2));
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your string:");
        String ok=sc.nextLine();
        String ok1=new String();
        int k=0;
        for(int i=ok.length()-1;i>=0;i--)
        {
            ok1=ok1+ok.charAt(i);
        }
         if(ok.equals(ok1))
         {
            System.out.println("Palindrome");
         }
         else
         {
            System.out.println("Not palindrome");
         }
    }
}
