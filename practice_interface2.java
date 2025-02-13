abstract class vehicle //can be extended only once and cannot create object of vehicle class  
{
    abstract void start();
}
interface engine //multiple classes can implement engine and thi engine can be accessed if it is static
{
    void engineType();
}
public class practice_interface2 extends vehicle implements engine{
    void start()
    {
        System.out.println("Abstract class start");
    }
    public void engineType()
    {
        System.out.println("Diesel of engineType");
    }
    public static void main(String[] args) 
    {
        practice_interface2 d=new practice_interface2();
        d.start();
        d.engineType();
    }
}
