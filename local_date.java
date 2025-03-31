import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class local_date {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter Your Birth Year: ");
        // int Year=sc.nextInt();
        // System.out.print("Enter Your Birth Month :");
        // int Month=sc.nextInt();
        // System.out.print("Enter Your Birth Date : ");
        // int Day=sc.nextInt();
        // LocalDate d=LocalDate.now();
        // LocalDate d1=LocalDate.of(Year, Month, Day);
        // Period p=Period.between(d, d1);
        // System.out.println(p);
        // sc.close();
        Instant s=Instant.now();
        for(int i=0;i<5000000;i++)
        {

        }
        Instant s1=Instant.now();
        System.out.println(Duration.between(s,s1));
    }
}
