package Question2;

/*Given a **circular integer array** `nums` of length `n`, return *the maximum possible sum of a 
 * non-empty subarray of* `nums`.
A **circular array** means the end of the array connects to the beginning of the array. Formally, 
the next element of `nums[i]` is `nums[(i + 1) % n]` and the previous element of `nums[i]` is 
`nums[(i - 1 + n) % n]`. A subarray may only include each element of the fixed buffer `nums` at 
most once. Formally, for a subarray `nums[i], nums[i + 1], ..., nums[j]`, there does not exist 
`i <= k1`, `k2 <= j` with `k1 % n == k2 % n`.*/

import java.util.Queue;
import java.util.LinkedList;

public class Que2 {
	public static int maxSumSubArray(int[] numb) {
	       int totalSum = 0, sumMax = numb[0], curMax = 0, curMin = 0, sumMin = numb[0];
	        for(int i: numb){
	           curMax = Math.max(curMax + i, i);
	           sumMax = Math.max(curMax, sumMax);
	           curMin = Math.min(curMin + i, i);
	           sumMin = Math.min(curMin, sumMin);
	           totalSum += i;
	        }
	    return sumMax > 0 ? Math.max(sumMax, totalSum - sumMin) : sumMax;
}
	public static void main(String[] args) {
		int arr[]= {1,-2,3,-2};
		System.out.println(maxSumSubArray(arr));
	}
}