package LeetCode;

public class ANumberAfteraDoubleReversal 
{
	 public boolean isSameAfterReversals(int num) 
	    {
	        if(num == 0)
	            return true;
	        else if(num%10 == 0)
	            return false;
	        return true;
	        
	    }
}
