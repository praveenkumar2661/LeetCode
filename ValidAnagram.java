package LeetCode;

import java.util.Arrays;

public class ValidAnagram 
{
	public static boolean isAnagram(String s, String t) 
    {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        if(str1.length == str2.length)
        {
        	for (int i=0; i < str2.length; i++) {
				if(str1[i] == str2[i])
					return true;
			}
        }
        return false;
    }
}
