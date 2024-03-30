package leetcode;

public class placeFlower {
	 public boolean canPlaceFlowers(int[] flowerbed, int n) {
	        int result = 0;
	        int cur = -2;
	        
	        for(int i = 0; i<flowerbed.length;i++){
            
	            if(flowerbed[i] == 1){
	               result += Math.max((i -cur-2) /2,0);
	                cur = i;
	            }	
	           
	        }
	        result += Math.max((flowerbed.length -cur-1) /2,0);
	        return n <= result;
	    }
	 
	 
	 public static void main(String[] args) {
		 placeFlower cd = new placeFlower();
		 boolean res = cd.canPlaceFlowers(new int[] {0,0,1,0,1}, 1);
		 System.out.println(res);
	 }
}
