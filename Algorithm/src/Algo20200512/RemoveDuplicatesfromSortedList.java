package Algo20200512;

public class RemoveDuplicatesfromSortedList {
	class Solution {
		public ListNode deleteDuplicates(ListNode head) {
			ListNode current = head;
			while (current != null && current.next != null) {
				if (current.next.val == current.val) {
					current.next = current.next.next;
				} else {
					current = current.next;
				}
			}
			return head;
		}
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
