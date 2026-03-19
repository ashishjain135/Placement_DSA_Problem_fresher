
/**
 * Q11. The Frequency Reconstruction Grid
 * A corrupted database stores integers between 1 and p.
 * You are given:
 * • n (size for counting range 1 to n)
 * • arr[]
 * • p (upper possible bound of values)
 * You must modify arr[] in-place such that:
 * arr[i] becomes the frequency of integer (i+1).
 * Ignore values greater than n.
 * Test Cases
 * Input: n=5, arr=[2,3,2,3,5], p=5
 * Output: [0,2,2,0,1]
 * Input: n=4, arr=[3,3,3,3], p=3
 * Output: [0,0,4,0]
 * Input: n=6, arr=[1,2,3,4,5,6], p=6
 * Output: [1,1,1,1,1,1]
 * Input: n=3, arr=[4,5,6], p=6
 * Output: [0,0,0]
 * Input: n=7, arr=[1,1,2,8,2,3,10], p=10
 * Output: [2,2,1,0,0,0,0]
 *
 *
 *
 */
import java.util.*;

public class FreqReconstruction {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();

        }
        int p = scn.nextInt();
        int magic = p + 1; // P se bada koi bhi number

        for (int i = 0; i < n; i++) {
            // Purani value nikalne ke liye % magic karo
            int originalVal = arr[i] % magic;

            // Agar value range (1 to n) mein hai, toh uske index par magic value add karo
            if (originalVal >= 1 && originalVal <= n) {
                arr[originalVal - 1] += magic;
            }
        }

        // Ab sirf frequency nikalne ke liye magic se divide kar do
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / magic;
        }
        System.out.println(Arrays.toString(arr));
    }
}
