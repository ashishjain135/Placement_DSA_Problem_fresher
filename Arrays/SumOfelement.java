/**
 * Sum of Elements in a Given Array
 * Problem: Calculate the sum of all elements in an array.
 * Test Case:
 * Input: arr = [1, 2, 3, 4]
 * Output: 10
 */

public class SumOfelement {
    public static void main(String[]args){
        int arr[] = {1, 2, 3, 4};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
