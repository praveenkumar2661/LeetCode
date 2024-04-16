package LeetCode;

public class RemoveDuplicatesfromSortedArray 
{
	public int removeDuplicates(int[] nums)
    {
       int left = 0;
       int right = left+1;
       while(right<nums.length)
       {
            if(nums[right] == nums[left])
                right++;
            else
               nums[++left] = nums[right++];
       }
        return left+1;
    }
}
