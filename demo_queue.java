public class demo_queue 
{
    static int index=0;
    int arr[]=new int[3];
    void push(int val)
    {
        arr[index]=val;
        index++;
    }
    int pop()
    {
        int ok=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }  
        return ok;
    }
    Boolean isEmpty()
    {
        if(arr.length==0)return true;
        return false;
    }
    void display()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    int front()
    {
        return arr[0];
    }
    public static void main(String[] args) 
    {
        demo_queue q=new demo_queue();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println(q.isEmpty());
        System.out.println("Popped element: "+q.pop());
        System.out.println("Front element is: "+q.front());
        q.display();
    }
}
