package LeetCode;

public class ValidPalindrome {
	public boolean isPalindrome(String s)
	{
		if(s.length()==0 || s.length()==1)
			return true;
        String a = "";
        String c = "";
        
        String b = s.toLowerCase().trim().replaceAll(" ","");
       
        for (int i = 0; i < b.length(); i++) {
			if((b.charAt(i)>='a' && b.charAt(i)<='z') || (b.charAt(i) >= '0' && b.charAt(i)<='9'))
				a+=b.charAt(i);
		}
        for (int i = b.length()-1; i >= 0; i--) {
        	if((b.charAt(i)>='a' && b.charAt(i)<='z') || (b.charAt(i) >= '0' && b.charAt(i)<='9'))
				c+=b.charAt(i);
		}
        System.out.println(b);
        System.out.println(a);
        System.out.println(Math.pow(0.00001, 2147483647));
		if(a.equals(c))
			return true;
		else
			return false;
    }
}
