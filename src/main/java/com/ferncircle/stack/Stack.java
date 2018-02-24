package com.ferncircle.stack;

public class Stack {
	
	public Node top;
	private int min = Integer.MAX_VALUE;
	
	public Stack(){
		top = null;
	}
	
	public void push(int data){
		
		Node n = new Node(data);
		n.next = top;
		top = n;
		
		min = Math.min(data, min);
	}
	
	public Integer pop(){
		
		Integer output = null;
		if(top != null){
			output =  top.data;
			top = top.next;
			
		}
		return output;
	}
	
	public int getMin(){
		return min;
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
		s.push(1);
		s.print();
		System.out.println("Minimum value is : " + s.min);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.print();

	}

}
