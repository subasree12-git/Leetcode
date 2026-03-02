class Solution 
{
    public int minSwaps(int[][] grid) 
    {
        ArrayList<Integer> matrix=new ArrayList<>();
        int n=grid.length-1;
        for(int[] rowArr:grid)
        {
            int i;
            for(i=n;i>=0;i--)
            {
                if(rowArr[i]==1)
                   break;
            }
            matrix.add(n-i);
        }
        int swap=0;
        while(!matrix.isEmpty())
        {
            int i;
            int row=0;
            for(i=0;i<matrix.size();i++)
            {
                row=matrix.get(i);
                if(row>=n)
                   break;
            }
            if(row<n)
               return -1;
            swap+=i;
            matrix.remove(i);
            n--;
        }
        return swap;
    }
}