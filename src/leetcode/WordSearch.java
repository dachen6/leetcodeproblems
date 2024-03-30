package leetcode;

public class WordSearch {
	public boolean exist(char[][] board, String word) {
		char[] input = word.toCharArray();
		if(board.length <= 0|| board[0].length<= 0 ){
			return false;
		}
		if(word.length() == 0) {
			return true;
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {

				if (helper(board, i, j, input, 0)) {
					return true;
				}

			}
		}
		return false;
	}

	public boolean helper(char[][] board, int i, int j, char[] input, int index) {
		if (index == input.length) {
			return true;
		}
		if(i < 0 || i >=board.length || j < 0 || j >= board[0].length||board[i][j]!=input[index]    ) {
			return false;
		}
		board[i][j] ='0';
		boolean left = helper(board, i+1, j, input, index +1);
		boolean right = helper(board, i-1, j, input, index +1);
		boolean up = helper(board, i, j+1, input, index +1);
		boolean down = helper(board, i, j-1, input, index +1);
		board[i][j] =input[index];
		return left ||right || up || down;
	}
	

}
