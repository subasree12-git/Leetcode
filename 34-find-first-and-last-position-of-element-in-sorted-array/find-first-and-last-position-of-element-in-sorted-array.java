class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int[] a=new int[2];
        a[0]=first(nums,target);
        a[1]=second(nums,target);
        return a;
    }
    int first(int[] nums,int t)
    {
        int ans=-1,left=0,right=nums.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]==t)
            {
               ans=mid;
               right=mid-1;
            }
            else if(nums[mid]>t)
               right=mid-1;
            else
               left=mid+1;
        }
        return ans;
    }
    int second(int[] nums,int t)
    {
        int ans=-1,left=0,right=nums.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]==t)
            {
                ans=mid;
                left=mid+1;
            }
            else if(nums[mid]<t)
                left=mid+1;
            else
                right=mid-1;
        }
        return ans;
    }
}