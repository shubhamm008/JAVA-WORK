import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ok=sc.nextLine();
        String arr[] = ok.split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
            System.out.print(sb.reverse() + " ");
            sb.delete(0, sb.length());
        }
    }
}
