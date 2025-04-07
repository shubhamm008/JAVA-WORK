class Node
{
    Node left;
    Node right;
    int data;
    Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
public class binary_tree {
    public static void main(String[] args) {
        Node root=new Node(10);
        Node terminal1=new Node(20);
        Node terminal2=new Node(30);
        root.left=terminal1;
        root.right=terminal2;
        System.out.print(root.data +" -> ");
        System.out.print(root.left.data + " -> ");
        System.out.print(root.right.data + " -> ");
        System.out.print("Null");
    }
}
