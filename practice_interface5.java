interface Logger
{
    abstract void log(String s);
    default void info(String k)
    {
        System.out.println("Info:" + k);
    }
    static void error(String ok)
    {
        System.out.println("Error:" + ok);
    }
}
public class practice_interface5 implements Logger {
    public void log(String s)
    {
        System.out.println("Welcome to the log baby " + s);
    }
    public static void main(String[] args) 
    {
        practice_interface5 d=new practice_interface5();
        d.log("Log");
        Logger.error("Error");
        d.info("INFO");
    }
}
