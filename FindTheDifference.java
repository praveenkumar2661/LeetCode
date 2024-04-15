package LeetCode;

import java.util.Arrays;

public class FindTheDifference 
{
	public char findTheDifference(String s, String t) 
    {
		char[] str1 = s.toCharArray();
	    char[] str2 = t.toCharArray();
			Arrays.sort(str1);
			Arrays.sort(str2);
			int i = 0;
			for (char c : str1)
			{
				if(c != str2[i])
					return str2[i];
                i++;
			}
		return str2[i];
    }
}
