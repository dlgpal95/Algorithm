package Algo20200429;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
	class Solution {
		public int removeElement(int[] nums, int val) {
			List<Integer> arrayList = new ArrayList<>();

			for (int n : nums) {

				if (n != val) {
					arrayList.add(n);
				}
			}
			// nums = arrayList.toArray(new Integer[arrayList.size()]);

			int size = 0;

			for (int temp : arrayList) {
				nums[size++] = temp;
			}

			return arrayList.size();
		}
	}

//=============================================
	public class Solution2 {
		public int removeElement(int[] nums, int val) {
			int i = 0;
			for (int n : nums)
				if (n != val)
					nums[i++] = n;
			return i;
		}
	}
//=============================================
}
