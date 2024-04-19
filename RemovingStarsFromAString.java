package LeetCode;

public class RemovingStarsFromAString 
{
	public String removeStars(String s) {
        char[] str = new char[s.length()];
        int pivot = 0;
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) != '*')
                str[pivot++]=s.charAt(i);
            else
                pivot--;
        String ans = "";
        for(int i = 0; i < pivot; i++)
            ans+=str[i];
        return ans;
    }
}
