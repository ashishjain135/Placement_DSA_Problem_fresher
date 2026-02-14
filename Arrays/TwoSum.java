/**
 * Two Sum
 * Find two numbers in an array that add up to a specific target
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 * 
 * test case:
 * Input 
 * nums[] = [2,7,11,15]
 * target = 9
 * 
 * Output 
 * [0,1];
 * 
 * Approach 
 * we use hashMap for storing index or value
 * check target - nums[i] if exist in hashmap so return 
 */

import java.util.*;
public class TwoSum {
    public static void main(String[]args){
        int nums[] = {2,7,11, 15};
        int target = 9;
        int n = nums.length;
        int arr[] = new int[2];
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i = 0; i<n; i++){
            int ans = target - nums[i];
            if(map.containsKey(ans)){
                arr[0] = map.get(ans);
                arr[1] = i;
            }else{
                map.put(nums[i], i);

            }
        }
      for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
      }
    }
}
