@FunctionalInterface
interface Calculator
{
    //static and default can be many but only one abstract is applicable
    abstract int sum(int a ,int b ,int c);
}   
public class functional_interface {
    public static void main(String[] args) 
    {
        Calculator d=(a,b,c)->{
            return a+b+c;
        };
        System.out.println(d.sum(10, 20, 30));
    }
}
