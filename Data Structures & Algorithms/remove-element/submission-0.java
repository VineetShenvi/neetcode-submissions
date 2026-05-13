class Solution {
    public int removeElement(int[] nums, int val) {
        Map<Integer, Integer> count = new HashMap<>();

        for(int n: nums){
            if (n != val){
                count.putIfAbsent(n, 0);
                count.put(n, count.get(n) + 1);
            }
        }

        int index = 0;
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            for(int i=0; i<entry.getValue(); i++){
                nums[index++] = entry.getKey();
            }
        }

        return index;
    }
}