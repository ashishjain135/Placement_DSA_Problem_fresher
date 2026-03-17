/**
 * problem : smallest sub Array with Sum Grether than X
 * 
 * Given an array of N integers and a number X, find the length of the smallest subarray whose sum is greater than X.

If no such subarray exists print 0.

Input
6
1 4 45 6 10 19
51

Meaning

N = 6
array = 1 4 45 6 10 19
X = 51
Output
3

Explanation

subarray = 4 + 45 + 6 = 55
length = 3
 * 
 * 
 */

 import java.util.*;
 public class smallestSubArrayWithSumGreaterThanX{

    public static int greaterThanX(int arr[] , int x){
        int n = arr.length;
        int i = 0;
        int j = 0;
        int sum = 0;
        int length = Integer.MAX_VALUE;
        while(i<n){
            sum += arr[i];
            while(sum > x && j < n){
                length = Math.min(length, i - j+1);
                
                //reduce sum and check 
                sum -= arr[j];
                j++;
            }
            i++;
        }
        return (length == Integer.MAX_VALUE) ? 0 : length;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();

        System.out.println(greaterThanX(arr, x));
    }
 }