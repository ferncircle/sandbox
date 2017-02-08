package com.ferncircle.sandbox;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * 
 * Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
 */
public class RemoveNthFromEndList {

	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode result = head;
		ListNode prev = head;
		int delFlag = 0;
		while(head.next != null){
			head = head.next;
			
			if(delFlag >= n){
				result = prev;
				prev = prev.next;
			}
		}
		
		result.next = prev.next;
		
		return result;
	}
	
	
	
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
	}


}
