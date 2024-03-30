package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SurroundedRegions {
	 public void solve(char[][] board) {
		 int length = board.length;
		 int high = board[0].length;
		 	for(int i = 0; i < length;i++) {
		 		for(int j = 0; j < high;j++) {
			 		if((i == 0 || j == 0 || i ==length-1 || j ==high-1 )&& board[i][j] == 'O') {
			 			mark(board, i ,j , length, high);
			 		}
			 	}
		 	}
		 	for(int i = 0; i < length;i++) {
		 		for(int j = 0; j < high;j++) {
			 		if(board[i][j] == 'c' ) {
			 			board[i][j] = 'O';
			 		}
			 		else if(board[i][j] == 'O' ) {
			 			board[i][j] = 'X';
			 		}
			 	}
		 	}
	    }
	 
	 public void mark(char[][] board, int i, int j, int length, int high) {
		 Queue<int[]> queue = new LinkedList<int[]>();
		 queue.add(new int[] {i,j});
		 while(!queue.isEmpty()) {
			 int size = queue.size();
			 for(int x = 0; x < size; x++) {
				 int[] cur = queue.poll();
				 int curx = cur[0];
				 int cury = cur[1];
				 board[curx][cury] = 'c';
				 if(curx +1 < length && board[curx +1][cury] == 'O') {
					 queue.add(new int[] {curx + 1, cury});
				 }
				  if(curx -1 >= 0 && board[curx -1][cury] == 'O') {
					 queue.add(new int[] {curx - 1, cury});
				 }
				  if(cury +1 < high && board[curx ][cury+1] == 'O') {
					 queue.add(new int[] {curx, cury+1});
				 }
				 if(cury - 1 >= 0 && board[curx ][cury-1] == 'O') {
					 queue.add(new int[] {curx , cury-1});
				 }
			 }
			 
			 for(int a = 0; a < length;a++) {
			 		
			 	System.out.println(Arrays.toString(board[a]));
				 	
			 	}
			 System.out.println();
			 System.out.println();
			 System.out.println();
		 }
		 
	 }
	 
	 public static void main(String[] args) {
		 SurroundedRegions cd  =new  SurroundedRegions();
		 cd.solve(new char[][]{{'O','O','O','O','X','X'},{'O','O','O','O','O','O'},{'O','X','O','X','O','O'},{'O','X','O','O','X','O'},{'O','X','O','X','O','O'},{'O','X','O','O','O','O'}} );
	 }
}
