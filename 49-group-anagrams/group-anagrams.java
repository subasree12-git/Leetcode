class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        List<List<String>> list=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs)
        {
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String news=new String(arr);
            if(map.containsKey(news))
            {
                map.get(news).add(str);
            }
            else
            {
                List<String> temp=new ArrayList<>();
                temp.add(str);
                map.put(news,temp);
            }
        }
        for(String str:map.keySet())
        {
            list.add(map.get(str));
        }
        return list;
    }
}