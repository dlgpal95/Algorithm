package Algo20200429;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesfromSortedArray {
	class Solution {
		public int removeDuplicates(int[] nums) {

			Map<String, String> map = new HashMap<String, String>();
			int[] newNums = nums;
			int i = 0;

			for (int val : newNums) {
				if (!map.containsKey(val + "")) {
					map.put(val + "", val + "");
					nums[i] = val;
					i++;
				}
			}

			return map.size();

		}
	}
}
