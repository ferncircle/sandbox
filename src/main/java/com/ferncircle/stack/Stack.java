package com.ferncircle.stack;

public class Stack {
	
	public Node top;
	
	public Stack(){
		top = null;
	}
	
	public void push(int data){
		
		Node n = new Node(data);
		if(!isEmpty()){
			n.next = top;
			top = n;
		}else{
			n.next = null;			
		}
		top = n;
	}
	
	public Integer pop(){
		
		Integer output = null;
		if(top != null){
			output =  top.data;
			top = top.next;
			
		}
		return output;
	}
	
	public boolean isEmpty(){
		if(top == null){
			return true;
		}
		return false;
	}
	
	public void print(){
		
		Node point = top;
		
		StringBuffer output = new StringBuffer();
		while(point.next!=null){
			output.append(point.data + ",");
			point = point.next;
		}
		output.append(point.data);
		System.out.println(output.toString());
		
	}

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.print();
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.print();

	}

}
