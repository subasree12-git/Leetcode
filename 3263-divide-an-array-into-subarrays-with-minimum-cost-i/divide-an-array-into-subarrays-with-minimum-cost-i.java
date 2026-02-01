class Solution 
{
    public int minimumCost(int[] nums) 
    {
        int cost1=nums[0];
        nums[0]=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int cost2=nums[0];
        int cost3=nums[1];
        return cost1+cost2+cost3;
    }
}