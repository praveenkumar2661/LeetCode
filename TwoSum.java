package LeetCode;



public class TwoSum 
{
	public int[] twoSum(int[] nums, int target)
    {
		int a = 0, b = 0;
		for (int i = 0; i < nums.length; i++) 
		{
			for (int j = i+1; j < nums.length; j++) 
			{
				if(nums[i]+nums[j]==target)
				{
					a = i; b = j;
					break;
				}
			}
		}
        return new int[] {a,b};
    }
}

