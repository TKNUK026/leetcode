// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = null;
		ListNode prev = null;
		int carry = 0;
		while (l1 != null || l2 != null || carry != 0) {
			int sum = getValue(l1) + getValue(l2) + carry;
			ListNode current = new ListNode(sum % 10);
			if (prev == null) {
				result = current;
			} else {
				prev.next = current;
			}
			prev = current;
			carry = sum / 10;
			l1 = getNext(l1);
			l2 = getNext(l2);
		}
		return result;
	}

	int getValue(ListNode l) {
		return l != null ? l.val : 0;
	}

	ListNode getNext(ListNode l) {
		return l != null ? l.next : null;
	}
}