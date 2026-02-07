/**
 * Most famous off campus placement DSA question 
 * 
 * Find the total Number of SubArrays with given Sum
 * 
 * Problem ->> Given an array of intergers and an integer sum, return the total number of subarrays whose sum equal sum;
 * 
 * Test case 
 * input 
 * nums = [1,2,3,1,1,1]
 * output -> 3
 */

import java.util.*;

public class SubArraySumEqualK {
    public static int subArraysEqualTok(int [] arr, int k){
        int n = arr.length;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int psum = 0;
        for(int i = 0; i<n; i++){
            psum += arr[i];
            //if k - psum exit in array or not 
            if(map.containsKey(psum - k)){
                count += map.get(psum-k);
            }
            //also update freq of psum - k;
            map.put(psum, map.getOrDefault(psum, 0) +1);
        }

        return count;
    }

    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        // System.out.println("Your array length is, " + n);
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt(); 

        System.out.println(subArraysEqualTok(arr, k));
    }
}
