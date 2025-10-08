class Solution 
{
    public int longestIncreasingPath(int[][] matrix)
    {
       if(matrix==null||matrix.length==0||matrix[0].length==0)
       {
        return 0;
       } 
       int m=matrix.length;
       int n=matrix[0].length;
       int[][] memo=new int[m][n];
       int maxPathLength=0;
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
            maxPathLength=Math.max(maxPathLength,lip(matrix,i,j,memo));
        }
       }
       return maxPathLength;
    }
    private int lip(int[][] matrix,int i,int j,int[][] memo)
    {
        if(i<0||j<0||i>=matrix.length||j>=matrix[0].length)
        {
            return 0;
        }
        if(memo[i][j]!=0)
        {
            return memo[i][j];
        }
        int currentMax=1;
        int[] rowP={-1,0,0,1};
        int[] colP={0,-1,1,0};
        for(int k=0;k<4;k++)
        {
            int newI=i+rowP[k];
            int newJ=j+colP[k];
            if(newI>=0&&newJ>=0&&newI<matrix.length&&newJ<matrix[0].length&&matrix[newI][newJ]>matrix[i][j])
            {
                currentMax=Math.max(currentMax,1+lip(matrix,newI,newJ,memo));
            }
        }
        memo[i][j]=currentMax;
        return currentMax;
    }
}