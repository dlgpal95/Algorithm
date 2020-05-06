package Algo20200506;

public class LengthofLastWord {
	class Solution {
		public int lengthOfLastWord(String s) {
			String[] sp = s.split(" ");

			if (sp.length == 0) {
				return 0;
			}
			return sp[sp.length - 1].length();
		}
	}
}
