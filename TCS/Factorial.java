//factorial of any number 

import java.util.*;


public class Factorial{
    public static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int ans = 1;
        ans = n * factorial(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       System.out.println(factorial(n));
        
    }

}