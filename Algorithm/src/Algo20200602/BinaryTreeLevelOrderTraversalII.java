package Algo20200602;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {

		List<List<Integer>> resultList = new ArrayList<List<Integer>>();

		public List<List<Integer>> levelOrderBottom(TreeNode root) {

			if (root == null) {
				return resultList;
			}
			List<Integer> addList333 = new ArrayList<Integer>();
			addList333.add(root.val);
			resultList.add(addList333);

			List<TreeNode> initList = new ArrayList<TreeNode>();
			initList.add(root);

			addLevel(initList, root);
			Collections.reverse(resultList);
			return resultList;
		}

		public List<Integer> addLevel(List<TreeNode> initList, TreeNode root) {
			List<Integer> addList = new ArrayList<Integer>();
			List<TreeNode> addList2 = new ArrayList<TreeNode>();

			for (TreeNode check : initList) {
				if (check.left != null) {
					addList.add(check.left.val);
					addList2.add(check.left);
				}
				if (check.right != null) {
					addList.add(check.right.val);
					addList2.add(check.right);
				}
			}

			if (addList2.size() == 0) {
				return addList;
			}
			resultList.add(addList);
			return addLevel(addList2, root);
		}
	}
	// =========================================== DFS solution:

	public class Solution2 {
		public List<List<Integer>> levelOrderBottom(TreeNode root) {
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

			if (root == null)
				return wrapList;

			queue.offer(root);
			while (!queue.isEmpty()) {
				int levelNum = queue.size();
				List<Integer> subList = new LinkedList<Integer>();
				for (int i = 0; i < levelNum; i++) {
					if (queue.peek().left != null)
						queue.offer(queue.peek().left);
					if (queue.peek().right != null)
						queue.offer(queue.peek().right);
					subList.add(queue.poll().val);
				}
				wrapList.add(0, subList);
			}
			return wrapList;
		}
	}
	// =========================================== BFS solution:

	public class Solution3 {
		public List<List<Integer>> levelOrderBottom(TreeNode root) {
			List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
			levelMaker(wrapList, root, 0);
			return wrapList;
		}

		public void levelMaker(List<List<Integer>> list, TreeNode root, int level) {
			if (root == null)
				return;
			if (level >= list.size()) {
				list.add(0, new LinkedList<Integer>());
			}
			levelMaker(list, root.left, level + 1);
			levelMaker(list, root.right, level + 1);
			list.get(list.size() - level - 1).add(root.val);
		}
	}
}
