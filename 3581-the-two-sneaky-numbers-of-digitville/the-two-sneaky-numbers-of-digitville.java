class Solution 
{
    public int[] getSneakyNumbers(int[] nums) 
    {
        final int Max=100;
        int[] ans=new int[2];
        int[] count=new int[Max+1];
        int ansIndex=0;
        for(final int num:nums)
            if(++count[num]==2)
                ans[ansIndex++]=num;
        return ans;
    }
}