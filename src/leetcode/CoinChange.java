package leetcode;

import java.util.Arrays;

public class CoinChange {
	public int coinChange(int[] coins, int amount) {
    	int level = 0;
    	int numofcoin = 0;
    	int[] ans = new int[] {Integer.MAX_VALUE};
       help(coins, amount, level, numofcoin,ans);
       return ans[0] == Integer.MAX_VALUE? -1:ans[0];
    }
   

       public void help(int[] coins, int amount,int level, int numofcoin, int[] ans) {

    	if(level == coins.length-1 ) {
            if( amount % coins[level] == 0){
    		ans[0]  = Math.min(ans[0], numofcoin +amount /coins[level]  );
            }
            return;
    	}
    	int count = amount / coins[level];
    	for(int i = count; i >=0;i-- )
    	{
    		help(coins, amount - i * coins[level], level+1, numofcoin+ i,ans);
    	}
    }
       
       public static void main(String[] args)
       {
    	   CoinChange cd  = new CoinChange();
       	int ans = cd.coinChange(new int[] {412,392,401,75,38,106,223}, 7802);
        System.out.print(ans );
       }
}
