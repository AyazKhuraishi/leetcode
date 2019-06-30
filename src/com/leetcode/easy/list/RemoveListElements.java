package com.leetcode.easy.list;

public class RemoveListElements {

	// 203. Remove Linked List Elements
	public ListNode removeElements(ListNode head, int val) {
        if(head == null)	return null;
        
        while(head !=null && head.val == val) {
        	head = head.next;
        }
        
        ListNode current = head;
        while(current != null && current.next != null) {
        	while(current.next != null && current.next.val == val) {
        		current.next = current.next.next;
        	}
        	current = current.next;
        }
        
        return head;
    }
	
	public static void main(String[] args) {
		RemoveListElements obj = new RemoveListElements();
		testCase1(obj);
	}
	
	public static void testCase1(RemoveListElements obj) {
		ListNode list = ListUtils.createList(new int[]{1,2,6,6,6,3,4,5,6,6});
		ListNode solution = obj.removeElements(list, 6);
		
		ListUtils.printList(solution);

	}

}
