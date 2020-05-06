package Algo20200506;

public class PlusOne {
	class Solution {
		public int[] plusOne(int[] digits) {

			int sum = digits[digits.length - 1] + 1;
			int i = digits.length - 1;

			while (true) {

				if (sum == 10) {

					if (i == 0) {
						int[] newdigi = new int[digits.length + 1];

						for (int j = 2; j < digits.length; j++) {
							newdigi[j] = digits[j - 1];
						}
						newdigi[1] = 0;
						newdigi[0] = 1;
						return newdigi;
					}

					digits[i] = 0;
					sum = digits[i - 1] + 1;
					i--;
				} else {
					digits[i] = sum;
					break;
				}
			}

			return digits;
		}
	}
}
