class Solution {
    public int daysRequired (int[] weights, int capacity)
    {
        int reqDays = 0, currWeight=0;
        for (int weight : weights)
        {
            currWeight += weight;
            if (currWeight > capacity)
            {
                currWeight = weight;
                reqDays++;
            }
        }
        return ++reqDays;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        int ans = 0;

        while (low <= high)
        {   
            int mid = (low+high)/2;
            int reqDays = daysRequired(weights, mid);

            System.out.println (mid + " : " + reqDays);

            if (reqDays <= days)
            {
                ans = mid;
                high = mid-1;
            } 

            else low = mid+1;
        }

        return ans;
    }
}