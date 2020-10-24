package NewProjectsArrays;

/* Given an array of integers A sorted in non-decreasing order,
return an array of the squares of each number, also in sorted non-decreasing order.

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]


Note:

1. <= A.length <= 10000
2. -10000 <= A[i] <= 10000
3. A is sorted in non-decreasing order. */

import java.util.Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquare(int[] A){
        int N = A.length;
        int[] ans = new int[N];

        for (int i =0; i < N; ++i){
            ans[i] = A[i] * A[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}
