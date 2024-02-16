package com.encore.structure;

public class EncoreNodeList {
    
    // LinkedList가 처음에 만들어지면 거기엔 데이터가 없다.
    private EncoreNode head ;
    
    public EncoreNodeList(int data) {
        // 2. 여기서 노드 객체가 만들어짐.
        this.head = new EncoreNode(data); // 하나의 헤더가 노드를 참조하는 구조
    }
    public void add(int data) {
        if(this.head == null) {
            // 연결 리스트의 헤더가 생성되지 않은 상태!!
            this.head = new EncoreNode(data); // 데이터를 담아서 노드를 만든다. 여기서 this는 없어도 된다.
        } else {
            // 연결되어지는 노드를 생성 (2번째 노드가 만들어지면, 데이터는 없고 주소값만 있는 상태)
            EncoreNode node = this.head;
            while(node.getNode() != null) { // node가 null이 아닐 때만 즉, 처음에만 최초 객체 생성시.
                node = node.getNode();
            }
            node.setNext( new EncoreNode(data) );
        }
    }
    
    public void desc() {
        EncoreNode node = this.head;
        while(node != null) {
            System.out.println("debug >>>> " + node.getData());
            node = node.getNode();
        }
    }
    
    public boolean remove(int data) {
        System.out.println(this.head.getData());
        if(this.head.getData() == data) {
        	EncoreNode temp = this.head;
        	this.head = this.head.getNode();
        	temp = null;
        }else {
        	EncoreNode node = this.head;
        	while(node.getNode() != null) {
        		if(node.getNode().getData() == data) {
        			node.setNext(node.getNode().getNode());
        			return true;
        		}else {
        			node = node.getNode();
        		}
        	}
        }
        return false;
    }
}