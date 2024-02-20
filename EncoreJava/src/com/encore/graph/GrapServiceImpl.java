package com.encore.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GrapServiceImpl {

	GraphNode node;
	
	public GrapServiceImpl() {
			
	}
	
	public GraphNode makeNode(int data) {
		node = new GraphNode(data);
		return node;
	}
	
	public void makeEdge(GraphNode node1, GraphNode node2) {
		ArrayList<GraphNode> alNode = node1.getCorLst();
		alNode.add(node2);
		node1.setCorLst(alNode);
		// 위에꺼를 갖추려서, node1.getCorLst().add(node2);로 쓸 수 있음.
		
	}
	
	// 재귀호출 필요하고
	// Iterator 로 하기. 
	public void dfs(GraphNode node) {
		/*System.out.println(node.getData());
		node.setVisited(true);
		
		Iterator<GraphNode> iter = node.getCorLst().iterator();
		// 각 노드들을 Iterator로 저장함. 깊이 우선 후, 다음 노드도 탐색 가능.
		while(iter.hasNext()) {
			GraphNode data = iter.next();
			// 방문하지 않은 거에 대해
			if(!data.isVisited()) {
				// dfs 를 다시 함. 이러면, 깊이 우선 탐색 가능.
				dfs(data);
			}
		}
		
		*/
		System.out.println(node.getData());
		node.setVisited(true);
		
		Iterator<GraphNode> iter = node.getCorLst().iterator();
		while(iter.hasNext()) {
			GraphNode data = iter.next();
			if(!data.isVisited()) {
				dfs(data);
			}
		}
	}
	
	// 큐를 이용해서 작성
	public void bfs(int[][] ary, boolean[] visit) {
		Queue<Integer> queue = new LinkedList<Integer>();
		// Linked를 ArrayList로 바꾸기 
		
		// 데이터이면서 2차원 배열의 행 인덱스
		queue.offer(1);
		visit[1] = true;
		
		while(!queue.isEmpty()) {
			int row_data = queue.poll();
			System.out.println(row_data + '\t');
			for(int idx = 0; idx < ary[row_data].length; idx++) {
				// 데이터이지만 인덱스로 사용
				int temp = ary[row_data][idx];
				if(!visit[temp]) {
					visit[temp] = true;
					queue.offer(temp);
				}
			}
		}
	}
	
	
}
