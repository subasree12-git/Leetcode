class Solution 
{
    private boolean canGetMin(long[] inc, int r, int k, long min) 
    {
        int n = inc.length;
        long sum = 0;
        long[] dec = new long[n];
        for (int i = 0; i < n; i++) 
        {
            sum += inc[i];
            sum -= dec[i];
            if (sum >= min) 
                continue;
            if (min - sum > k) 
                return false;
            k -= min - sum;
            if (i + 2 * r + 1 < n) 
                dec[i + 2 * r + 1] += min - sum;
            sum = min;
        }
        return true;
    }
    public long maxPower(int[] stations, int r, int k) 
    {
        int n = stations.length;
        long[] inc = new long[n];
        long sum = 0, maxSum = 0, minSum = 0;
        for (int i = 0; i < n; i++) 
        {
            if (i - r >= 0) 
                inc[i - r] += stations[i];
            else 
                inc[0] += stations[i];
            if (i + r + 1 < n) 
                inc[i + r + 1] -= stations[i];
        }
        for (int i = 0; i < n; i++) 
        {
            sum += inc[i];
            maxSum = Math.max(maxSum, sum);
            minSum = Math.min(minSum, sum);
        }
        long a = minSum, b = maxSum + (long) k, bestMin = 0;
        while (a <= b) 
        {
            long mid = (a + b) / 2;
            if (canGetMin(inc, r, k, mid)) 
            {
                bestMin = mid;
                a = mid + 1;
            } 
            else 
                b = mid - 1;
        }
        return bestMin;
    }
}