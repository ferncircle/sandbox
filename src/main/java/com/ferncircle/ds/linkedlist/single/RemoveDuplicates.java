package com.ferncircle.ds.linkedlist.single;

import java.util.HashSet;

public class RemoveDuplicates extends SingleLinkedList{
	
	public static SingleLinkedList removeDuplicates(SingleLinkedList sll2){
		
		if(sll2.isEmpty()){
			return sll2;
		}
		
		if(sll2.head.next == null){
			return sll2;
		}
		
		HashSet<Integer> set = new HashSet<Integer>();
		Node current = sll2.head;
		Node previous = sll2.head;
		while(current.next != null){
			if(set.contains(current.data)){
				previous.next = current.next;
				current = current.next;
			}else{
				set.add(current.data);
				previous = current;
				current = current.next;
			}
		}
		
		return sll2;
	}

	public static void main(String[] args) {
		
		SingleLinkedList sll2 = new SingleLinkedList();
		sll2.insertTail(1);
		sll2.insertTail(2);
		sll2.insertTail(3);
		sll2.insertTail(1);
		sll2.insertTail(2);
		sll2.insertTail(5);
		sll2.print();
		
		SingleLinkedList output = removeDuplicates(sll2);
		System.out.println("After removing duplicates:");
		output.print();

	}

}
