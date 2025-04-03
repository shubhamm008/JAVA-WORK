import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Local_Date_Time {
    public static void main(String[] args) {
        LocalDate ss=LocalDate.now();
        System.out.println("Todays Date is : " + ss);//year-month-date
        LocalDate s=LocalDate.of(2000,1,30);
        System.out.println("Custom Date: "+s);
        LocalTime time=LocalTime.now();
        System.out.println("TIME IS: "+ time);//hours minute seconds
        LocalTime cs=LocalTime.of(23,59,59);
        //By default yeh time store ni krta automatically 
        System.out.println(cs);
        LocalDateTime s1=LocalDateTime.now();
        System.out.println(s1);//year month time hours minuites and seconds 
        System.out.println("Day of Month: "+ s1.getDayOfMonth());
        System.out.println("Current Month: "+s1.getMonthValue());
        System.out.println("Current Min: " + s1.getMinute());
        System.out.println("Current Year: " + s1.getYear());
        System.out.println("Day of Week: "+s1.getDayOfWeek());
        System.out.println("Year after 10 Years: " + s1.plusYears(10));
        System.out.println(LocalDateTime.of(2025,12,15,12,59));
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = s1.format(f);
        System.out.println(formattedDateTime);
        LocalTime a=LocalTime.now();
        LocalTime b=LocalTime.of(23, 59, 59);
        Duration d=Duration.between(a, b);
        System.out.println("Time Duraction= " + d);
        Duration d1=Duration.ofHours(5);
        System.out.println(d1);
        LocalDate currDate=LocalDate.now();
        LocalDate nextDate=LocalDate.of(2026,3,31);
        Period d3=Period.between(nextDate, currDate);
        System.out.println(d3);
        ZoneId d0=ZoneId.systemDefault();
        System.out.println(d0);
        LocalDateTime dd=LocalDateTime.now();
        ZoneId Kolkata=ZoneId.of("Asia/Kolkata");
        System.out.println(Kolkata);
        ZonedDateTime zonedDateTime=dd.atZone(Kolkata);
        System.out.println(zonedDateTime);
    }
}
