class Solution 
{
    public String[] findRelativeRanks(int[] score) 
    {
        int n=score.length;
        String[] ans=new String[n];
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int s:score)
        {
            pq.add(s);
        }
        for(int rank=1;rank<=n;rank++)
        {
            int highestScore=pq.poll();
            for(int i=0;i<n;i++)
            {
                if(score[i]==highestScore)
                {
                    if(rank==1)
                    {
                        ans[i]="Gold Medal";
                    }
                    else if(rank==2)
                    {
                        ans[i]="Silver Medal";
                    }
                    else if(rank==3)
                    {
                        ans[i]="Bronze Medal";
                    }
                    else
                    {
                        ans[i]=String.valueOf(rank);
                    }
                }
            }
        }
        return ans; 
    }
}