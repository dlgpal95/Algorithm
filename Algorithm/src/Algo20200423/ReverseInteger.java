package Algo20200423;

import java.util.Arrays;
import java.util.Collections;

public class ReverseInteger {

	class Solution {
		public int reverse(int x) {

			String[] result = Integer.toString(x).split("");
			String s = "";

			if (result[0].equals("-")) {
				s += "-";
				result[0] = "";
			}

			Collections.reverse(Arrays.asList(result));

			for (String val : result) {
				s += val;
			}
			double d = Double.parseDouble(s);

			return d >= 2147483647 || d <= -2147483647 ? 0 : Integer.parseInt(s);

		}
	}

}
