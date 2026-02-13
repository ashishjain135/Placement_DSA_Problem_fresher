/**
 * Push Empty packet to the End of the Arrays
 * 
 * Problem:
 * given an array to interger values all empty packets (represent by 0 ) and push them to the end of the array
 * 
 * Test case
 * Input : arr[] = [2,0,3,0,5]
 * Output: [2,3,5,0,0]
 */
public class PushEmptyPacket {
    public static void main(String[]args){
        int arr[]  = {2,0,3,0,5};
        int n = arr.length;
        int j = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] != 0){
                arr[j++] = arr[i];
            }
        }
        while(j<n){
            arr[j++] = 0;
        }
        for(int i = 0; i<n; i++){
            System.err.print(arr[i] + " ");
        }
    }
}
