package com.encore.graph;

import java.util.ArrayList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class GraphNode {

	private int data;
	private boolean visited;
	private ArrayList<GraphNode> corLst;
	
	
	public GraphNode(int data) {
		this.data = data;
		this.visited = false;
		corLst = new ArrayList<GraphNode>();
	}
	
}
