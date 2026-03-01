/**
 * Painter's Partition Problem
 * Problem Statement:
 * find the minimum time in which k worker for an n given task can complete all the task. Each worker can only do contiguous segments of the task, and each task takes 1 unit of time to complete.
 * Test Cases:
 * arr[] = {3,5,1,7,8,2, 5,3,10, 1,4,7,5,4,6};
 * k = 3
 * Output: 15
 */

public class PainterPartitions {
    public static int painterRequired(int arr[], int n, int k){
        int low = 0;
        int high = 0;
        for(int i = 0; i<n; i++){
            high += arr[i];
            low = Math.max(low, arr[i]);
        }
        while(low < high){
            int mid = low + (high - low)/2;
            if(isPossible(arr, n, k, mid)){
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static boolean isPossible(int arr[], int n, int k, int maxTime){
        int painters = 1;
        int time = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] > maxTime){
                return false;
            }
            if(time + arr[i] > maxTime){
                painters++;
                time = arr[i];
            } else {
                time += arr[i];
            }
        }
        return painters <= k;
    }
    public static void main(String[]args){
        int arr[] = {3,5,1,7,8,2, 5,3,10, 1,4,7,5,4,6};
        int k = 3;
        int n = arr.length;
        System.out.println("Minimum time to complete all task:" + painterRequired(arr, n, k));
    }
}
