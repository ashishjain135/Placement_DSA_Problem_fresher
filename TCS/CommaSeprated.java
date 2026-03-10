/**
 * Input 
1,2,3,4 
Theory 
Input is treated as: 
"1,2,3,4" 
Steps: 
1️⃣ Read full line 
2⃣ Split using comma , 
3️⃣ Convert to integer 
 */
import java.util.*;



public class CommaSeprated {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine();
        String[]parts = line.split(",");
        int [] arr = new int[parts.length];
        for(int i = 0; i<parts.length; i++){
            arr[i] = Integer.parseInt(parts[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
