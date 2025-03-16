import java.util.Stack;
public class stacks1 {
    public static void main(String[] args) 
    {
        Stack <Integer> s = new Stack<>();
        int arr[]={10,20,30,40};
        for(int i=0;i<4;i++)
        {
            s.push(arr[i]);
        }
        for(int i=0;i<4;i++)
        {
            arr[i]=s.pop();
        }
        for(int ok:arr)
        {
            System.out.print(ok+" ");
        }
    }
}   
