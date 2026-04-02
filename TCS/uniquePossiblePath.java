
/**
 * Given an matrix of size m x n, the task is to find the count of all unique possible paths from top left to the bottom right with the constraints that from each cell we can either move only to the right or down.
 *
 *  *Input:
 *
 *  *m = 2, n = 2
 * Output: 2
 * Explanation: There are two paths
 * (0, 0) -> (0, 1) -> (1, 1)
 * (0, 0) -> (1, 0) -> (1, 1)
 */
import java.util.*;

public class uniquePossiblePath {

    public static int findTotalPossible(int m, int n) {
        int dp[][] = new int[m][n];
        //first row and column fill 1
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int j = 0; j < m; j++) {
            dp[j][0] = 1;
        }

        //fill other remain
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = dp[i - 1][j] + dp[j - 1][i];
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(findTotalPossible(m, n));
    }
}
