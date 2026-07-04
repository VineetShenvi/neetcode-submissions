class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int num: nums){
            hash.add(num);
        } 

        int maxCount=0;
        for(int num: nums){
            if(hash.contains(num-1)) continue;
            int count=0;
            while(hash.contains(num)){
                count++;
                num++;
            }
            maxCount=max(count, maxCount);
        }

        return maxCount;
    }

    private int max(int a, int b){
        if(a>b) return a;
        return b;
    }
}
