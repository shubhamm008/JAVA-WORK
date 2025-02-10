import java.util.Scanner;

public class binary_search {
    public static int search(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your target element: ");
        int target=sc.nextInt();
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }   
            else if(target<arr[mid])end=mid-1;
            else if(target>arr[mid])start=mid+1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int []arr=new int[]{10,20,30,40,50,60,70};
        int ok=search(arr);
        System.out.println("Found at index : " + ok);
    }
}
