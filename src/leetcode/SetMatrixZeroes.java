package leetcode;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
    	int n = matrix.length;
    	int l = matrix[0].length;
        for(int i =0; i < n;i++ )
        {
            for(int j =0; j<l ;j++ )
            {
            	if(matrix[i][j] == 0) {
            		matrix[0][j] = 0;
            		matrix[i][0] = 0;
            	}
            }
        }
        for(int i =1; i < n;i++ )
        {
            if(matrix[i][0] == 0) {
                for(int j =1; j < l;j++ )
                {
                    matrix[i][j] = 0;
                }
            }
        }
        for(int j =1; j < l;j++ )
        {
            if(matrix[0][j] == 0) {
                for(int i =1; i < n;i++ )
                {
                    matrix[i][j] = 0;
                }
            }
        }
        if(matrix[0][0] == 0) {
            for(int j =1; j < l;j++ )
            {
                matrix[0][j] = 0;
            }
            for(int i =1; i < n;i++ )
            {
                matrix[i][0] = 0;
            }
        }
    }
    public static void main(String[] args) {
    	SetMatrixZeroes cd = new SetMatrixZeroes();
    	cd.setZeroes(new int[][] {{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}});
    	
    }
}
