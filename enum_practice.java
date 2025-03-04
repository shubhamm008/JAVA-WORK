enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

enum Season {
    WINTER, SPRING, SUMMER, FALL;
}

public class enum_practice {
    public static void main(String[] args) {
        
        System.out.print("Ordinal values of Days: ");
        System.out.print(Day.SUNDAY.ordinal() + " ");
        System.out.print(Day.MONDAY.ordinal() + " ");
        System.out.print(Day.TUESDAY.ordinal()+ " ");
        System.out.println();
        System.out.print("Comparison of Days:");
        System.out.print(Day.SUNDAY.compareTo(Day.MONDAY) + " "); 
        System.out.print(Day.MONDAY.compareTo(Day.SUNDAY)); 
        System.out.print("\nOrdinal values of Seasons:");
        System.out.print(Season.WINTER.ordinal() + " ");
        System.out.print(Season.SPRING.ordinal() + " ") ;
        System.out.print(Season.SUMMER.ordinal() + " ");
        System.out.print(Season.FALL.ordinal() + " " );
    }
}
