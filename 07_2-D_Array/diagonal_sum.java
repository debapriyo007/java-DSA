public class diagonal_sum {

    //-------This fun Time complexity is 0(n^2)-------------------------->

    public static int sum_diagonal(int matrix[][])
    {
        int sum=0;
        // for(int i=0;i<matrix.length;i++)
        // {
        //     for(int j=0;j<matrix[0].length;j++)
        //     {
        //         //primary diagonal
        //         if(i==j)
        //         {
        //             sum+=matrix[i][j];
        //         }
        //         //secondary
        //         else if(i+j == matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        // ------------------------------------------------------------------->

        //below code Time complexity is 0(n).

        for(int i=0;i<matrix.length;i++)
        {   //primary diagonal
            sum+= matrix[i][i];
            if(i!= matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }




    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        
       System.out.println("The Diagonal sum is:"+sum_diagonal(matrix));          
    }
    
}
