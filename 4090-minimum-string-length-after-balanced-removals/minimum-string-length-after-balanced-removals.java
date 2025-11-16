class Solution 
{
    public int minLengthAfterRemovals(String s) 
    {
        int counta=0,countb=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='a')
            {
                counta++;
            }
            else
            {
                countb++;
            }
        }
    return Math.abs(counta-countb);  
    }
}