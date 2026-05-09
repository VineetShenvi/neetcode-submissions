class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int j=0; j<nums.length; j++){
            int i = nums[j];
            if (map.containsKey(target-i)) return new int[]{map.get(target-i), j};
            map.put(i, j);
        }
        return new int[]{1, 1};
    }
}
