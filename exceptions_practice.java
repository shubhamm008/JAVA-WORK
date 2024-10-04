public class exceptions_practice {
    public static void main(String[] args)
    {
        int num1,num2,res=0;
        int[] arr=new int[3];
        arr[0]=2;
        arr[1]=5;
        arr[2]=7;
        num1=10;
        num2=0;
        try
        {
        res=num1/num2;
        
        }
        catch(ArithmeticException e)
        {
            res=num1/1;
        }
        System.out.println("the result is:"+res);
        
    }
    
}
