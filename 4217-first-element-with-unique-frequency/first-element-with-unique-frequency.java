class Solution 
{
    public int firstUniqueFreq(int[] nums) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashMap<Integer,Integer> freqMap=new HashMap<>();
        for(int freq:map.values())
        {
            freqMap.put(freq,freqMap.getOrDefault(freq,0)+1);
        }
        for(int num:nums)
        {
            int freq=map.get(num);
            if(freqMap.get(freq)==1)
            {
                return num;
            }
        }
        return -1;
    }
}