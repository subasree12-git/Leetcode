class Solution 
{
    public int longestBalanced(String s) 
    {
        int n=s.length();
        int res=1;
        for(int i=0;i<n;i++)
        {
            int[] freq=new int[26];
            for(int j=i;j<n;j++)
            {
                int minFreq=Integer.MAX_VALUE,maxFreq=0;
                char ch=s.charAt(j);
                String str=s.substring(i,j+1);
                freq[ch-'a']++;
                for(int m=0;m<26;m++)
                {
                    if(freq[m]!=0)
                    {
                        minFreq=Math.min(minFreq,freq[m]);
                        maxFreq=Math.max(maxFreq,freq[m]);
                    }
                }
                if(minFreq==maxFreq)
                {
                    res=Math.max(res,str.length());
                }
            }
        }
    return res;   
    }
}