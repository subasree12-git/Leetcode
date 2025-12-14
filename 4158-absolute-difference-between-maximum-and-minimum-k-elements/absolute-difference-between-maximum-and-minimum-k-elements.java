class Solution 
{
    public int absDifference(int[] nums,int k) 
    {
        Arrays.sort(nums);
        int lsum=0,rsum=0;
        int last=nums.length-1;
        for(int i=0;i<k;i++)
        {
            lsum+=nums[i];
            rsum+=nums[last--];
        }
        return Math.abs(rsum-lsum);
    }
}