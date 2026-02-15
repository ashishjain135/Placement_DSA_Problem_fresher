/**
 * Chocolate Distribution Problem
 * Given an array arr[] of positive integers, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets among m students such that -
      i. Each student gets exactly one packet.
     ii. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum and return that minimum possible difference.

Examples:

Input: arr = [3, 4, 1, 9, 56, 7, 9, 12], m = 5
Output: 6
Explanation: The minimum difference between maximum chocolates and minimum chocolates is 9 - 3 = 6 by choosing following m packets :[3, 4, 9, 7, 9].
Input: arr = [7, 3, 2, 4, 9, 12, 56], m = 3
Output: 2
Explanation: The minimum difference between maximum chocolates and minimum chocolates is 4 - 2 = 2 by choosing following m packets :[3, 2, 4].

 */


import java.util.*;

public class chocolate {
    //sliding window appraoch 
    public static int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int n = arr.size();
        int mini = Integer.MAX_VALUE;
        int maxi = 0;
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i<m; i++){
            mini = Math.min(mini, arr.get(i));
            maxi = Math.max(maxi, arr.get(i));
        }
        diff = Math.min(diff, maxi - mini);
        int i = m;
        int j = 1;
        while(i<n){
            diff = Math.min(diff, arr.get(i) - arr.get(j));
            i++;
            j++;
        }
        return diff;
    }
    public static void main(String[]args){
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(4);
        arr.add(4);
        arr.add(1);
        arr.add(9);
        arr.add(56);
        arr.add(7);
        arr.add(9);
        arr.add(12);
        arr.add(69);
        int m = 5;
        // System.out.print(findMinDiff(arr, m));


        //simple two pointer 
        Collections.sort(arr);
        int n = arr.size();
        int i = 0; 
        int j = m-1;
        int diff = Integer.MAX_VALUE;
        while(j<n){
            diff = Math.min(diff, arr.get(j) - arr.get(i));
            i++;
            j++;
        }
        System.out.println(diff);
    }
}
