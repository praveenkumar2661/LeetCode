package LeetCode;

public class MaximumSubArray 
{
	public int maxSubArray(int[] nums)
    {
		int final_ans = Integer.MIN_VALUE;
		int current = 0;
		for(int ele: nums)
		{
			current+=ele;
			if(current>final_ans)
				final_ans = current;
			if(current<0)
				current = 0;
		}
		return final_ans;
    }
}
