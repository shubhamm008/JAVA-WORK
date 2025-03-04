enum Day
    {
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
    }
enum Size
{
    SMALL(10,25),MEDIUM(20,35),LARGE(30,55);
    private int price,radius;
    Size(int s,int radius)
    {   
        this.price=s;
        this.radius=radius;
    }
    public int price()
    {
        return price;
    }
    public int radius()
    {
        return radius;
    }
}
enum ok
{
    ADD
    {
        public int apply(int a,int b)
        {
            return a+b;
        }
    },
    SUBTRACT
    {
        public int apply(int a,int b)
        {
            return a-b;
        }
    };
    public abstract int apply(int a,int b);
}
public class enumm 
{
    public static void main(String[] args) 
    {
        // System.out.println("Today is - "+ today); //It provides type safety meaning it accidently cannot be changed
        // switch (today) //boolean , float , int long , no other object than string can be passed in the switch case 
        // {
        //     case MONDAY :
        //     System.out.println("Monday");
        //     break;
        //     case TUESDAY :
        //     System.out.println("Tuesday");
        //     break;
        //     case WEDNESDAY :
        //     System.out.println("Wednesday");
        //     break;
        //     case THURSDAY :
        //     System.out.println("Thursday");
        //     break;
        //     case FRIDAY :
        //     System.out.println("Friday");
        //     break;
        //     case SATURDAY :
        //     System.out.println("Saturday");
        //     break;
        //     case SUNDAY :
        //     System.out.println("Sunday");
        //     break;
        // }
        for(Day day : Day.values())
        {   
            System.out.println(day);
        }
        // Size pizza= Size.MEDIUM;
        // System.out.println("Size of pizza is: " + pizza);
        // System.out.println("Price is: " + pizza.price() + "$");
        // System.out.println("Radius is: " + pizza.radius() + "cm");
        int add=ok.ADD.apply(20, 30);
        System.out.println("Sum is : " + add);
    }
}
