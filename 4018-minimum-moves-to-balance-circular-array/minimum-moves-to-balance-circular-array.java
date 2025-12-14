class Solution 
{
    public long minMoves(int[] bal) 
    {
        int n=bal.length;
        int ind=-1;
        for(int i=0;i<n;i++)
        {
            if(bal[i]<0)
            {
                ind=i;
                break;
            }
        }
        if(ind==-1)
           return 0;
        long need=-bal[ind];
        long moves=0;
        for(int step=1;step<n&&need>0;step++)
        {
            int left=(ind-step+n)%n;
            int right=(ind+step)%n;
            if(bal[left]>0)
            {
                long take=Math.min(need,bal[left]);
                need-=take;
                bal[left]-=take;
                moves+=take*step;
            }
            if(need==0)
               break;
            if(bal[right]>0)
            {
                long take=Math.min(need,bal[right]);
                need-=take;
                bal[right]-=take;
                moves+=take*step;
            }
        }
        return need>0?-1:moves;
    }
}