public class arrays2d {
    public static void main(String[] args)
    {
        int[][] arr=new int[][]{{10,20,30},{40,50,60}};
        for(int row=0;row<2;row++)
        {
            for(int col=0;col<3;col++)
            {
                System.out.println(arr[row][col]);
            }
            System.out.println();
        }
    }
    
}
