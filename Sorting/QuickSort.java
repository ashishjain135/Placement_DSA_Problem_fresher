/**
 * sort an array using quick sort algorithm
 * Input arr[] = [10, 7, 8, 9, 1, 5]
 * Output = [1, 5, 7, 8, 9, 10]
 */
import java.util.*;

public class QuickSort {
    public static int partition(int [] arr, int s, int e){
        int pivot = arr[e];
        int i = s; 
        int j = s;
        while(j<=e){
            if(arr[j] >= arr[e]){
                j++;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
        //last pivot shifting 
        int temp = arr[i];
        arr[i] = arr[e];
        arr[e] = temp;
        return i;
    }
    public static void quickSort(int[]arr, int s, int e){
        if(s>e) return;
        int pivot = partition(arr, s, e); 
        quickSort(arr, s, pivot -1);
        quickSort(arr, pivot+1, e);
    }
    public static int[] solve(int []arr){
        int n = arr.length;
        quickSort(arr, 0, n-1);
        return arr;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr[] = {3, 6, 14, 11, 8, 27, 31, 23, 18};
        System.out.println("Your input arr is "+ Arrays.toString(arr));
        int [] result = solve(arr);
        System.out.println("arr after sorting "+ Arrays.toString(arr));
        //quick sort in inplace sorting algorithm
        System.out.println("result array "+Arrays.toString(result)); 
    }
}
