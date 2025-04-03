import java.util.Random;

public class Randomm {
    public static void main(String[] args) {
        Random r=new Random();
       //Bound se ek kam value tk consider krta
        // System.out.println(r.nextInt(100, 200));
        char random=(char)(r.nextInt(26)+'A');
        // System.out.println(random);
        // int random1=r.nextInt(100000,1000000);
        // System.out.println(random1);
        String ok="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
        StringBuilder k=new StringBuilder();//thread safe ni hota string builder
        for(int i=0;i<10;i++)
        {
            int index=r.nextInt(ok.length());
            k.append(ok.charAt(index));
        }
        System.out.println("Random Password: " + k);
    }
}
