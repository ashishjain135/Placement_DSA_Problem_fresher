/**
 * 
 * Leaders in an Array
 * 
 * Problem

Given an array of integers, find all the leaders in the array.

An element is called a leader if it is greater than all the elements to its right side.

The rightmost element is always a leader.

Input

First line contains integer N (size of array)
Second line contains N integers

6
16 17 4 3 5 2
Output

Print all leaders separated by space.

17 5 2
Explanation

Array:

16 17 4 3 5 2

Check from right side:

2 → leader

5 > 2 → leader

3 < 5 → not leader

4 < 5 → not leader

17 > 5 → leader

16 < 17 → not leader

Final answer:

17 5 2
 */


 import java.util.*;

public class LearderInArrays {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr  = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        ArrayList<Integer>result = new ArrayList<>();
        result.add(arr[n-1]);
        int currentMax = arr[n-1];
        for(int i = n-2; i>=0; i++){
            if(currentMax < arr[i]){
                currentMax = arr[i];
                result.add(arr[i]);
            }
        }
        for(int i = 0; i<result.size(); i++){
            System.out.print(result.get(i)+ " ");
        }
    }
}
