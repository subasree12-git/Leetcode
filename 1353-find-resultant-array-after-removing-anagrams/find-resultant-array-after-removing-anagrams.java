class Solution 
{
    public List<String> removeAnagrams(String[] words) 
    {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            int j=i+1;
            while(j<words.length)
            {
                if(!isAnagram(words[i],words[j]))
                {
                    break;
                }
                j++;
            }
            ans.add(words[i]);
            i=j-1;
        }
        return ans;
    }
    boolean isAnagram(String a,String b)
    {
        char arr1[]=a.toCharArray();
        char arr2[]=b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(String.valueOf(arr1).equals(String.valueOf(arr2)))
        {
            return true;
        }
        return false;
    }
}