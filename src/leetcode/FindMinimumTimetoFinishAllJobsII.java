package leetcode;

import java.util.Arrays;

public class FindMinimumTimetoFinishAllJobsII {
    public int minimumTime(int[] jobs, int[] workers) {
        Arrays.sort(jobs);
        Arrays.sort(workers);
        double min = 0;
        for(int i = 0 ; i < jobs.length;i++)
        {
        	
        	min = Math.max(min,(int) Math.ceil(jobs[i] /  workers[i]););
        }
        return (int) Math.ceil(min);
    }
    
 
}
