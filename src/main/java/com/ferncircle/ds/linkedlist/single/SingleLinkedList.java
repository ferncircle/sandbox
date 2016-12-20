package com.ferncircle.ds.linkedlist.single;

public class SingleLinkedList {

	private Node first;

	//LinkList constructor
	public SingleLinkedList() {
		first = null;
	}

	public boolean isEmpty(){
		if(first == null){
			return true;
		}else{
			return false;
		}
	}	

	//Inserts at the Start of the LinkedList
	public void insert(double data){

		Node n = new Node(data);
		n.nextLink = first;
		first = n;
		
	}

	//Deletes the head node
	public void delete(){

		if (first == null){
			System.out.println("List is already Empty");
		}else{
			first = first.nextLink;
		}
		
	}	
	
	public void get(){
		
	}
	
	public void printLink(){
		
		Node currentLink = first;
		while(currentLink != null){
			System.out.println(" data: " + currentLink.data);
			currentLink = currentLink.nextLink;
		}
	}
	
	public static void main(String[] args){
		
		SingleLinkedList sll = new SingleLinkedList();
		sll.insert(1.1);
		sll.insert(2.2);
		sll.insert(3.3);
		
		System.out.println("After Insert: ");
		sll.printLink();
		
		System.out.println("After delete: 1");
		sll.delete();
		sll.printLink();
		
		System.out.println("After delete: 2");
		sll.delete();
		sll.printLink();
		
		System.out.println("After delete: 3");
		sll.delete();
		sll.printLink();
		
		System.out.println("After delete: 4");
		sll.delete();
		sll.printLink();
	}
}
