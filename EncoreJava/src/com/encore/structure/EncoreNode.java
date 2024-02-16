package com.encore.structure;

public class EncoreNode {

	private int data;
	private EncoreNode node;
	
	public EncoreNode(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setNext(EncoreNode next) {
		this.node = next;
	}
	
	// node 에는 다음 노드의 주소값이 담기므로, getNode()를 하게 되면, 다음 노드로 움직이게 된다. 
	public EncoreNode getNode() {
		return this.node;
	}
	
}
