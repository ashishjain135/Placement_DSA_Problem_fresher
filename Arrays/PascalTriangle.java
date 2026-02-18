/**
 * Pascal's Triangle
 * Problem: Generate the few rows of Pascal's Triangle.
 * Test Case:
 * Input: numRows = 5
 * Output:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 */

import java.util.*;
public class PascalTriangle {
    public static List<List<Integer>>generate(int numRows){
        List<List<Integer>>triangle = new ArrayList<>(); //List Store pascal triangle
        for(int i = 0; i<numRows; i++){
            List<Integer>row = new ArrayList<>();
            for(int j = 0; j<=i; j++){
                //first or last element always 1 in pascal trianle
                if(j == 0 || j == i){
                    row.add(1);

                }else{
                    //{1,2,1} ->> next row 1, (1+2), (2+1), (1)
                    int value = triangle.get(i-1).get(j-1)
                                + triangle.get(i-1).get(j);
                    row.add(value);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }

    //if we want to return Kth row in pascal triangle
    public static List<Integer>generateKth(int rowIndex){
        List<Integer>row = new ArrayList<>();
        for(int i = 0; i<=rowIndex; i++){
            row.add(1);
            for(int j = i-1; j>0; j--){
                row.set(j, row.get(j) + row.get(j-1));
            }
        }
        return row;
    }



    public static void main(String[]args){
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Enter value");

        // int numRows = scn.nextInt();

        // System.out.println(generate(numRows));

        //if we want to return Kth row in pascal triangle
        System.out.println(generateKth(10));

    }
}
