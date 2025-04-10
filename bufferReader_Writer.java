import java.io.*;
public class bufferReader_Writer {
    public static void main(String[] args) {
        try
        {
            // FileWriter f=new FileWriter("Shubham.txt");
            // f.write("Shubham Singh is my Name");//insert character by character into the file
            // f.close();
            // FileReader f1=new FileReader("Shubham.txt");
            // int i;
            // while((i=f1.read())!=-1)
            // {
            //     System.out.print((char)i);
            // }
            // f1.close();
            BufferedWriter b=new BufferedWriter(new FileWriter("Shubham.txt"));
            b.write("Shubham Singh here");
            b.close();
            BufferedReader r=new BufferedReader(new FileReader("Shubham.txt"));
            String line;
            while((line=r.readLine())!=null)
            {
                System.out.println(line);
            }
            r.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
