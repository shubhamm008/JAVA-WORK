public class Linked_list_HW {
    public 
    int data;
    Linked_list_HW next;
    public Linked_list_HW(int data)
    {
        this.data=data;
        this.next=null;
    }
    public Linked_list_HW()
    {

    }
    public static Linked_list_HW insertBegin(Linked_list_HW head,int data)
    {
        Linked_list_HW nn=new Linked_list_HW(data);
        if(head==null)return nn;
        else
        {
            nn.next=head;
            head=nn;
        }
        return head;
    }
    public static Linked_list_HW insertEnd(Linked_list_HW head,int data)
    {
        Linked_list_HW nn=new Linked_list_HW(data);
        if(head==null)return nn;
        Linked_list_HW temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=nn;
        return head;
    }
    public static Linked_list_HW insertMid(Linked_list_HW head , int data,int index)
    {
        Linked_list_HW nn=new Linked_list_HW(data);
        if(head==null)return nn;
        Linked_list_HW temp=head;
        int i=0;
        while(i<(index-1))
        {
            temp=temp.next;
            i++;
        }
        nn.next=temp.next;
        temp.next=nn;
        return head;
    }
    public static Linked_list_HW deleteStart(Linked_list_HW head)
    {
        if(head==null)return null;
        else
        {
            head=head.next;
        }
        return head;
    }
    public static Linked_list_HW deleteEnd(Linked_list_HW head)
    {
        Linked_list_HW temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static Linked_list_HW deleteMid(Linked_list_HW head,int index)
    {
        int i=0;
        Linked_list_HW temp=head;
        while(i<(index-1))
        {   
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
    }
    public static void display(Linked_list_HW head)
    {
        Linked_list_HW temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        Linked_list_HW head=new Linked_list_HW(2);
        head=insertBegin(head, 1);
        head=insertEnd(head, 5);
        head=insertMid(head, 3, 2);
        head=deleteStart(head);
        head=deleteEnd(head);
        head=deleteMid(head, 1);
        display(head);
    }
}
