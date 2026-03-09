/**
 * Input Format 
1 2 3 4 
Theory 
When the user enters: 
1 2 3 4 
The entire input is read as one single string. 
So steps are: 
1️⃣ Read full line 
2⃣ Split using space 
3️⃣ Convert each value to integer 
4️⃣ Store in array 
 */

import java.util.*;   // Importing Scanner and Arrays utility 
 
public class spaceSeprated { 
    public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in);  // Scanner object to read input 
 
        String line = sc.nextLine();  // Read full line input 
 
        String[] parts = line.split(" ");  // Split string using space 
 
        int[] arr = new int[parts.length];  // Create integer array 
 
        for(int i = 0; i < parts.length; i++) {  // Loop through each element 
 
            // Convert string to integer 
            arr[i] = Integer.parseInt(parts[i]); 
        } 
 
        System.out.println(Arrays.toString(arr));  // Print final array 
    } 
} 
