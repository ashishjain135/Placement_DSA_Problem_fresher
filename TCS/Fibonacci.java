/**
 * Fibonacci Series
 * 
 * fib(n) = fib(n-1) + fib(n-2);
 */
import java.util.*;

public class Fibonacci {
    public static int fib(int n){
        if(n == 1){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        int a = fib(n-1);
        int b = fib(n-2);
        return a+b;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fib(n));
    }    
}
