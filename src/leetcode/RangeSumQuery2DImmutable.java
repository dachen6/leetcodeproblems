package leetcode;

public class RangeSumQuery2DImmutable {
	
		static int[][] matrix;
		    public void NumMatrix(int[][] matrix1) {
		        this.matrix = matrix1;
		        for(int i = 0; i < matrix.length; i++){
		             for(int j = 0; j < matrix[0].length; j++){
		                 int up = i - 1 >= 0? matrix[i-1][j] : 0;
		                 int left = j - 1 >= 0? matrix[i][j-1]: 0;
		                  int upleft =(i- 1 >= 0 && j - 1 >= 0)?matrix[i-1][j-1]: 0; 
		                matrix[i][j] = matrix[i][j] + up + left - upleft;        
		            }
		        }
		    }
		    
		    public static int sumRegion(int row1, int col1, int row2, int col2) {
		         int up = row1 - 1 >= 0? matrix[row1-1][col2] : 0;
		         int left = col1 - 1 >= 0? matrix[row2][col1-1]: 0;
		        int upleft =(col1 - 1 >= 0 && row1 - 1 > 0)?matrix[row1-1][col1-1]: 0; 
		        return matrix[row2][col2] - up - left + upleft;
		    }
		
	
	public static void main(String[] args) {
		RangeSumQuery2DImmutable cd  =new RangeSumQuery2DImmutable();
		cd.NumMatrix(new int[][] {new int[]{-4,-5}});
		System.out.print(sumRegion(0,0,0,1));
				
	}
}
