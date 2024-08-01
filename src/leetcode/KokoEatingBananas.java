package leetcode;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
    	  int left = 1;
          int right = piles[0];
          int n = piles.length;
          for(int i = 0; i <n;i++ ) {
          	right = Math.max(right, piles[i]);
          }
          while(left < right) {
          	int mid =  (left + right) / 2;
          	int sum = 0;
              for(int i = 0; i <n;i++ ) {
              	sum+=Math.ceil((double)piles[i]/mid);
              }
            if (sum <= h) {
                  right = mid;
              }
              else {
            	  left = mid+1;
              }
          }
          return right;
      }
	  public static void main(String[] args) {
		  KokoEatingBananas cd = new KokoEatingBananas();
		  int ans = cd.minEatingSpeed(new int[]{3,6,7,11}, 8);
		  System.out.print(ans);
	  }
}
