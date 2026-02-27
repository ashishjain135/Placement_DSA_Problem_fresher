/**
 * Add an Element to an Array
 * Problem: Add a new element to the end of an array.
 * Test Case:
 * Input: arr = [1, 2, 3], element = 4
 * Output: [1, 2, 3, 4]
 */
import java.util.*;
public class AddEleLast {
    public static void main(String[]args){
        int arr[] = {1,2,3};
        int ele = 4;
        int newArr[] = new int[arr.length+1];
        for(int i  =0; i<arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = ele;
        System.out.println("New Array: " + Arrays.toString(newArr));
    }
}
