package Algo20200428;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	class Solution {
		public boolean isValid(String s) {
			Stack<Character> stack = new Stack<Character>();
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == '(' || c == '[' || c == '{') {
					stack.add(c);
				} else if (c == ')') {
					if (stack.size() == 0 || stack.pop() != '(') {
						return false;
					}
				} else if (c == ']') {
					if (stack.size() == 0 || stack.pop() != '[') {
						return false;
					}
				} else if (c == '}') {
					if (stack.size() == 0 || stack.pop() != '{') {
						return false;
					}
				} else {
					continue;
				}
			}
			if (stack.size() == 0) {
				return true;
			} else {
				return false;
			}

		}

		// =======================================================================================//
		public boolean isValid2(String str) {
			if (str == null || str.length() == 0)
				return true;
			Map<Character, Character> map = new HashMap<>();
			Stack stack = new Stack<>();
			map.put('(', ')');
			map.put('{', '}');
			map.put('[', ']');

			for (int i = 0; i < str.length(); i++) {
				final char c = str.charAt(i);

				if (map.containsKey(c)) {
					stack.add(c);
				} else if (stack.size() == 0 || map.get(stack.pop()) != c) {
					return false;
				}
			}
			return stack.size() == 0;
		}
		// =======================================================================================//
	}
}
