package Algo20200506;

public class MaximumSubarray {
	class Solution {
		public int maxSubArray(int[] nums) {

			int maxNum = nums[0];

			for (int j = 0; j < nums.length; j++) {
				maxNum = maxN(maxNum, j, nums);
			}

			return maxNum;
		}

		public int maxN(int maxNum, int index, int[] nums) {

			int maxSum = nums[index];

			if (maxNum < maxSum) {
				maxNum = maxSum;
			}

			for (int i = index; i < nums.length; i++) {

				if (i + 1 != nums.length) {

					maxSum = maxSum + nums[i + 1];
				}

				if (maxNum < maxSum) {
					maxNum = maxSum;
				}

			}

			return maxNum;
		}
	}
	//===================================================================================================
	class Solution2 {
	    public int maxSubArray(int[] A) {
	        if (A == null || A.length == 0) {
	            throw new IllegalArgumentException();
	        }
	        int maxEndingHere = A[0];
	        int maxSum = A[0];
	        for (int i = 1; i < A.length; i++) {
	            maxEndingHere = Math.max(maxEndingHere + A[i], A[i]);
	            maxSum = Math.max(maxSum, maxEndingHere);
	        }
	        return maxSum;
	    }
	}
	//===================================================================================================
}
