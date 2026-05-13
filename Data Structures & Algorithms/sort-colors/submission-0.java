class Solution {
    public void sortColors(int[] nums) {
        int l=0,i=0,r=nums.length-1;

        while(i<=r){
            int curr = nums[i];

            if(curr == 0){
                swap(nums, l, i);
                l++;
            }

            if(curr == 2){
                swap(nums, i, r);
                r--;
            }

            else i++;
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}