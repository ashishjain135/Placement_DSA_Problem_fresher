/**
 * Maximize Number of 1's
 * Difficulty: MediumAccuracy: 39.46%Submissions: 83K+Points: 4Average Time: 20m
 * 
 * Given a binary array arr[] containing only 0s and 1s and an integer k, you are allowed to flip at most k 0s to 1s. Find the maximum number of consecutive 1's that can be obtained in the array after performing the operation at most k times.
 * 
 * Examples:
 * 
 * Input: arr[] = [1, 0, 1], k = 1
 * Output: 3
 * Explanation: By flipping the zero at index 1, we get the longest subarray from index 0 to 2 containing all 1’s.
 * 
 * Input: arr[] = [1, 0, 0, 1, 0, 1, 0, 1], k = 2
 * Output: 5
 * Explanation: By flipping the zeroes at indices 4 and 6, we get the longest subarray from index 3 to 7 containing all 1’s.
 */

public class MaximizeOf1s {
    public static int maxOnes(int arr[], int k) {
        // code here
        int len = 0;
        int n = arr.length;
        int j = 0;
        int i = 0;
        while(i<n){
            if(arr[i] == 0){
                k--;
            }
            while(k<0){
                if(arr[j] == 0){
                    k++;
                }
                j++;
            }
            len = Math.max(len, i - j +1);
            i++;
        }
        return len;
    }
    public static void main(String[]args){
        int arr[] = {1, 0, 0, 1, 0, 1, 0, 1};
        int k = 2;
        System.out.println(maxOnes(arr, k));
    }
}
