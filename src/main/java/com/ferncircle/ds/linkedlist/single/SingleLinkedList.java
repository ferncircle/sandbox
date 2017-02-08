package com.ferncircle.ds.linkedlist.single;

public class SingleLinkedList {

	private Node first;
	private Node last;

	//LinkList constructor
	public SingleLinkedList() {
		first = null;
		last = null;
	}

	public boolean isEmpty(){
		if(first == null && last == null){
			return true;
		}else{
			return false;
		}
	}	

	//Inserts at the Start of the LinkedList
	public void insertFirst(double data){

		Node n = new Node(data);		

		if(first == null && last == null){
			n.nextLink = null;
			first = n;
			last = n;
		}else{
			n.nextLink = first;
			first = n;
		}


	}

	//Insert at the end of the LinkedList
	public void insertLast(double data){

		Node n = new Node(data);		

		if(first == null && last == null){
			n.nextLink = null;
			first = n;
			last = n;
		}else{
			n.nextLink = null;
			last.nextLink = n;
			last = n;
		}

	}

	//Deletes the head node
	public void deleteFirst(){

		if (first == null && last == null){
			System.out.println("List is already Empty");
		}else{
			first = first.nextLink;
		}
		
		if(first == null){
			last = null;
		}

	}	

	//Deletes the tail node
	public void deleteLast(){

		if (first == null && last == null){
			System.out.println("List is already Empty");
		}else if(first.nextLink == null){
			first = null;
			last = null;
			
		}else{
			Node current = first;
			Node previous = null;
			while(current.nextLink != null){
				
				previous = current;
				current = current.nextLink;
			}
			
			last = previous;
			last.nextLink = null;
		}

	}	

	public void get(){

	}

	public void printLink(){

		Node currentLink = first;
		if(currentLink == null){
			System.out.println("LIst is empty");
		}
		while(currentLink != null){
			System.out.println(" data: " + currentLink.data);
			currentLink = currentLink.nextLink;
		}
	}

	public static void main(String[] args){

		SingleLinkedList sll = new SingleLinkedList();
		sll.insertFirst(1.1);
		sll.insertFirst(2.2);
		sll.insertFirst(3.3);

		System.out.println("After Inserting from head: ");
		sll.printLink();
		
		while(!sll.isEmpty()){
			sll.deleteFirst();
			System.out.println("After Deleting from Head from head: ");
			sll.printLink();
		}
		
		
		//*******************************************************************
		SingleLinkedList sl2 = new SingleLinkedList();
		sl2.insertLast(1.1);
		sl2.insertLast(1.2);
		sl2.insertLast(1.3);

		System.out.println("After Inserting from tail: ");
		sl2.printLink();
		
		while(!sl2.isEmpty()){
			sl2.deleteLast();
			System.out.println("After deleting from tail: ");
			sl2.printLink();
		}		

		//*******************************************************************		
		
	}
}
