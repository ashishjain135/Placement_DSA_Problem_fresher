/**
 * You are given an array of integers. Sort the array in increasing order based on the number of factors of each integer. If there are multiple integers with the same number of factors, sort them in increasing order.
 * 
 * Input arr[] = [10, 3, 1, 5, 4]
 * Output = [1, 3, 4, 5, 10]
 */

import java.util.*;


public class BasedOnFactorCount {
    public static int countFactors(int n){
        int count = 0;
        for(int i = 1; i*i<=n; i++){
            if(n % i  == 0){
                if(i* i == n){
                    count ++;
                }else{
                    count += 2;
                }
            }
        }
        return count;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println("your Arrays is before Sorting "+ Arrays.toString(arr));

        //convert to Integer Array
        Integer[]arrInt = new Integer[n];
        for(int i = 0; i<n; i++){
            arrInt[i] = arr[i];
        }

        Arrays.sort(arrInt, (a, b) -> {
            int fa = countFactors(a);
            int fb = countFactors(b);
            if(fa == fb){ //if both have same factor count then sort based on value
                return a - b;
            }else{
                return fa - fb;
            }
        });
        for(int i = 0; i<n; i++){
            arr[i] = arrInt[i];
        }
        System.out.println("Array after sorting based on factor count: " +Arrays.toString(arr));
    }    
}
