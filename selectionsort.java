public class selectionsort {
    public static void selectionsortt(int arr[])
    {
        int i=0;
        // System.out.println(arr.length);[10,9,8,7,6]
        while(i<arr.length)
        {
            int ind=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[ind])
                {
                    ind=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[ind];
            arr[ind]=temp;
            i++;
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertionsort(int arr[])
    {
        int i=0;
        int j;
        while(i<arr.length)//[10,9,8,7,6]
        {
            int element=arr[i];
            for(j=i-1;j>=0 && arr[j]>element;j--)
            {
                arr[j+1]=arr[j];
            }
            arr[j+1]=element;
            i++;
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k] +" ");
        }
    }
    public static void main(String[] args) 
    {
        int arr[]={10,9,8,7,6};
        // insertionsort(arr);
        selectionsortt(arr);
    }
}
