class Solution 
{
    public String removeStars(String s) 
    {
        char[] stack=new char[s.length()];
        int top=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='*')
            {
                top--;
            }
            else
            {
                stack[top]=ch;
                top++;
            }
        }
        return new String(stack,0,top);
    }
}