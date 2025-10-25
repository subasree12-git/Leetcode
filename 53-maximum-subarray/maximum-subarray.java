class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int sum=0,max=Integer.MIN_VALUE,i=0,j=0;
        while(j<nums.length)
        {
            if(sum<0&&nums[j]>=sum)
            {
                sum=0;
                i=j;
            }
            sum+=nums[j];
            max=Math.max(max,sum);
            j++;
        }
        return max;  
    }
}