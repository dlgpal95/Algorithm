package Algo20200522;

public class MergeSortedArray {
	class Solution {
		public void merge(int[] nums1, int m, int[] nums2, int n) {

			int[] result = new int[nums1.length];

			int j = 0;
			int index = 0;
			int i = 0;

			if (nums1.length < 1 || m == 0) {
				for (int a = 0; a < result.length; a++) {

					nums1[index] = nums2[a];
					index++;
				}
				return;
			} else if (nums2.length < 1 || n == 0) {
				for (int b = 0; b < result.length; b++) {

					result[index] = nums1[b];
					index++;

				}
				for (int x = 0; x < result.length; x++) {
					nums1[x] = result[x];
				}
				return;
			}

			while (true) {

				if (nums1[i] <= nums2[j]) {
					result[index] = nums1[i];
					index++;
					i++;
				} else {
					result[index] = nums2[j];
					index++;
					j++;
				}

				if (i == m) {
					break;
				} else if (j == n) {
					break;
				}
			}

			if (j <= nums2.length - 1) {
				for (int k = j; k < n; k++) {
					result[index] = nums2[k];
					index++;
				}
			} else if (i <= nums1.length - 1) {
				for (int k = i; k < m; k++) {
					result[index] = nums1[k];
					index++;
				}
			}

			for (int x = 0; x < result.length; x++) {
				nums1[x] = result[x];
			}
		}
	}

	// =======================best=================//
	class Solution2 {
		public void merge(int[] nums1, int m, int[] nums2, int n) {
			int i = m - 1, j = n - 1, pos1 = m + n - 1;
			while (j >= 0)
				nums1[pos1--] = (i < 0 || nums2[j] >= nums1[i]) ? nums2[j--] : nums1[i--];
		}
	}
}
