class Solution
{
    public List<Integer> findMissingElements(int[] nums) 
    {
        Arrays.sort(nums);
        List<Integer> ls=new ArrayList<>();
        int min=nums[0],max=nums[nums.length-1];
        int i=0;
        while(min<max&&i<nums.length)
        {
            if(nums[i]==min)
            {
                i++;
            }
            else
            {
                ls.add(min);
            }
            min++;
        }
        return ls;   
    }
}