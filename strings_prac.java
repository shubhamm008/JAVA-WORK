public class strings_prac {
    public static void main(String[] args) {
        String ok="ABC";
        ok=ok.concat(".jsp");
        // System.out.println(ok);
        // System.out.println(ok.length());
        // ok=ok.toUpperCase();
        // System.out.println(ok);
        // char [] arr=ok.toCharArray();
        // System.out.println(arr);
        // System.out.println(ok.equalsIgnoreCase("Shubham Singh"));
        System.out.println(ok.substring(ok.lastIndexOf('.'),ok.length()));
    }
}
