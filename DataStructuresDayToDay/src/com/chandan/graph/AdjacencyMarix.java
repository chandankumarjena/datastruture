package com.chandan.graph;

public class AdjacencyMarix {
	int vertex;
	int matrix[][];
	public AdjacencyMarix(int vertex) {
		// TODO Auto-generated constructor stub
		this.vertex = vertex;
		matrix = new int[vertex][vertex];
	}
	public void addEdge(int source,int destination){
		matrix[source][destination] = 1;
		matrix[destination][source] = 1;
	}
	public void printGraph() {
		System.out.println("the graph structure");
		for(int i = 0; i < vertex; i++) {
			for(int j = 0;j < vertex; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdjacencyMarix adjacencyMarix = new AdjacencyMarix(5);
		adjacencyMarix.addEdge(0, 1);
		adjacencyMarix.addEdge(0, 4);
		adjacencyMarix.addEdge(1, 2);
		adjacencyMarix.addEdge(1, 3);
		adjacencyMarix.addEdge(1, 4);
		adjacencyMarix.addEdge(2, 3);
		adjacencyMarix.addEdge(3, 4);
		
		adjacencyMarix.printGraph();
	}

}
