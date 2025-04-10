import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class streams {
    public static void main(String[] args) {
        File file=new File("Shubham.txt");
        try
        {
            boolean k=file.createNewFile();
            if(k)System.out.println("File created successfully");
            else System.out.println("File Already exists");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        try(FileOutputStream f1=new FileOutputStream(file,true);FileInputStream read=new FileInputStream(file);)
        {
            String k="SHUBHAM SINGH ";
            f1.write(k.getBytes());
            int i;
            while((i=read.read()) != -1)
            {
                System.out.print((char) i);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}
