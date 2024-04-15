package LeetCode;
import java.util.Arrays;

public class MedianofTwoSortedArray
{
	public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
		 int[] arr = new int[(nums1.length+nums2.length)];
	     int y = 0;
	     for (int i = 0; i < nums1.length; i++) 
	    	 arr[y++] = nums1[i];
	     for (int i = 0; i < nums2.length; i++) 
	    	 arr[y++] = nums2[i];
	        
	     Arrays.sort(arr);
	     if((nums1.length+nums2.length)%2 != 0)
     		return arr[arr.length/2];
	     else
	  		return ((arr[arr.length/2])+(arr[(arr.length/2)-1]))/2.0; 
	    }
		
}
