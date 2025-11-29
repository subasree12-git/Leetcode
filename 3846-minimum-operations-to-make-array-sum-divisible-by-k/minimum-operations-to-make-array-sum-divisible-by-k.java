class Solution 
{
    public int minOperations(int[] nums,int k) 
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        if(sum%k==0)
        {
            return 0;
        }
        int count=1;
        for(int i=sum-1;i>sum-k;i--)
        {
            if(i%k==0)
            {
                return count;
            }
            count++;
        }
        return count;
    }
}