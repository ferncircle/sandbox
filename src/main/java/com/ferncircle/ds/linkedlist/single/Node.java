package com.ferncircle.ds.linkedlist.single;

public class Node {

	public double data;
	public Node nextLink;

	//Link constructor
	public Node(double d) {
		data = d;
	}

	//Print Link data
	public void printLink() {
		System.out.print("{" + data +  "} ");
	}
}
