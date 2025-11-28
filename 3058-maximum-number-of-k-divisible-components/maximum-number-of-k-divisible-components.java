class Solution 
{
    private Map<Integer,List<Integer>>adj;
    private int comp;
    public int maxKDivisibleComponents(int n, int[][] edges,int[] values,int k) 
    {
        adj=new HashMap<>();
        comp=0;
        for(int[] edge:edges)
        {
            int u=edge[0];
            int v=edge[1];
            adj.computeIfAbsent(u,key->new ArrayList<>()).add(v);
            adj.computeIfAbsent(v,key->new ArrayList<>()).add(u);
        }
        dfs(0,-1,values,k);
        return comp;
    }
    private int dfs(int root,int parent,int[] values,int k)
    {
        int sum=values[root];
        for(int neighbor:adj.getOrDefault(root,Collections.emptyList()))
        {
            if(neighbor!=parent)
            {
                sum+=dfs(neighbor,root,values,k);
            }
        }
        if(sum%k==0)
        {
            comp++;
            return 0;
        }
        return sum%k;
    }
}