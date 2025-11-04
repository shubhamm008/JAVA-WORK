public class Recusrion_Linear_Search {
    public static int LinearSearch(int i, int []arr,int target)
    {
        if(i==arr.length)return -1;
        if(arr[i]==target)return i;
        return LinearSearch(i+1, arr,  target);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(LinearSearch(0, arr,5));
    }
}