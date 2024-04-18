package LeetCode;

public class SortThePeople 
{
	public String[] sortPeople(String[] names, int[] heights) 
    {
        if(names.length == 1 && heights.length ==1)
            return names;
        for(int i = 0; i < heights.length; i++)
        {
            int end = heights.length -1 -i;
            int minIndex = minIndex(end, heights);
            swap(minIndex, end, heights, names);
        }
        return names;
    }

    public int minIndex(int end, int[] heights)
    {
        int min = heights[0];
        int minIndex = 0;
        for(int i = 0; i <= end; i++)
            if(heights[i]<min)
            {
                min = heights[i];
                minIndex = i;
            }
        return minIndex;
    }

    public void swap(int a, int b, int[] heights, String[] names)
    {
        // Heights
        int c = heights[a];
        heights[a] = heights[b];
        heights[b] = c;

        // Names
        String d = names[a];
        names[a] = names[b];
        names[b] = d; 
    }
}
