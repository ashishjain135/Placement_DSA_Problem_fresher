/**
 * Q14. The Royal Cake Division Strategy
Geek the Noble is hosting a celebration. He has a cake made of N consecutive chunks, each chunk
having a sweetness value.
He has K friends.
He must:
• Cut the cake into K + 1 contiguous pieces.
• Give one piece to each friend.
• Keep the piece with the minimum total sweetness for himself.
Being strategic, Geek wants to maximize his own sweetness.
Your task:
Determine the maximum sweetness Geek can secure for himself under optimal division.
Constraints:
1 ≤ N ≤ 10^5
0 ≤ K < N
1 ≤ sweetness[i] ≤ 10^9
Expected Time Complexity:
O(N log M), where M is total sweetness sum.
Test Case 1
Input:
sweetness = [6, 3, 2, 8, 7, 5]
K = 2
Output:
9
Test Case 2
Input:
sweetness = [1, 2, 4, 7, 3, 6, 9]
K = 3
Output:
7
 * 
 */
import java.util.*;
public class CakeDevide {
    public static boolean canDivide(int []arr, int k, int maxSweet){
        int n = arr.length;
        int count  = 0;
        int curr = 0;
        for(int i  = 0; i<n; i++){
            curr += arr[i];
            if(curr >= maxSweet){
                count++;
                curr = 0;
            }
        }
        return count >= k +1;
    }
    public static int solve(int []arr, int k){
        int n = arr.length;
        int sum = 0;
        for(int num : arr) sum += num;
        
        int low = 1;
        int high = sum;
        int ans = 0;
        while(low<=high){
            int mid = low + (high - low)/2; 
            if(canDivide(arr, k, mid)){
                ans = mid;
                low = mid +1 ;
            }else{
                high = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(solve(arr, k));
    }
}
