interface Person
{
    void speak();
}
interface student extends Person
{
    void speak();
    void study();
}
public class practice_interface3 implements student{
    public void speak()
    {
        System.out.println("BHAW");
    }
    public void study()
    {
        System.out.println("Study");
    }
    public static void main(String[] args) 
    {
        practice_interface3 d=new practice_interface3();
        d.speak();
        d.study();
    }
}
