/**
 * Sort Array Based on Risk Levels
 * Problem -: Given an array of Risk levels (integers ranging from 0 to 2 sort the array based on these risk levels)
 * 
 * Test cases 
 * Input : 
 * risklevels [] = [2,0,1,2 ,0,1]
 * output 
 * [0, 0, 1, 1, 2, 2]
 * 
 * this problem based on Dutch National flag problem 
 * 0 → low-1     = all 0s
*  low → mid-1   = all 1s
*  mid → high    = unknown
*  high+1 → end  = all 2s
 */

public class Sort012 {
    public static void main(String[]args){
        int arr[] = {2, 1, 0, 2, 0, 1};
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(arr[mid] == 0){
                //swap mid & low
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }else{
                mid++;
            }
        }
        for(int i = 0; i<n; i++){
            System.err.print(arr[i]+ " ");
        }
    }
}
