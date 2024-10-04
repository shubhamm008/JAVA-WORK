public class array3d {
    public static void main(String[] args)
    {
        int[][][] arr=new int[][][]{{{10,20,30},{10,20,30}},{{40,50,60},{40,50,60}}};
        for(int dim=0;dim<2;dim++)
        {
            for(int row=0;row<2;row++)
            {
                for(int col=0;col<3;col++)
                {
                    System.out.println(arr[dim][row][col]);
                }
                System.out.println();
            }
        }
    }    
}




