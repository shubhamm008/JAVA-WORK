public class strings_HW_CH {
    public static void main(String[] args) {
        String s="Shubham";
        // System.out.println(s);
        String s1="Shubham";
        // System.out.println(s1==s);
        String s2=new String("Shubham");
        // System.out.println(s==s2);
        // System.out.println(s1==s2);
        // System.out.println(s.equals(s1));
        // System.out.println(s.equals(s2));//only checks the content not the address
        // String ok=s.trim();deletes the preceeding blank spaces
        // System.out.println(ok);
        // System.out.println(s.compareTo(s1));//0 when equal compares lexographically
        // System.out.println(s.contains("bham"));
        // System.out.println(s.replace('a', 'k'));
        System.out.println(s.endsWith(""));
        // System.out.println(s.indexOf("S"));
        // System.out.println(s.lastIndexOf("h"));
        // System.out.println(s.indexOf('m', 0));
        System.out.println(s.matches("Shubhamm"));
    }
}
