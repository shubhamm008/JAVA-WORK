import java.util.Vector;
import java.util.*;
public class vector {
    public static void main(String[] args) 
    {
        Vector <String> v=new Vector<>();
        v.add("shubham");
        v.add("singh");
        v.add(2,"indigo");
        //Vector v=new Vector<String>();
        // Scanner sc=new Scanner(System.in);
        // for(int i=0;i<5;i++)
        // {
        //     String str;
        //     System.out.println("Enter string:");
        //     str=sc.next();
        //     v.add(str);
        // }
        v.remove("indigo");//indigo jiss index p hai wo wha se udd jayega
        System.out.println(v);
        int i=v.capacity();
        System.out.println(i);//default capacity of the vector is 10
        v.add("op");
        boolean ok=v.contains("op");
        System.out.println(ok);
       String ik= v.getLast();
       System.out.println(ik);
       v.trimToSize();//capacity uttni kr dega jitne elements honge 
       System.out.println(v.capacity());
       v.ensureCapacity(1);//specifies the minimum capacity of the vector
       System.out.println(v);
    //    v.clear();//element are cleared from the vector array
    //    System.out.println(v);
       ok=v.contains("op");
       System.out.println(ok);//true
       i=v.hashCode();
       System.out.println(i);//hash code 1?????????????
       List <String> s=v.reversed();
       System.out.println(s);
    // String sh=v.elementAt(1);
    // System.out.println(sh);
    }
}
