public class Stringbuffer {
    public static void main(String[] args) 
    {
        StringBuffer sb=new StringBuffer("Hello Java");
        // System.out.println(sb.capacity());//empty string buffer can contain 16 characters and yeh dynamic hoti hai 
        // System.out.println(sb.length());//currently how many characters
        // sb.append("Helloo");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
        System.out.println(sb.capacity());//khaali string ki 16 hoti hai yeh j=jitne characters hai uttni space extend kr dega
        // System.out.println(sb.append(" java"));
        sb.insert(6, "Welcome ");
        System.out.println(sb);
        sb.delete(0, 6);
        System.out.println(sb);
        // System.out.println(sb.reverse());
        System.out.println(sb.replace(7, 15, " replaced"));

    }
}
