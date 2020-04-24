package Algo20200423;

public class isPalindrome {

	class Solution {
		public boolean isPalindrome(int x) {

			String[] result = Integer.toString(x).split("");

			if (result[0].equals("-") || (result[result.length - 1].equals("0") && result.length != 1)) {
				return false;
			} else {

				for (int i = 0; i < result.length - 1; i++) {

					if (!result[i].equals(result[result.length - 1 - i])) {
						return false;
					}
				}

				return true;
			}

		}
	}

}
