import java.util.*;
public class menu {
    public static void main(String[] args) {
        System.out.println("Enter your choice (1-5):");
        double price=0;
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("You selected Margherita Pizza.");
            price=price+8;
        }
        else if(choice==2)
        {
            System.out.println("You selected Pepproni Pizza.");
            price=price+10;
        }
        else if(choice==3)
        {
            System.out.println("You selected Veggie Pizza.");
            price=price+9;
        }
        else if(choice==4)
        {
            System.out.println("You selected Chicken BBQ Pizza.");
            price=price+12;
        }
        System.out.println("Select the size of the pizza:");
        System.out.println("1. Small - $2");
        System.out.println("2. Medium - $4");
        System.out.println("3. Large - $6");
        System.out.println("Enter your choice(1-3): ");
        int size=sc.nextInt();
        if(size==1)
        {
            System.out.println("You selected Small size");
            price=price+2;
        }
        else if(size==2)
        {
            System.out.println("You selected Medium pizza ");
            price=price+4;
        }
        else
        {
            System.out.println("You selected Large pizza");
            price=price+6;
        }
        System.out.println("Do you want to add toppings?");
        System.out.println("1. Cheese- $1");
        System.out.println("2. Olives -$1.5");
        System.out.println("3. Mushrooms -$2");
        System.out.println("4. Bacon -$3");
        System.out.println("5. No more toppings");
        System.out.println("Enter your topping choice (1-5)");
        while(true)
        {
        int toppings=sc.nextInt();
        if(toppings==1)
        {
            System.out.println("You added cheese");
            price=price+1;
        }
        else if(toppings==2)
        {
            System.out.println("You added Olives");
            price=price+1.5;
        }
        else if(toppings==3)
        {
            System.out.println("You added Mushrooms");
            price=price+2;
        }
        else if(toppings==4)
        {
            System.out.println("You added Bacon");
            price=price+3;
        }
        else 
        {
            break;
        }
    }
        System.out.println("Your total cost is:$" + price);
        System.out.println("Would you like to order another pizza");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int finall=sc.nextInt();
        if(finall==2)
        {
            System.out.println("Thank you for your order");
        }


    }
}
