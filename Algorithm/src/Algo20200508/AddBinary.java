package Algo20200508;

public class AddBinary {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.addBinary("1110110101", "1110111011"));
	}

	static class Solution {
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

					if (Integer.parseInt(sp[i]) + plus == 0) {
						sb.append(Integer.parseInt(sp[i]));
					} else {
						sb.append(Integer.parseInt("1"));
					}

					plus = 0;
				}

			}

			if (plus == 1) {
				sb.append(1);
			}

			String reversed = sb.reverse().toString();
			return reversed;
		}

	}

//=============Integer Max값 생각하기.!!!!!!!!!!!! 처음부터 안되는 코드 ^^^^^^^^^^=================//
	
	public class Solution2 {
		public String addBinary(String a, String b) {
			StringBuilder sb = new StringBuilder();
			int i = a.length() - 1, j = b.length() - 1, carry = 0;
			while (i >= 0 || j >= 0) {
				int sum = carry;
				if (j >= 0)
					sum += b.charAt(j--) - '0';
				if (i >= 0)
					sum += a.charAt(i--) - '0';
				sb.append(sum % 2);
				carry = sum / 2;
			}
			if (carry != 0)
				sb.append(carry);
			return sb.reverse().toString();
		}
	}
}
