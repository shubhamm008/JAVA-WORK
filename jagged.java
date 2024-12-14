import java.util.Scanner;
public class jagged {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int [4][];
        arr[0]=new int[5];
        arr[1]=new int[4];
        arr[2]=new int[3];
        arr[3]=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Enter elements of the jagged array:");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i[]:arr)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
