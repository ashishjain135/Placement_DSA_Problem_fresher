/**
 * Rotate a Matrix by 90 Degree in ClockWise Direction 
 * Problem -> Given n*n matrix rotate by 90 degrees in the clockwise Direction should be done in place 
 * 
 * test case: 
 * input 
 * matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * output
 * [[7,4,1],[8,5,2],[9,6,3]]
 * 
 * 
 * clock wise rotate means -> Right Rotations 
 * 1. need to transpose a matrix 
 * 2. reverse rows
 *
 * 
 * we also discuss left Rotataion or Anti Clockwise 90degree
 * 1.need to transpose then 
 * 2. reverse column
 * 
 * 
 * 
 * 180 degree rotate 
 * means 
 * 1.reverse row 
 * 2.reverse column
 */


public class Matrix90Rotate {
    public static void main(String[]args){
        //input arr 
        int mat[][] = {
            {1,2,3},{4,5,6},{7,8,9}
        };

        //step 1 transpose a matrix
        int n = mat.length;
        // for(int i = 0; i<n; i++){
        //      for(int j = i; j<n; j++){
        //         int temp = mat[i][j];
        //         mat[i][j] = mat[j][i];
        //         mat[j][i] = temp;
        //      }
        // }

        // //step 2 reverse row
        System.out.println("Your Right rotate Matrix is ..");
        for(int i = 0; i<n; i++){
            int start = 0, end = n-1;
            while(start < end){
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }


        //now print left rotate matrix 
        System.out.println("your left rotate Matrix is ");
        for(int i = 0; i<n; i++){
            int start = 0, end = n-1;
            while(start<end){
                int temp = mat[start][i];
                mat[start][i] = mat[end][i];
                mat[end][i] = temp;
                start++;
                end--;
            }
        }



        //180 degree rotate 

        //reverse row 


        //now print array
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
