package LeetCode;

public class ReverseInteger
{
	 public int reverse(int x) 
	    {
		 int ans = 0;
	        while(x!=0)
	        {
	           int rem = x%10;
	           int newResult = ans*10 + rem;
	           if((newResult-rem)/10 != ans)
	            return 0;
	           ans =newResult;
	           x/=10;
	        }
	        return ans;
	    }
}
