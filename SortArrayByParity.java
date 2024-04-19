package LeetCode;

public class SortArrayByParity 
{
	public int[] sortArrayByParity(int[] nums) 
    {
        int[] arr = new int[nums.length];
        int y = 0;
        for(int i = 0; i < nums.length; i++)
            if(nums[i]%2 == 0)
                arr[y++] = nums[i];
        for(int i = 0; i < nums.length; i++)
            if(nums[i]%2 != 0)
                arr[y++] = nums[i];
        return arr;
    }
}
