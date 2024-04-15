package LeetCode;

public class PalindromeNumber 
{
	public boolean isPalindrome(int x) 
    {
       String s = Integer.toString(x);
       String ans = "";
       for (int i = s.length()-1; i >= 0; i--)
    	   ans+=s.charAt(i);
       if(ans.equals(s))
    	   return true;
       return false;
    }
}
