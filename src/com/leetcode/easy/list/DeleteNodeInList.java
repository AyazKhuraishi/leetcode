package com.leetcode.easy.list;

public class DeleteNodeInList {

	// 237. Delete Node in a Linked List
	public void deleteNode(ListNode node) {
		ListNode current = node;
		while(current != null) {
			if(current.next != null) {
				current.val = current.next.val;
				if(current.next.next == null) {
					current.next = null;
				}
			}
			
			current = current.next;
		}
    }
	
}
