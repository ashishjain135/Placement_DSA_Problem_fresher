/**
 * Problem Second Largest Element
 * Problem

Given an array of integers, find the second largest element in the array.

If the second largest element does not exist, print -1.

Input

First line: integer N (size of array)

Second line: N integers

Output

Print the second largest element.

Example

Input

5
10 20 4 45 99

Output

45
Explanation

Largest element = 99
Second largest = 45

Constraints

1 ≤ N ≤ 1000
 */
import java.util.*;
public class SecondLargest {
    public static void main(String[]args){
        // int arr[] = {10,20, 4, 45, 99};
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println("Your array is "+Arrays.toString(arr));
        int largest = 0;
        int secondLargest = -1;
        for(int i = 1; i<n; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
            
        }
        for(int i = 0; i<n; i++){
            if(secondLargest < arr[i] &&  arr[i] !=  largest){
                secondLargest = arr[i];
            }
        }
        System.out.print("Your second largest "+secondLargest);
    }
}
