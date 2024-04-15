package LeetCode;

public class SortColors 
{
	public void sortColors(int[] nums) 
    {
        for(int i = 0; i < nums.length; i++)
        {
            int end = nums.length -i -1;
            int maxIndex = maxIndex(0, end, nums);
            swap(nums, maxIndex, end);
        }
       
    }
        public int maxIndex(int a, int b, int[] nums)
        {
            int max = a;
            for(int i = a; i <= b; i++)
            {
                if(nums[i]>nums[max])
                    max = i;
            }
            return max;
        }
        public void swap(int[] nums, int a, int b)
        {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
}
