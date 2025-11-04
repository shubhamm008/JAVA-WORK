import java.util.ArrayList;

@FunctionalInterface 
interface Calculator{
    int add(int a,int b);
}
public class prac {
    public static void main(String[] args) {
        StringBuilder k=new StringBuilder();
        ArrayList<Integer>n=new ArrayList<>();
        String s="shubham";
        Calculator k1 = (a,b)->a+b;
        System.out.println(k1.add(10,20));
    }
}
