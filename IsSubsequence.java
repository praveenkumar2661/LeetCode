package LeetCode;

public class IsSubsequence 
{
	 public boolean isSubsequence(String s, String t) {
		 if((s.length() == 0 && t.length() == 0) || s.length() == 0)
	            return true;
	        if(t.length() == 0)
		            return false;
	        
		    int begin1 = 0;
		    int begin2 = 0;
		        
		    while(begin2<t.length())
		    {
		        if(s.charAt(begin1) == t.charAt(begin2))
		        {
		            begin1++;
		            begin2++;
	                if(s.length() == begin1)
	                    break;
		        }
		        else
		            begin2++;
		    }
		        
		    if(begin1 == s.length())
		        return true;
		    return false;
	    }
}

