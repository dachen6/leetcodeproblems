package leetcode;

public class FindtheCityWiththeSmallestNumberofNeighborsataThresholdDistance {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dp = new int[n][n];
        for(int i = 0 ; i < n; i++) {
            for(int j = 0 ; j < n; j++) {
            	dp[i][j] = Integer.MAX_VALUE;
            }
            dp[i][i] = 0;
        }
        

        for(int[] i : edges) {
        	dp[i[0]][i[1]] = i[2];
        	dp[i[1]][i[0]] = i[2];
        }

        for(int i = 0 ; i < n; i++) {
            for(int j = 0 ; j < n; j++) {
                for(int x = 0 ; x < n; x++) {
                	dp[i][j] = Math.min(dp[i][j], dp[i][x] +  dp[x][j]);
                	dp[j][i] = Math.min(dp[j][i], dp[j][x] +  dp[x][i]);
                }
            }
        }
        
        for (int[] x : dp)
        {
           for (int y : x)
           {
                System.out.print(y + " ");
           }
           System.out.println();
        }
        int ans = 0;
        int curmin = n;
       
        for(int i = 0 ; i < n; i++) {
        	 int golmin = 0;
            for(int j = 0 ; j < n; j++) {
            	if(dp[i][j] <= distanceThreshold) {
            		golmin++;
            	}
            }
            if(golmin < curmin) {
            	ans = i;
            }
        }
        return ans;
        
    }
    
    
	  public static void main(String[] args) {
		  FindtheCityWiththeSmallestNumberofNeighborsataThresholdDistance cd = new FindtheCityWiththeSmallestNumberofNeighborsataThresholdDistance();
		  cd.findTheCity(4, new int[][] {{0,1,3},{1,2,1},{1,3,4},{2,3,1}}, 4);
	  }
}
