import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList <Integer> l=new LinkedList<>();
        l.add(5);
        l.add(9);
        l.add(7);
        System.out.println(l);
        boolean n=l.isEmpty();
        System.out.println(n);
        int i=l.indexOf(3);
        System.out.println(i);
        Iterator <Integer>io=l.iterator();
        while(io.hasNext())
        {
            System.out.println(io.next());//io++ hota hai basically next se
        }
        l.addFirst(90);
        l.addLast(39);
        System.out.println(l);
        LinkedList <Integer> p=l.reversed();//reversed all the elemants in the linked list
        System.out.println(p);
        Iterator <Integer> o=l.descendingIterator();
        while(o.hasNext())
        System.out.println(o.next());//ullti linked list print ho ri hai
        int u=l.element();
        System.out.println(u);
        System.out.println(l);//default linked list me bhi wo reverse hojegi
        System.out.println(l.lastIndexOf(90));//search krega yeh element
    }
}
