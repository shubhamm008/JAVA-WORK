class Node
{
    public
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
class Demo
{
    Node start=null;
    public void add(int value)
    {
        Node n=new Node(value);
        if(start==null)
        {
            start=n;
        }
        else
        {
            n.next=start;
            start=n;
        }
    }
    public void display() 
    {
        Node temp = start;
        while (temp != null) 
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class linked_list {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.add(10);
        d.add(20);
        d.add(30);
        d.display();
    }
}
