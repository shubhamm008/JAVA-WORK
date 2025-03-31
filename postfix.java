import java.util.Stack;

public class postfix {
    public static void main(String[] args) {
        Stack <Integer> s1=new Stack<Integer>();
        String s="1020+30+40+5010*-";
        int i=0;
        int p=0;
        while(i<=s.length()-1)
        {
            if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/')
            {
                int n1=s1.peek();
                s1.pop();
                int n2=s1.peek();
                s1.pop();
                switch(s.charAt(i))
                {
                    case '+':
                    s1.push(n1+n2);
                    break;
                    case '-':
                    s1.push(n1-n2);
                    break;
                    case '/':
                    s1.push(n1/n2);
                    case '*':
                    s1.push(n1*n2);
                }
            }
            else
            {
                StringBuilder demo=new StringBuilder();
                for(int k=0;k<2;k++)
                {
                    if(Character.isDigit(s.charAt(p)))
                    {
                        demo.append(s.charAt(p));
                        p++;
                    }
                }
                int ok=Integer.parseInt(demo.toString());
                System.out.println(ok);
                s1.push(ok);
            }
            i++;
        }
        System.out.println(s1.peek());
    }
}
