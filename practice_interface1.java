interface Animal
{
    void makeSound();
}
class cat implements Animal
{
    public void makeSound()
    {
        System.out.println("Meow!");
    }
}
public class practice_interface1 implements Animal{

    public void makeSound()
    {
        System.out.println("Woof!");
    }
    public static void main(String[] args) 
    {
        practice_interface1 dog=new practice_interface1();
        dog.makeSound();
        cat cat=new cat();
        cat.makeSound();
    }
}
