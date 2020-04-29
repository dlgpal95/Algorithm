package Algo20200429;

import java.util.Arrays;

public class SearchInsertPosition {
	class Solution {
		public int searchInsert(int[] nums, int target) {

			for (int i = 0; i < nums.length; i++) {
				if (target == nums[i]) {
					return i;
				}
			}

			for (int i = 0; i < nums.length; i++) {
				if (target < nums[i]) {
					return i;
				}
			}

			return nums.length;
		}
	}
	
	//===========================================
	class Solution2 {
	    public int searchInsert(int[] nums, int target) {
		
	        int x = Arrays.binarySearch(nums, target);
	    	//원하는 타겟이 딱 맞게 존재하는 경우에는 양수가 반환되는데 정확히 같은 값이 아니면 배열에서 자기 위치를 찾아 음수로 반환한다는 특징
	        if(x>=0) return x;
	        return -(x+1);
	    }
	}
	//===========================
}
