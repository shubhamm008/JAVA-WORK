import java.util.Scanner;
import java.util.Vector;

public class vectorInput {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Vector <Integer> V= new Vector<>();
        System.out.print("Enter number of elements :");
        int no=sc.nextInt();
        for(int i=0;i<no;i++)
        {
            System.out.print("Enter elemnts on the index "+(i+1)+" :");
            int ok=sc.nextInt();
            V.add(ok);
        }
        System.out.print("Enter which element you want to search for:");
        int search=sc.nextInt();
        int found=0;
        for(int i=0;i<V.size();i++)
        {
            if(V.elementAt(i)==search)
            {
                System.out.println("Found at index: "+(i+1));
                found=1;
                break;
            }
        }
        if(found==0)
        {
            System.out.println("Not found");
        }
    }
}
