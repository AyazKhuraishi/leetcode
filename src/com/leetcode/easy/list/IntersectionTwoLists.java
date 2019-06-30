package com.leetcode.easy.list;

public class IntersectionTwoLists {

	// 160. Intersection of Two Linked Lists
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = len(headA);
        int lenB = len(headB);
        
        ListNode currentA = headA;
        ListNode currentB = headB;
        
        if(lenA == lenB) {
        	// do nothing
        }else if(lenA > lenB) {
        	int diff = lenA - lenB;
        	while(diff > 0) {
        		diff--;
        		currentA = currentA.next;
        	}
        }else {
        	int diff = lenB - lenA;
        	while(diff > 0) {
        		diff--;
        		currentB = currentB.next;
        	}
        }
        
        while(currentA != null && currentB != null) {
        	if(currentA == currentB) {
        		return currentB;
        	}
        	currentA = currentA.next;
        	currentB = currentB.next;
        }
        
        return null;
    }
	
	public int len(ListNode head) {
		int length = 0;
		ListNode current = head;
		while(current != null) {
			current = current.next;
			length++;
		}
		
		return length;
	}

}
