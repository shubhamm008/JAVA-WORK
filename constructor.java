public class constructor {
    private 
    int roll;
    String name;
    float k;
    public constructor()
    {
        System.out.println("Welcome to constructor");
    }
    public void disp()
    {
        System.out.println(roll + " " + name + " " + k);
    }
    public static void main(String[] args) 
    {
        constructor c=new constructor();
        c.disp();
    }
}
