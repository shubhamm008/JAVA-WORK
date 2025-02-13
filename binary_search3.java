public class binary_search3 
{
    public static int search(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)return mid;
            if(arr[start]==target)return start;
            if(arr[end]==target)return end; 
            else if(target<arr[mid] && target<=arr[end])start=mid+1;
            else if(target<arr[mid] && target>=arr[end])end=mid-1;
            else if(target>arr[mid] && target>arr[end] && target>arr[start])return -1;
        }
        return -1;
    }
    public static void main(String[] args){
        int []arr=new int[]{4,5,6,7,0,1,2};
        int ok=search(arr,9);
        System.out.println(ok);
    }
}
