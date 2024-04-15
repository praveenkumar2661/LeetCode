package LeetCode;


public class LengthOfLastWord 
{
	 public int lengthOfLastWord(String s) {
	        String[] stringArray = s.split(" ");
	        return stringArray[stringArray.length -1].length();
	    }
}
