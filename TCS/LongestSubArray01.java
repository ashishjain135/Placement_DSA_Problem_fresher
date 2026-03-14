/***
 * Longest Subarray With Equal 0s and 1s
Problem Statement

Given a binary array (containing only 0s and 1s), find the length of the longest subarray having equal number of 0s and 1s.

Input

First line contains N (size of array)
Second line contains N elements

Example:

6
0 1 0 1 1 0
Output
6
Explanation

Array

0 1 0 1 1 0

Subarray:

0 1 0 1 1 0

Number of 0s = 3
Number of 1s = 3

So longest length = 6

Another Example

Input

5
0 0 1 0 1

Output

4

Subarray

0 1 0 1
 * 
*/

public class LongestSubArray01{
    public static void main(String[]args){
        int[] arr = {0,1,0,1,0};
        int n = arr.length;
        int count0 = 0;
        int count1 = 0;
        int ans = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == 0) count0++;
            else count1++;

            if(count0 == count1){
                ans = i+1;
            }
        }
        System.out.println(ans);
    }
}