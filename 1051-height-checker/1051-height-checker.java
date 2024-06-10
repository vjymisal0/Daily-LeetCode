class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int[] heights1=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            heights1[i]=heights[i];
        }
        Arrays.sort(heights1);
        for(int i=0;i<heights.length;i++)
        {
            if(heights1[i]!=heights[i])
            {
                count++;
            }
        }
        return count;
    }
}