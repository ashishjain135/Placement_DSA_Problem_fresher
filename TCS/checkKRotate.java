/**
 * Q1. The Chrono-Locked Conveyor Belt
 * In an ancient mechanical city, a circular conveyor belt transports
 * crystalline energy cores in a strictly
 * non-decreasing sequence of stability levels. The belt was originally
 * calibrated in sorted order to
 * prevent resonance collapse.
 * However, during a maintenance cycle, the system was restarted from an
 * arbitrary position on the
 * belt. As a result, the visible sequence now appears rotated, though it must
 * still preserve the integrity
 * of the original sorted structure.
 * The engineers suspect that:
 * • The belt was originally arranged in non-decreasing order.
 * • It may have been rotated any number of positions (including zero).
 * • Duplicate stability levels are allowed.
 * • If the belt does not conform to such a rotated sorted configuration, the
 * stabilization chamber
 * will fail.
 * Your task is to determine whether the currently observed sequence could
 * represent a valid rotation
 * of a non-decreasing sorted array.
 * Return true if valid. Otherwise, return false.
 * Test Cases
 * Input: [5,6,7,1,2,3,4]
 * Output: true
 * Input: [2,2,2,3,1,2]
 * Output: true
 * Input: [1,3,2,4]
 * Output: false
 * Input: [10,10,10]
 * Output: true
 * Input: [4,5,1,2,6]
 * Output: false
 * 
 */

 import java.util.*;
public class checkKRotate {
    public static boolean checkArray(int arr[], int n){
        int count = 0;
        for(int i = 0; i<n-2; i++){
            if(arr[i] >= arr[i+1]){
                count++;
            }
        }
        //check first and last
        if(arr[n-1] > arr[0]){
            count++;
        }
        if(count > 1){
            return false;
        }
        return true;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        if(checkArray(arr, n)){
            System.out.println("True");
        }else{
            System.out.println("false");
        }

    }
}