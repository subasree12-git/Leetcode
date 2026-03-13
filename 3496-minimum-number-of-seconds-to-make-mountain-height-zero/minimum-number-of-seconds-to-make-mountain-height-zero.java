class Solution 
{
    public long minNumberOfSeconds(int height, int[] times) 
    {
        long l=1,h=10000000000000000L;
        while(l<h)
        {
            long mid=(l+h)>>1;
            long tot=0;
            for(int i=0;i<times.length&&tot<height;i++)
               tot+=(long)(Math.sqrt((double)mid/times[i]*2+0.25)-0.5);
            if(tot>=height)
               h=mid;
            else
               l=mid+1;
        }
        return l;
    }
}