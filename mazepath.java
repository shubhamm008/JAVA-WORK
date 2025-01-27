import java.util.Scanner;

public class mazepath {
    public static boolean path(int arr[][],int i,int j , int n ,int m)
    {
        if(i==n-1 && j==m-1)
        {
            System.out.println(i + " " + j);
            return true;
        }
        if(j==m)return false;
        System.out.println(i +" " + j);
        while(!path(arr,i,j+1,n,m)&& i<n)i++;
        if(i==n)return false;
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows in the array:");
        int size=sc.nextInt();
        System.out.print("Enter number of columns:");
        int size1=sc.nextInt();
        int arr[][]=new int[size][size1];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size1;j++)
            {
                arr[i][j]=0;
            }
        }
        path(arr,0,0,size,size1);
    }
}
