/**
 * Aggressive cows problem is a common algorithmic problem that can be solved using binary search. The problem is as follows:
 * Given k cows & n stalls, find the largest minimum distance between the cows when they are placed in the stalls.
 * Test Cases:
 * arr[] = {1, 2, 4, 8, 9};
 * k = 3
 * output: 3 (Place cows at positions 1, 4, and 8 to achieve a minimum distance of 3 between them)
 */

public class AggresiveCows {
    public static boolean isPossible(int arr[], int cows, int minDist){
        int count = 1;
        int lastPos = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] - lastPos >= minDist){
                count++;
                lastPos = arr[i];
            }
            if(count == cows){
                return true;
            }
        }
        return false;
    }
    public static int CowsArrgesive(int arr[], int cows){
        // Arrays.sort(arr);
        int low = 1;
        int high = arr[arr.length-1] - arr[0];
        while(low < high){
            int mid = low + (high - low)/2;
            if(isPossible(arr, cows, mid)){
                low = mid + 1;//
            } else {
                high = mid;
            }
        }
        return low - 1;
    }

    public static void main(String[]args){
        // int arr[] = {1,2,4,8,9};
        int arr[] = {1,2,3,4,5};
        int cows = 3;
        System.out.println(CowsArrgesive(arr, cows));
    }
}
