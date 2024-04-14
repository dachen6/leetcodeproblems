package leetcode;

public class NumberofStudentsUnabletoEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] stucount = new int[2];
        int totalcount = students.length;
        for(int i = 0; i < totalcount;i++) {
        	stucount[students[i]] ++;
        }
        for(int i = 0; i < totalcount;i++) {
        	if(stucount[sandwiches[i]] ==0){
        		return totalcount-i;
        	}
        	stucount[sandwiches[i]]--;
        	
        }
        return 0;
    }
    
    public static void main(String[] args) {
    	NumberofStudentsUnabletoEatLunch cd= new NumberofStudentsUnabletoEatLunch();
    	System.out.print(   	cd.countStudents(new int[] {1,1,1,0,0,1}, new int[] {1,0,0,0,1,1}));
 
    }
}
