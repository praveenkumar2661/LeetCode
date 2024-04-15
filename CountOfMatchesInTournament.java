package LeetCode;

public class CountOfMatchesInTournament 
{
	public int numberOfMatches(int n) {
        int count = 0;
        int teams = n;
        while(n>0)
        {
            int match = teams/2;
            teams = (teams%2==0) ? teams/2 : (teams/2)+1;
            count+=match;
            n/=2;
        }
        return count;
	}
}
