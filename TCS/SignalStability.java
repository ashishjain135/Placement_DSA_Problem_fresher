/**
 * Q6. The Signal Stability Analyzer
In a deep-space transmission relay, binary signals are streamed continuously.
• 1 represents a stable signal pulse.
• 0 represents a disruption caused by cosmic interference.
The stability of a transmission session is measured by the longest uninterrupted chain of stable
pulses.
Your task is to determine the maximum number of consecutive 1s in the signal log.
Test Cases
Input: [1,1,0,1,1,1,0,1]
Output: 3
Input: [0,0,0,0]
Output: 0
Input: [1,1,1,1,1]
Output: 5
Input: [1,0,1,1,0,1,1,1,1,0,1]
Output: 4
Input: [0,1,1,0,1,1,1,0,1,1]
Output: 3
 * 
 */

public class SignalStability{
    public static int maxContinue(int[]arr, int n){

        int len = 0;
        int curr = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == 1){
                curr++;
            }else{
                len = Math.max(curr, len);
                curr =  0;
            }
        }
        return len;
    }
    public static void main(String[]args){
        int []arr = {1,0,1,1,0,1,1,1,1,0,1};
        int n = arr.length;
        System.out.println(maxContinue(arr, n));
    }
}