interface Flyable
{
    void fly();
}
interface Swimmable
{
    void swim();
}
public class practice_interface4 implements Flyable,Swimmable{
    public void fly()
    {
        System.out.println("FLYYYYY");
    }
    public void swim()
    {
        System.out.println("SWIMMMM");
    }
    public static void main(String[] args) 
    {
        practice_interface4 d=new practice_interface4();
        d.swim();
        d.fly();
    }
}
