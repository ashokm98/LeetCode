package LeetCodeAlgo;

import java.util.HashSet;
import java.util.Set;
public class LongestConsequtiveSequence {

	public static void main(String[] args) {
		
		int nums[] = {18, 63, 5, 62, 6, 8, 7};
		
			int result = longsc(nums);
			
			System.out.println("Longest Sequence = " + result);
	}
	
	public static int longsc(int []nums)
	{
		Set<Integer> set = new HashSet<>();
		for(int n : nums)
			set.add(n);
 		
		int max = 0;
		
		for(int i = 0; i<nums.length;i++)
		{
			int lsc = nums[i];
			
			if(set.contains(lsc-1))
				continue;
			int currLength = 0;
			
			while(set.contains(lsc))
			{
				currLength+=1;
				lsc+=1;
			}
			
			max = Math.max(max,currLength);
		}
		
		return max;
		
	}

}
