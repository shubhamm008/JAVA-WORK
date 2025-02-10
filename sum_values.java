import java.util.ArrayList;
import java.util.Scanner;

public class sum_values {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer>a=new ArrayList<Integer>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(30);
       boolean ok=a.contains(30);
       a.ensureCapacity(20);
       a.add(0, 1000);
       System.out.println(a.containsAll(a));
       System.out.println(a.size());
    //    System.out.println(ok);
    //     int sum=0;
    //     for(int i=0;i<a.size();i++)
    //     {
    //         sum=sum+a.get(i);
    //     }
    //     System.out.println(sum);
    // 
    }
}
