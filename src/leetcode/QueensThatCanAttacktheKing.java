package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QueensThatCanAttacktheKing {
	  List<List<Integer>> ans=new ArrayList<>();
	    int[][] board;
	    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
	        board=new int[8][8];
	        for(int i=0; i<queens.length; i++){
	            int row=queens[i][0];
	            int col=queens[i][1];
	            board[row][col]=1;
	        }
	        top(king[0],king[1]);
	        bottom(king[0],king[1]);
	        left(king[0],king[1]);
	        right(king[0],king[1]);
	        topleft(king[0],king[1]);
	        topRight(king[0],king[1]);
	        bottomLeft(king[0],king[1]);
	        bootomRight(king[0],king[1]);
	        return ans;
	    }
	    public void top(int row, int col){
	        for(int i=row ; i>=0 ; i--){
	            if(board[i][col]==1){
	               List<Integer> temp=new ArrayList<>();
	               temp.add(i);
	               temp.add(col);
	               ans.add(temp);
	               return;
	            }
	        }
	    }
	    public void bottom(int row, int col){
	        for(int i=row; i<8; i++){
	            if(board[i][col]==1){
	               List<Integer> temp=new ArrayList<>();
	               temp.add(i);
	               temp.add(col);
	               ans.add(temp);
	               return;
	            }           
	        }
	    }
	    public void left(int row, int col){
	        for(int j=col; j>=0; j--){
	            if(board[row][j]==1){
	               List<Integer> temp=new ArrayList<>();
	               temp.add(row);
	               temp.add(j);
	               ans.add(temp);
	               return;
	            }               
	        }
	    }
	    public void right(int row, int col){
	        for(int j=col ; j<8 ; j++){
	            if(board[row][j]==1){
	               List<Integer> temp=new ArrayList<>();
	               temp.add(row);
	               temp.add(j);
	               ans.add(temp);
	               return;
	            }
	        }
	    }
	    public void topleft(int row, int col){
	        for(int i=row, j=col; i>=0 && j>=0 ; i--,j--){
	            if(board[i][j]==1){
	               List<Integer> temp=new ArrayList<>();
	               temp.add(i);
	               temp.add(j);
	               ans.add(temp);
	               return;
	            }      
	        }
	    }
	    public void topRight(int row, int col){
	        for(int i=row, j=col; i>=0 && j<8 ; i--,j++){   
	            if(board[i][j]==1){
	               List<Integer> temp=new ArrayList<>();
	               temp.add(i);
	               temp.add(j);
	               ans.add(temp);
	               return;
	            }           
	        }
	    }
	    public void bottomLeft(int row, int col){
	        for(int i=row,j=col; i<8 && j>=0 ; i++, j--){
	             if(board[i][j]==1){
	               List<Integer> temp=new ArrayList<>();
	               temp.add(i);
	               temp.add(j);
	               ans.add(temp);
	               return;
	            }           
	        }
	    }
	    public void bootomRight(int row, int col){
	        for(int i=row, j=col; i<8 && j<8 ; i++,j++){
	             if(board[i][j]==1){
	               List<Integer> temp=new ArrayList<>();
	               temp.add(i);
	               temp.add(j);
	               ans.add(temp);
	               return;
	            }
	        }
	    }  
}
