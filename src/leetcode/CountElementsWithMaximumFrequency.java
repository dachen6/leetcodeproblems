package leetcode;

public class CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        int[] array = new int[101];
        int max = 0;
        int fre = 0;
        for(int i = 0; i < nums.length; i ++){
            array[nums[i]] ++;
            if( array[nums[i]] > max){
                max=  array[nums[i]];
                fre = 1;
            }
            else if( array[nums[i]] == max){
                fre++;
            }
        }
        return max * fre;
    }
    
    
    public static void main(String[] args) {
    	CountElementsWithMaximumFrequency cd = new CountElementsWithMaximumFrequency();
    	cd.maxFrequencyElements(new int[] {1,2,3,4,5});
    }
}
