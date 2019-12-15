package com.chandan.graph;

import java.util.LinkedList;

public class AdjecencyList {
	int vertex;
	LinkedList<Integer> list[];
	public AdjecencyList(int vertex){
		//total number of node
		this.vertex = vertex;
		//initialize the list
		list = new LinkedList[vertex];
		//create the link node
		for(int i =0;i<vertex;i++) {
			list[i] = new LinkedList<Integer>();
		}
	}
	void addEdge(int source, int destination) {
		list[source].add(destination);
		list[destination].add(source);
	}
	void printGraph() {
		for(int i = 0;i<vertex;i++) {
			if(list[i].size() > 0) {
				System.out.print("vertex" + i + " is connected to: ");
				for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdjecencyList adjecencyList = new AdjecencyList(5);
		adjecencyList.addEdge(0, 1);
		adjecencyList.addEdge(0, 4);
		adjecencyList.addEdge(1, 2);
		adjecencyList.addEdge(1, 3);
		adjecencyList.addEdge(1, 4);
		adjecencyList.addEdge(2, 3);
		adjecencyList.addEdge(3, 4);
		
		adjecencyList.printGraph();
	}

}
