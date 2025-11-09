class Solution 
{
    public int minimumDistance(int[] n) 
    {
        Map<Integer,List<Integer>> map=new HashMap<>();
        int ans=Integer.MAX_VALUE,len=n.length;
        if(n.length<2)
           return -1;
           for(int i=0;i<len;i++)
               map.computeIfAbsent(n[i],x->new ArrayList<>()).add(i);
               for(Map.Entry<Integer,List<Integer>> e:map.entrySet())
               {
                List<Integer> idx=e.getValue();
                if(idx.size()>2)
                   for(int i=0;i<idx.size()-2;i++)
                       ans=Math.min(ans,2*(idx.get(i+2)-idx.get(i)));
               }
               return ans==Integer.MAX_VALUE?-1:ans;
    }
}