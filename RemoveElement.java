package LeetCode;

public class RemoveElement 
{
	public int removeElement(int[] nums, int val) 
    {
        int left = 0;
        int right= 0;
        while(right<nums.length)
        {
            if(nums[right] == val)
                right++;
            else
            {
               nums[left] = nums[right];
               left++;
               right++;
            }
        }
        return left;
    }
}
