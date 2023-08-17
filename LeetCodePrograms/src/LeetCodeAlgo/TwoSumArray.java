package LeetCodeAlgo;

import java.util.Arrays;

public class TwoSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {2,7,11,15};
		int target = 9;
		
		int output[] = twoSum(nums,target);
		
		System.out.println(Arrays.toString(output));
	}
	
	public static int[] twoSum (int nums[], int target)
	{
		int left = 0;
		int right = nums.length-1;
		
		while(left < right)
		{
			int currSum = nums[left] + nums[right];
			
			if(currSum == target)
			{
				return new int[] {left +1,right + 1};
			}
			else if(currSum > target)
			{
				right -=1;
			}
			else if(currSum < target)
			{
				left +=1;
			}
		}
		
		return null;
	}

}
