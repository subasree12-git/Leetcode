class Solution 
{
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        check(nums,n,0,new boolean[n],new ArrayList<>(),ans);
        return ans;
    }
    void check(int[] nums,int n,int l,boolean[] bool,List<Integer> list,List<List<Integer>> ans)
    {
        if(l==n)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(bool[i])
            {
                continue;
            }
            list.add(nums[i]);
            bool[i]=true;
            check(nums,n,l+1,bool,list,ans);
            bool[i]=false;
            list.remove(list.size()-1);
        }
    }
}