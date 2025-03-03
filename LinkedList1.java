class LinkedList1 {
    public
    int data;
    LinkedList1 next;
    static LinkedList1 headFinal;
    // Constructor
    public LinkedList1()
    {

    }
    public LinkedList1(int d) {
        this.data = d;
        this.next = null;
    }

    // Method to insert a node at the end of the list
    public static LinkedList1 insertInEnd(LinkedList1 head, int data) {
        LinkedList1 nn = new LinkedList1(data);
        
        if (head == null) {
            return nn;  // Return new node as head if list is empty
        }
        
        LinkedList1 temp = head;
        while (temp.next != null) {  // Corrected null check
            temp = temp.next;
        }
        temp.next = nn;  // Attach new node at the end
        return head;
    }
    public static LinkedList1 insertinBegin(LinkedList1 head,int data){
        LinkedList1 nn = new LinkedList1(data);
        if(head == null){
            return nn;
        }
        else
        {
            nn.next=head;
            head=nn;
        }
        return head;
    }
    public static LinkedList1 insertMid(int index,int data, LinkedList1 head)
    {
        LinkedList1 nn=new LinkedList1(data);
        LinkedList1 temp=head;
        if(index==0)
        {
            if(head==null)return nn;
            else
            {
                nn.next=head;
                head=nn;
            }
        }
        else if(head==null && index!=0)return null;
        else
        {
            int i=0;
            while(i<(index-1) && temp.next!=null)
            {
                temp=temp.next;
                i++;
            }
            nn.next=temp.next;
            temp.next=nn;
        }
        return head;
    }
    public static LinkedList1 deleteStart(int index,int data,LinkedList1 head)
    {
        if(head==null)return null;
        head=head.next;
        return head;
    }
    public static LinkedList1 deleteEnd(int index,LinkedList1 head)
    {
        LinkedList1 temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static LinkedList1 deleteMid(int index,LinkedList1 head)
    {
        LinkedList1 temp=head;
        int i=0;
        while(i<(index-1))
        {
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
    }
    public static void printList(LinkedList1 head) {
        LinkedList1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static int midIndex(LinkedList1 head)
    {
       LinkedList1 slow=head;
       LinkedList1 fast=head;
       while(fast.next.next!=null)
       {
            fast=fast.next.next;
            slow=slow.next;
       } 
       return slow.data;
    }
    public static LinkedList1 reverse(LinkedList1 head)
    {
        if(head.next==null)
        {
            headFinal=head;
            return head;
        }
        LinkedList1 tail=reverse(head.next);
        tail.next=head;
        return head;
    }
    public static LinkedList1 reverseO3(LinkedList1 head)
    {
        LinkedList1 p=null;
        LinkedList1 c=head;
        LinkedList1 n=head.next;
        while(c!=null)
        {
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
    public static void main(String[] args) {
        LinkedList1 head = new LinkedList1(10);
        head = insertInEnd(head, 20);
        head = insertInEnd(head, 30);
        head = insertInEnd(head, 40);
        // head = reverse(head);
        // head.next=null;
        // head=headFinal;
        head = reverseO3(head);
        printList(head);
    }
}