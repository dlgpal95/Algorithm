package Algo20200508;

public class AddBinary {
	class Solution {
		public String addBinary(String a, String b) {
			int anum = Integer.parseInt(a);
			int bnum = Integer.parseInt(b);

			int sum = anum + bnum;

			String[] sp = Integer.toString(sum).split("");

			StringBuilder sb = new StringBuilder();

			int plus = 0;

			for (int i = sp.length - 1; i > -1; i--) {

				if (Integer.parseInt(sp[i]) + plus - 2 >= 0) {
					sb.append(Integer.parseInt(sp[i]) + plus - 2);
					plus = 1;
				} else {
					if (i != 0) {
						sb.append(Integer.parseInt(sp[i]) + 1);
						plus = 0;
					}

				}

			}

			if (plus == 1) {
				sb.append(1);
			}

			String reversed = sb.reverse().toString();
			return reversed;
		}
	}
}
