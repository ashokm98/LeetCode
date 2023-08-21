package LeetCodeAlgo;

public class ContainerWithWater {

	public static void main(String[] args) {
		
		int [] height = {1,8,6,2,5,4,8,3,7};
		
		int output = maxArea(height);
		
		System.out.println(output);

	}
	
	public static int maxArea(int[] height) {
		
		int left = 0;
		int right = height.length-1;
		int max = -1;
		
		while(left < right)
		{
			int width = right - left;
			int hight = Math.min(height[left], height[right]);
			max = Math.max(max, width * hight);
			
			if(height[left] < height[right])
			{
				left++;
			}
			else
				right--;
			
		}
		
		return max;
				
	}

}
