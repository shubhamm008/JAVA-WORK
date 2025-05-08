import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Btree
{
    Btree left;
    Btree right;
    int data;
    Btree()
    {

    }
    Btree(int n)
    {
        this.left=null;
        this.right=null;
        this.data=n;
    }
    void preOrder(Btree root)
    {
        if(root==null)return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    void inOrder(Btree root)
    {
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.data +  " ");
        inOrder(root.right);
    }
    void postOrder(Btree root)
    {
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +  " ");
    }
    static Btree createTree()
    {
        System.out.print("Enter The Root Element : ");
        Scanner sc=new Scanner(System.in);
        Btree root=new Btree(sc.nextInt());
        Queue<Btree> s=new LinkedList<>();
        s.add(root);
        while(!s.isEmpty())
        {
            Btree temp=s.poll();
            System.out.print("Enter the left value of " + temp.data  + ": ");
            int val=sc.nextInt();
            if(val!=-1)
            {
                temp.left=new Btree(val);
                s.add(temp.left);
            }
            System.out.print("Enter the right value of " + temp.data + ": ");
            val = sc.nextInt();
            if(val!=-1)
            {
                temp.right=new Btree(val);
                s.add(temp.right);
            }
        }
        sc.close();
        return root;
    }
    void heightPrint(Btree root)
    {
        Queue<Btree> s=new LinkedList<>();
        s.add(root);
        while(!s.isEmpty())
        {
            Btree temp=s.poll();
            System.out.print(temp.data + " ");
            if(temp.left!=null)
            {
                s.add(temp.left);
            }
            if(temp.right!=null)
            {
                s.add(temp.right);
            }
        }
    }
}
//       1
//   2      3  
// 4   5  6    7  
public class BinaryTree {
    public static void main(String[] args) 
    {
       Btree root=Btree.createTree();
    //    System.out.print(root.data);
       System.out.print("Preorder is: ");
       root.preOrder(root);
       System.out.println();
       System.out.print("Inorder is: ");
       root.inOrder(root);
       System.out.println();
       System.out.print("PostOrder is: ");
       root.postOrder(root);
       System.out.println();
       System.out.print("Height Wise Print: ");
       root.heightPrint(root);
    }
}
