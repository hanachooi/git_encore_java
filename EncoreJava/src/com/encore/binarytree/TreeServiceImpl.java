package com.encore.binarytree;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TreeServiceImpl {

	public TreeNode makeTree(int data, TreeNode leftNode, TreeNode rightNode) {
		
		TreeNode node = new TreeNode(data);
		node.setLeftNode(leftNode);
		node.setRightNode(rightNode);
		
		return node;
	}
	
	// 전위순회 ( 뿌리 -> 왼쪽 -> 오른쪽 )
	// 0 1 3 7 8 4 9 10 2 5 11 6
	public void preOrder(TreeNode node) {
		
		if(node != null) {
			// 뿌리 값은 항상 찍음
			System.out.print(node.getData() + " ");
			// 왼쪽으로 이동
			preOrder(node.getLeftNode());
			// 왼쪽이 모두 수행 된 후, 오른쪽 수행
			preOrder(node.getRightNode());
		}
	}
	
	// 중위순회 ( 왼쪽 -> 뿌리 -> 오른쪽 ) 
	// 7 3 8 1 9 4 10 0 11 5 2 6
	// 재귀는 스택 개념으로 보는 것이 좋다.
	public void inOrder(TreeNode node) {
		
		if(node != null) {
			inOrder(node.getLeftNode());
			System.out.print(node.getData()+ " ");
			inOrder(node.getRightNode());
		}
		
	}
	
	// 후위순회 ( 왼쪽 -> 오른쪽 -> 뿌리 )
	// 7 8 3 9 10 4 6 11 5 6 2 0
	public void postOrder(TreeNode node) {
		if(node != null) {
			inOrder(node.getLeftNode());
			inOrder(node.getRightNode());
			System.out.print(node.getData()+ " ");
		
		}
	}
}
