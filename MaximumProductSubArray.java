package LeetCode;

public class MaximumProductSubArray
{
	public int maxProduct(int[] nums) {
        int final_ans = nums[0];
        int prefix = 1, suffix = 1;
        int i =1;
        for(int ele : nums)
        {
            if(prefix ==0)
                prefix = 1;
            if(suffix == 0)
                suffix = 1;
            prefix*=ele;
            suffix*=nums[nums.length-i++];
            final_ans = Math.max(final_ans, Math.max(prefix,suffix));
        }
        return final_ans;
    }	      
}