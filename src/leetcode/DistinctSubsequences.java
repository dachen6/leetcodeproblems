package leetcode;

public class DistinctSubsequences {
    public int numDistinct(String s, String t) {
        int[][] matrix = new int[t.length()+1][s.length()+1];
        for(int i = 1; i <= t.length(); i++){
            for(int j = 1; j <= s.length(); j++){
                if(t.charAt(i-1) == s.charAt(j-1)){
                   
                        matrix[i][j] =matrix[i ][j -1] + matrix[i-1][j - 1] ;
                    
                }
                else{
                    matrix[i][j] = matrix[i][j - 1] ;
                }
          }
        }
        
        for(int i = 1; i <= t.length(); i++){
            for(int j = 1; j <= s.length(); j++){
               System.out.print(matrix[i][j] + " ");
          }
            System.out.println();
        }
        return matrix[t.length()][s.length()];
    }
    public static void main(String[] args) {
    	DistinctSubsequences cd = new DistinctSubsequences();
    	cd.numDistinct("babgbag", "bag");
    	
    	
    }
}
