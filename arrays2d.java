public class arrays2d {
    public static void main(String[] args)
    {
        int[][] arr=new int[][]{{10,20,30,50},{40,50,60},{9,10}};
        System.out.println(arr.length);
        // for(int row=0;row<2;row++)
        // {
        //     for(int col=0;col<3;col++)
        //     {
        //         System.out.print(arr[row][col]+ " ");
        //     }
        //     System.out.println();
        // }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("The length of the row " + i +" is: " + arr[i].length+" ");
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+ " ");
            }   
            System.out.println();
        }
    }
    
}
