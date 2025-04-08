import java.io.*;
public class file_handeling {
    public static void main(String[] args) {
        File file=new File("Shubham.txt");
        try
        {
            boolean k=file.createNewFile();
            if(k)
            System.out.println("File Successfully Created ");
            else
            System.out.println("File Exists");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("File Name: " + file.getName()+ " File Size: " + file.length());
        System.out.println("File Absolute Path: " + file.getAbsolutePath());
        System.out.println("Relative Path: " + file.getPath());
        System.out.println("It is a file: " + file.isFile());
        System.out.println("Is a directory: " + file.isDirectory());
        File dir=new File("DEMO FOLDER");
        try
        {
            boolean ok=dir.mkdir();
            if(ok)System.out.println("Directory Created");
            else
            System.out.println("Directory Exists");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(dir.getAbsolutePath());
        System.out.println(dir.getName());
        
    }
}
