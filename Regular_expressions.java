import java.util.regex.*;
public class Regular_expressions 
{
    public static void main(String[] args) 
    {
        Pattern p=Pattern.compile("[0-9]+");
        Matcher m=p.matcher("Hello World 2345 HHHHello 12345");
        while(m.find()) 
        {
            System.out.println(m.group());
        }
    }
    
}
