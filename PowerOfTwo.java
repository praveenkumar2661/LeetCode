package LeetCode;

public class PowerOfTwo 
{
	public boolean isPowerOfTwo(int n) {
        if(n==1)
            return true;
        if(n<= Integer.MIN_VALUE || n>= Integer.MAX_VALUE || n == 0)
            return false;
        while(n!=1)
            if(n%2 != 0)
                return false;
            else
                n/=2;
        return true;
    }
}
