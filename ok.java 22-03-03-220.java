public class ok {
    public static void main(String[] args) {
        String s="ahbgdc";
        String k="abc";
        int i=0;
        while(i<s.length())
        {
            boolean ok=s.contains(k);
            System.out.println(ok);
        }
    }
}
