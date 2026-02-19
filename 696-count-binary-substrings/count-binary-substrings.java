class Solution 
{
    public int countBinarySubstrings(String s) 
    {
        int r=0,prev=0,k=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
               k++;
            else
            {
               prev=k;
               k=1;
            }
            if(k<=prev)
               r++;
        }
        return r;
    }
}