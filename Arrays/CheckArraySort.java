/**
 * Check if an array is sorted or not
 * 
 * problem : Detarmine if a given array is sorted in non decresing order 
 * 
 * Test case
 * Input;
 * 
 * arr[] = [1,2,3,4]
 * output false
 * 
 * arr[3,4,5,2]
 * output false
 */
import java.util.*;
public class CheckArraySort {
    public static boolean isSorted(int[]nums){
        int n = nums.length;
        for(int i = 1; i<n; i++){
            if(nums[i] < nums[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(isSorted(arr));
    }
}
