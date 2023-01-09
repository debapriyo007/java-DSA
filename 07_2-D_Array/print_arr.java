//2-D Array....

import java.util.*;

public class print_arr {

    // search function.....

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at cell " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key is not found!");
        return false;

    }

    //min and max
    public static int min_max(int matrix[][])
    {
        int min= Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               if(matrix[i][j]<min)
               {
                 min=matrix[i][j];
               }
               
               if(matrix[i][j]>max)
               {
                 max=matrix[i][j];
               }
               
            }
          
        }
        System.out.println("The smallest num in 2-D array is:" + min);
        return max;
        
    }

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
        }

        // output part

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 5);
        System.out.println("The maximum number in the 2-D array is:" + min_max(matrix));
        sc.close();

    }
}
