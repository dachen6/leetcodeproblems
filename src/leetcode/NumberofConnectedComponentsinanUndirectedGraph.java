package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class NumberofConnectedComponentsinanUndirectedGraph {
	  public int countComponents(int n, int[][] edges) {
		  	int[] arr = new int[n];
		  	Arrays.fill(arr, -1);
		  	int result = 0;
		  	for(int i = 0; i< edges.length ;i++) {
		  		int start = edges[i][0];
		  		int end = edges[i][1];
		  		arr[end] = start;
		  	}
		  	HashSet<Integer> check = new HashSet<Integer>();
		
		  	for(int i = 0; i< n;i++) {
		  		if(arr[i] == -1) {
		  			result++;
		  		}
		  	}
		  		
		  	return result;
		  	
	    }
	  
	  static int find(int parent[], int i)
	  {
	      if (parent[i] == -1)
	          return i;
	      return find(parent, parent[i]);
	  }
	  
	  public static void main(String[] args) {
		  NumberofConnectedComponentsinanUndirectedGraph cd = new NumberofConnectedComponentsinanUndirectedGraph();
		 int res =   cd.countComponents(5, new int[][] {{0,1},{1,2},{3,4}});
		 System.out.print(res);
	  }
}
