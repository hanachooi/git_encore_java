package com.encore.binarytree;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 이진트리 만들고 순회방법을 확인해 볼 예정
@NoArgsConstructor
@Getter
@Setter
public class TreeNode {

	private int data;
	private TreeNode leftNode;
	private TreeNode rightNode;
	
	// 생성자는 ? -> 멤버 변수에 대한 초기화
	public TreeNode(int data) {
		this.data = data;
	}
	
	public TreeNode(int data, TreeNode leftNode, TreeNode rightNode) {
		this.data = data;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}
}
