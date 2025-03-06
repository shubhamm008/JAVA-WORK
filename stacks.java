import java.util.ArrayList;

public class stacks {
    ArrayList <Integer>arr=new ArrayList<>();
    void push(int element)
    {
        arr.add(element);
    }
    int top()
    {
        if(!arr.isEmpty())
        return (arr.get(arr.size()-1));
        else return 0;
    }
    Boolean isEmpty()
    {
        if(arr.isEmpty())return true;
        return false;
    }
    int pop()
    {
        int ok=arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        return ok;
    }
    void display()
    {
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
    }
    public static void main(String[] args)
    {
        stacks s=new stacks();
        s.push(10);
        s.push(20);
        s.push(30);
        int top=s.top();
        System.out.println("Top element is:" + top);
        Boolean b=s.isEmpty();
        System.out.println(b);
        int k=s.pop();
        System.out.println("This element was deleted:" + k);
        s.display();
    }
}
