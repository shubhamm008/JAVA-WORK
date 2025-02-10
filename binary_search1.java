public class binary_search1 {
    public static int searchS(int []arr,int target)
    {
        int ind=Integer.MAX_VALUE;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target && mid<ind)
            {
                ind=mid;
                end=mid-1;
            }
            else if(target<arr[mid])end=mid-1;
            else if(target>arr[mid])start=mid+1;
        }
        return ind;
    }
    public static int searchG(int []arr,int target)
    {
        int ind=Integer.MIN_VALUE;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target && mid>ind)
            {
                ind=mid;
                start=mid+1;
            }
            else if(target<arr[mid])end=mid-1;
            else if(target>arr[mid])start=mid+1;
        }
        return ind;
    }
    public static void main(String[] args) 
    {
        int arr[]=new int[]{10,20,30,30,40,50};
        int first=searchS(arr,30);
        int last=searchG(arr,30);
        System.out.println("First occurance is : " + first);
        System.out.println("Last occurance is: " + last);

    }
}
