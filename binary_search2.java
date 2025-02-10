public class binary_search2 
{
    public static int lowerBound(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return arr[mid];
            }   
            else if(target<arr[mid])end=mid-1;
            else if(target>arr[mid])start=mid+1;
        }
        return 0;
    }
    public static int upperBound(int arr[],int target)
    {
        int index=Integer.MAX_VALUE;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>target && arr[mid]<index)
            {
                index=arr[mid];
            }   
            else if(target<arr[mid])end=mid-1;
            else if(target>=arr[mid])start=mid+1;
        }
        return index;
    }
    public static void main(String[] args) 
    {
        int arr[]=new int []{10,20,30,40,50};
        int lb=lowerBound(arr,30);
        int ub=upperBound(arr, 30);
        if(lb==0)
        {
            lb=ub;
        }
        System.out.println("Upper bound is: " + ub);
        System.out.println("Lower bound is : " + lb);
    }
}
