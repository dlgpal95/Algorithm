package Algo20200602;

public class MaximumDepthofBinaryTree {

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

		public int maxDepth(TreeNode root) {
			int dep2 = 1;
			if (root == null)
				return 0;
			if (root.left == null && root.right == null) {
				return dep2;
			}
			return Math.max(maxDep(root.left, dep2), maxDep(root.right, dep2));
		}

		public int maxDep(TreeNode val, int dep) {

			int num = dep + 1;

			if (val == null)
				return num;

			if (val.left == null && val.right == null) {
				return num;
			}
			if (val.left != null && val.right != null) {

				return Math.max(maxDep(val.left, num), maxDep(val.right, num));
			}
			if (val.left == null && val.right != null) {

				return maxDep(val.right, num);
			}
			if (val.left != null && val.right == null) {

				return maxDep(val.left, num);
			}
			return num;
		}
	}
	
	//////======================================= 더 깔끔한 답=============================================
	class Solution2 {
	    int len = 0;
	    public void maxDepth1(TreeNode root, int level) {
	        if(root == null) {
	            if(level > len) len=level;
	            return;
	        }
	        maxDepth1(root.left, level+1);
	        maxDepth1(root.right, level+1);
	    }
	    public int maxDepth(TreeNode root) {
	        maxDepth1(root, 0);
	        return len;
	    }
	}
}
