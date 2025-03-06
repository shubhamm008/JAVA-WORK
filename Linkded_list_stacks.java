class Linked {
    public 
    int data;
    Linked next;
    public Linked(int data)
    {
        this.data=data;
        this.next=null;
    }
    public Linked()
    {

    }
    public Linked push(Linked head,int data)
    {
        Linked nn=new Linked(data);
        // if(head==null)return nn;
        Linked temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=nn;
        return head;
    }
    public int pop(Linked head)
    {
        Linked temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        int data=temp.next.data;
        temp.next=null;
        return data;
    }
    public void display(Linked head)
    {
        Linked temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }
    void peak(Linked head)
    {
        Linked nn=head;
        while(nn.next!=null)
        {
            nn=nn.next;
        }
        System.out.println(nn.data);
    }
    Boolean isEmpty(Linked head)
    {
        if(head==null)return true;
        return false; 
    }
}

public class Linkded_list_stacks 
{
    public static void main(String[] args)
    {
        Linked head=new Linked(10);
        head=head.push(head, 20);
        head.peak(head);
        Boolean k=head.isEmpty(head);
        System.out.println(k);
        int ok=head.pop(head);
        System.out.println("The element deleted was: " + ok);
        head.display(head);
    }
}
