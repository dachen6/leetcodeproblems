package leetcode;
public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class SpiralMatrixIV {
	   public int[][] spiralMatrix(int m, int n, ListNode head) {
	        int[][] result = new int[m][n];
	        int[][] direction = new int[][] {{0,1},{-1, 0}, {0, -1},{1, 0}};
	        int cur = 0;
	        int col = 0;
	        int row = 0;
	        for(int i = 0; i < m; i++) {
	        	 for(int j = 0; j < n; j++) {
	        		 result[i][j] = -1;
	 	        	
	 	        }
	        	
	        }
	       while(head != null) {
	    	  
	    	   result[row][col] = head.val;   
	    	   int nextrow = row + direction[cur % 4][0];
	    	   int nextcol = col + col + direction[cur % 4][1];
	    	   while(nextrow < 0 ||nextrow >= m ||nextrow < 0 ||nextcol >= n ||  result[nextrow][nextcol] != -1 ) {
	    		   cur += 1;
	    		    nextrow = row + direction[cur % 4][0];
		    	    nextcol = col + col + direction[cur % 4][1];
	    	   }
	    	   row = nextrow;
	    	   col = nextcol;
	    	   
	       }
	       return result;
	    }
}
