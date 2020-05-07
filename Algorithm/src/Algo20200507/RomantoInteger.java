package Algo20200507;

import java.util.HashMap;

public class RomantoInteger {
	class Solution {
		public int romanToInt(String s) {
			HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			hm.put('I', 1);
			hm.put('V', 5);
			hm.put('X', 10);
			hm.put('L', 50);
			hm.put('C', 100);
			hm.put('D', 500);
			hm.put('M', 1000);

			int sum = hm.get(s.charAt(0));

			for (int i = 1; i < s.length(); i++) {

				int cur = hm.get(s.charAt(i));
				int pre = hm.get(s.charAt(i - 1));

				sum += cur;

				if (pre < cur) {
					sum -= pre * 2;
				}
			}
			return sum;

		}
	}
}
