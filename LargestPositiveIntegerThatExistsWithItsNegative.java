package LeetCode;

public class LargestPositiveIntegerThatExistsWithItsNegative {
	public int findMaxK(int[] nums) 
    {
        int ans = -1;
        for(int i = 0; i < nums.length; i++)
            for(int j = 0; j < nums.length; j++)
                if(nums[i] + nums[j] == 0)
                    ans = Math.max(ans, Math.abs(nums[i]));
        return ans;
    }
}
