/**
 * Equilibrium Index

Example:

Input
5
1 3 5 2 2

Output

2

Explanation:

1 + 3 = 2 + 2

Index = 2
 */

import java.util.*;
public class EquilibriumIndex {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr  = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }


        // System.out.println(Arrays.toString(arr)+);
        //make prefix array
        int []prefix = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i<n; i++){
            prefix[i] = arr[i] + prefix[i-1];
        }
        int []suffix = new int[n];
        suffix[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            suffix[i] = arr[i] + suffix[i+1];
        }

        //now matach equa
        for(int i = 0; i<n; i++){
            if(prefix[i] == suffix[i]){
                System.out.println(i);
                // return;
            }
        }
    }
}
