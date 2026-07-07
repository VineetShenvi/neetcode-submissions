class Solution {
    public int canEat(int[] piles, int h, int speed)
    {
        int hours = 0;
        
        for (int pile: piles)
        {
            hours += Math.ceil((double)pile/(double)speed);
            if (hours > h) return 1;
        }
        // if (hours == h) return 0;
        return -1;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = Arrays.stream(piles).max().getAsInt();
        int speed = low;

        while (low<=high)
        {
            int mid = (low+high)/2;

            System.out.print(mid + ": ");
            System.out.println(canEat(piles, h, mid));

            // if (canEat(piles, h, mid) == 0) return mid;

            if (canEat(piles, h, mid) == -1){
                speed = mid;
                high = mid-1;
            } 
            else low = mid+1;
        }
        


        return speed;
    }
}
