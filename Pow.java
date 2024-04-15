package LeetCode;

public class Pow 
{
	public double myPow(double x, int n) {
        double ans = 1;
        if (x==1.0 || (x==-1.0 && n<=-2147483648) || n ==0) 
            return 1;
        if (x==-1.0 && n>=2147483647) 
            return -1;
        if(n>=2147483647 || n == -2147483648 )
            return 0;
        if(n>0)
        {
            for(int i = 1; i <= n; i++)
                ans*=x;
            return ans;
        }
        else
        {
            int a = -(n);
            for(int i = 1; i <= a; i++)
                ans*=x;
            return 1/ans;
        }
    }
}
