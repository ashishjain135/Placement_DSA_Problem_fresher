/*

Question 2 (15 marks)

Write a Java program to accept 5 integers from the user and calculate the sum of all
odd numbers among them.
Print the resulting sum.

 */

import java.util.*;

public class oddNumberSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddSum = 0;
        try {
            for (int i = 0; i < 5; i++) {
                int num = sc.nextInt();
                if (num % 2 != 0) {
                    oddSum += num;
                }
            }
            System.out.print(oddSum);
        } catch (InputMismatchException e) {
            System.out.print("Invalid input");
        } finally {
            sc.close();
        }
    }
}
