interface vehicle
{
    public static final int min=-9000;
    public void start();
}
interface animal
{
    public static final int max=9000;
    public void makeSound();
}

public class interfacee implements vehicle,animal
{
    public void start()
    {   
        System.out.println("Started woooonnnnnnn tututututututututtutut");
    }   
    public void makeSound()
    {
        System.out.println("Making sound function called");
    }
     public static void main(String[] args) 
    {
        interfacee dodge=new interfacee();
        dodge.start();
        dodge.makeSound();
        System.out.println(animal.max);
        System.out.println(vehicle.min);
    }
}
