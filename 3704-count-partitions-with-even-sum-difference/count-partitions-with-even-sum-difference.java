class Solution 
{
    public int countPartitions(int[] nums) 
    {
        int totalSum=0,partSum=0,count=0;
        for(int num:nums)
        {
            totalSum+=num;
        }
        if((totalSum&1)!=0)
        {
            return 0;
        }
        for(int num:nums)
        {
            partSum+=num;
            totalSum-=num;
            if(totalSum!=0&&((partSum-totalSum)&1)==0)
            {
                count++;
            }
        }
        return count;
    }
}