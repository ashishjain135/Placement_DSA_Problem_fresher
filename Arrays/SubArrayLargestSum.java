/**
 * Find SubArray With the Largest Sum 
 * Problem : Given an interger Array nums, find the subarray with the largest sum and return its sum
 * Test Cases : 
 * Input ->. 
 * nums= [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 * 
 * output :
 * 6 
 * 
 * 
 * This is a classic subArray sum problem and 
 * we used brute force approach but TC O(N^2)
 * so we need optimize appraoch Kadane's Algorithm
 */

public class SubArrayLargestSum {
    public static void main(String[]args){
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;

        int sum = arr[0];
        int ans = arr[0];
        for(int i = 1; i<n; i++){
            if(sum < 0) sum = 0;
            sum += arr[i];
            
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
    }    
}
