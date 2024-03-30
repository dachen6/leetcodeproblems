package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationSequence {
	 public String getPermutation(int n, int k) {
	      int pos = 0;
	    List<Integer> numbers = new ArrayList<>();
	    int[] factorial = new int[n+1];
	    StringBuilder sb = new StringBuilder();
	    
	    // create an array of factorial lookup
	    int sum = 1;
	    factorial[0] = 1;
	    for(int i=1; i<=n; i++){
	        sum *= i;
	        factorial[i] = sum;
	    }
	    // factorial[] = {1, 1, 2, 6, 24, ... n!}
	    System.out.println(Arrays.toString(factorial) + "       ");
	    // create a list of numbers to get indices
	    for(int i=1; i<=n; i++){
	        numbers.add(i);
	    }
	    // numbers = {1, 2, 3, 4}
	    
	    k--;
	    System.out.println(k + "       ");
	    for(int i = 1; i <= n; i++){
	        int index = k/factorial[n-i];
	        System.out.print(index + "       ");
	        sb.append(String.valueOf(numbers.get(index)));
	        System.out.print(sb.toString() + "       ");
	        numbers.remove(index);
	        System.out.print(numbers.toString() + "       ");
	        k-=index*factorial[n-i];
	        System.out.println(k + "       ");
	    }
	    
	    return String.valueOf(sb);
	    }
	 
	 public static void main(String[] args) {
		 PermutationSequence cd  =new PermutationSequence();
		 
		 cd.getPermutation(3,3);
	 }
}
