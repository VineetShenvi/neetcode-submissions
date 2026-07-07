class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while (low<nums.length-1 && nums[low] == nums[low+1]) low++;
        while (high>0 && nums[high] == nums[high-1]) high--;

        while(low <= high)
        {
            int mid = (low+high) / 2;

            if (nums[mid] == target) return true;

            if (nums[mid] <= nums[high] && target<=nums[high] && target>nums[mid])
            {
                low = mid+1;
                while (low < nums.length-1 && nums[low] == nums[mid]) low++;
            }    

            else if (nums[mid] <= nums[high])
            {
                high = mid-1;
                while (high > 0 && nums[high] == nums[mid]) high--;
            }

            else if (nums[mid] >= nums[high] && target>=nums[low] && target<nums[mid])
            {
                high = mid-1;
                while (high > 0 && nums[high] == nums[mid]) high--;
            }

            else
            {
                low = mid+1;
                while (low < nums.length-1 && nums[low] == nums[mid]) low++;
            }
        }

        return false;
    }
}

