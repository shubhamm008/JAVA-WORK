import java.util.Scanner; 
public class student {
    Scanner sc=new Scanner(System.in);
    int roll;
    int fee;
    public
    void input()
    {
        System.out.print("Enter your roll number:");
        this.roll=sc.nextInt();
        System.out.print("Enter your fee:");
        this.fee=sc.nextInt();
    }
    void display()
    {
        System.out.println("Your roll number is : " + this.roll);
        System.out.println("Your fee is : " + this.fee);
    }
    public static void main(String[] args) {
        student[] st=new student[5];
        for(int i=0;i<5;i++)
        {
            st[i]=new student();
            st[i].input();
        }
        for(int i=0;i<5;i++)
        {
            st[i].display();
        }
    }
}
