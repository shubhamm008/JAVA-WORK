public class subsequence {
    public static void main(String[] args) {
        subsequence("abc", "");
    }
    public static void subsequence (String ques,String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        subsequence(ques.substring(1), ans+ques.charAt(0));
        subsequence(ques.substring(1), ans+"");
    }
}
