package com.lakkam.ds;

import java.util.LinkedList;

/**
 * BFS for a graph
 * 
 * @author ranga
 *
 */
public class BFS {

	public static void main(String[] args) {
		
		//Initialize BFS Graph/Tree in n*n matrix representation or adjacent matrix representation
		int a[][] = {{0,0,0,0,0,0,0},
				 	{0,0,1,1,0,0,0},
				 	{0,1,0,0,1,0,0},
				 	{0,1,0,0,1,0,0},
				 	{0,0,1,1,0,1,1},
				 	{0,0,0,0,1,0,0},
				 	{0,0,0,0,1,0,0}};
		int initialVertex=1;
		performBFS(a,initialVertex);

	}

	private static void performBFS(int[][] a,int n) {
		
		int visitedArray[]= {0,0,0,0,0,0,0};
		java.util.Queue myQueue = new LinkedList();
		
			//visit the vertex
			System.out.println(n);
			//add the vertex to queue
			myQueue.add(n);
			//make an entry to visitedArray
			visitedArray[n]=1;
			
			/**
			 * Repeat the above process for remaining vertexes based on adjacent matrix values..
			 * This step is called exploring the vertex for adjucents
			 */
			while(!myQueue.isEmpty()) {
				
				//Get the vertex from queeu from queue for exploring
				int u=(int)myQueue.poll();
				for(int v=1;v<a.length;v++) {
					
					if(a[u][v]==1 && visitedArray[v]==0) {
						System.out.println(v);
						visitedArray[v]=1;
						myQueue.add(v);
					}
				}
				
			}
		
	}

}
