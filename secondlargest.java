import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        int rows;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        rows=sc.nextInt();
        int arr[]=new int[rows];
        for(int i=0;i<rows;i++)
        {
                System.out.println("Enter "+ (i+1) +" element:");
                arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<rows;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            else if (arr[i]<min) 
            {
                min=arr[i];
            }
        }
        int second;
        for(int i=0;i<rows;i++)
        {
            if(arr[i]>min && arr[i]<max)
            {
                min=arr[i];
            }
        }
        System.out.println("Second largest number is:" + min);
    }
}
