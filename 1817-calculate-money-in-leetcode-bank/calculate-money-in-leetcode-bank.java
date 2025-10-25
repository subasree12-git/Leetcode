class Solution 
{
    public int totalMoney(int n) 
    {
        int week=n/7;
        int days=n%7;
        int ans=((28*2+(week-1)*7)*week)/2;
        ans+=(((week+1)*2+days-1)*days)/2;
        return ans;  
    }
}