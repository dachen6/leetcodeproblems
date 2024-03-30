package leetcode;

public class FindtheDuplicateNumber {
public int findDuplicate(int[] nums) {
        
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] ==i ){
               continue;
            }
            else if(nums[nums[i]] == nums[i]){
                return nums[i];
            }
            else{
                int temp = nums[i];
                nums[i] = nums[nums[i]];
                nums[temp] = temp;
                i--;
            }
        }
        return 1;
    }

public static void main(String[] args) {
	FindtheDuplicateNumber cd = new FindtheDuplicateNumber();
	cd.findDuplicate(new int [] {1,3,4,2,2});
}
}
