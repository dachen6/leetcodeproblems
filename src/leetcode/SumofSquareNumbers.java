package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumofSquareNumbers {
	 public boolean judgeSquareSum(int c) {
	        
	        int j = 0;
	        for(int mid = 0;mid *mid<=c;mid++) {
	        	j = mid;
	        }
	        if(j * j ==c) {
	        	return true;
	        }
	        int i = 1;
	        while(i <= j){
	             
	           
	            if(c/j/j==i *i){
	            	   System.out.println(true);
	                return true;
	            }
	            else if(c/j/j >i * i){
	                j--;
	            }
	            else{
	                i++;
	            }
	            
	        }
	        System.out.println(false);
	        return false;
	    }
	 
	 public static void main(String[] args) { 
		 SumofSquareNumbers cd = new SumofSquareNumbers();
		
			cd.judgeSquareSum(5);
		}
}
