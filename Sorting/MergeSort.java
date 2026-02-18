/**
 * Sort the Array using merge Sort
 * input arr[] = [10,3,1,5,4]
 * output = [1,3,4,5,10]
 * also print the inversion count
 * 
 */
public class MergeSort {
    public static int mergeSortedArray(int[]arr, int left, int right){
        if(left >= right) return 0;
        int count = 0;
        int mid = (left+right)/2;
        count += mergeSortedArray(arr, left, mid);
        count += mergeSortedArray(arr, mid+1, right);

        //merge sorted Array
        count += merge(arr, left, mid, right);

        return count;

    }
    public static int merge(int []arr, int left, int mid, int right){
        int count = 0;
        int [] newArr = new int[right - left +1];
        int l = left, m = mid+1, k = 0;
        while(l <= mid && m <= right){
            if(arr[l] <= arr[m]){
                newArr[k++] = arr[l++];
            }else{
                newArr[k++] = arr[m++];
                count += (mid - l + 1);
            }
        }
        while(l <= mid){
            newArr[k++] = arr[l++];
        }
        while(m <= right){
            newArr[k++] = newArr[m++];
        }
        //copy in original Array
        for(int i = 0; i<newArr.length; i++){
            arr[left+i] = newArr[i];
        }
        return count;
    }


    public static void main(String[]agrs){
        int arr [] = {5, 3, 1, 4, 2};
        System.out.println("Inversion count in array "+mergeSortedArray(arr, 0, arr.length-1));
        System.out.println("Array after sorting");
        // for(int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i]+ " ");
        // }
        System.out.println(java.util.Arrays.toString(arr));
    }
}
