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
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter your string:");
        // String ok=sc.nextLine();
        // String ok1=new String();
        // int k=0;
        // for(int i=ok.length()-1;i>=0;i--)
        // {
        //     ok1=ok1+ok.charAt(i);
        // }
        //  if(ok.equals(ok1))
        //  {
        //     System.out.println("Palindrome");
        //  }
        //  else
        //  {
        //     System.out.println("Not palindrome");
        //  }
        //  char[]arr=new char[10];
         //        ok.getChars(0,ok.length()-9,arr,0);
         //        for(char k:arr)
         //        {
         //            System.out.print(k);
         //        }
         //        byte arr[]=ok.getBytes();
         //        for(byte b:arr)
         //        {
         //            System.out.print(b+" ");
         //
         //        }
         //        char arr[]= new char[100];
         //        arr=ok.toCharArray();
         //        for(char ok1:arr)
         //        {
         //            System.out.print(ok1);
         //        }
        // String ok="welcome to JAVA";
        // int k1=ok.indexOf('e');
        // System.out.println(k1);
        // System.out.println(ok.indexOf("to",5));
        // System.out.println(ok.lastIndexOf('e',4));
        // String k=ok.substring(11);
        // System.out.println(k);
        // System.out.println(ok.substring(8,12));
        // System.out.println(ok.replace("to","for"));
        // System.out.println(ok.trim());
        // System.out.println(ok.toUpperCase());
        // System.out.println(ok.toLowerCase());
        // String [] arr=ok.split(" ");
        Scanner sc=new Scanner(System.in);
        String ok=sc.nextLine();
        int count=1;
        //     String [] arr=ok.split(" ");
        //    System.out.println(arr.length);
        // for(int i=0;i<ok.length();i++)
        // {
        //     if(ok.charAt(i)=='a' ||  ok.charAt(i)=='e' || ok.charAt(i)=='i' || ok.charAt(i)=='o' || ok.charAt(i)=='u')
        //     {
        //         count++;
        //     }
        //     else if(ok.charAt(i)==32)
        //     {
        //         continue;
        //     }
        //     else
        //     {
        //         count1++;
        //     }
        // }
        // System.out.println("Vowels are:" + count);
        // System.out.println("Consonants are: " + count1);
        for(int i=0;i<ok.length();i++)
        {
            char k=ok.charAt(i);
            count=1;
            if(ok.charAt(i)==' ')
            {
                continue;
            }
            else
            {
            for(int j=i+1;j<ok.length();j++)
            {
                if(ok.charAt(j)==k)
                {
                    count++;
                }
            }
        }
            System.out.print(ok.charAt(i)+""+count);
            ok=ok.replace(ok.charAt(i),' ');
        }
    }
}
