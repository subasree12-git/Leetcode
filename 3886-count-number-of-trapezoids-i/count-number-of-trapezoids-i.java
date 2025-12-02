class Solution 
{
    public int countTrapezoids(int[][] points) 
    {
        int ans=0;
        int a=0;
        int mod=1000000007;
        Map<Integer,Integer> map=new HashMap<>();
        for(int[] i:points)
            map.put(i[1],map.getOrDefault(i[1],0)+1);
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            int k=e.getValue();
            long s=(long) k*(k-1) / 2;
            s %= mod;
            ans=(int)((ans+a*s)%mod);
            a+=s;
        }
        return ans;
    }
}