import java.util.Scanner;
public class prime {
    public static int check(int num)
    {
        int ok=0;
        for(int i=2;i<=(num/2);i++)
        {
            if(num%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
        public static void main(String[] args) {
        int i,iterations=0,found=0;
        System.out.print("Enter Size of the array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(i=0;i<size;i++)
        {
            System.out.print("Enter the elements:");
            int ok=sc.nextInt();
            arr[i]=ok;
        }
        for(i=0;i<arr.length;i++)
        {
            int yes=check(arr[i]);
            if(yes!=1)
            {
                while(yes!=1)
                {   
                    arr[i]=arr[i]+1;
                    iterations++;
                    yes=check(arr[i]);
                }
            }

        }
        System.out.println(iterations);
    }
}
