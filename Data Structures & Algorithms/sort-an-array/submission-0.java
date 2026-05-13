class Solution {
    public void mergeSort(int[] nums, int l, int r) {
        if(l>=r) return;
        int mid= (l+r)/2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid+1, r);
        merge(nums, l, mid, r);
    }

    public void merge(int[] nums, int l, int m, int r) {
        List<Integer> arr = new ArrayList<>();
        int i=l;
        int j=m+1;
        while(i<=m && j<=r){
            if(nums[i]<nums[j]){
                arr.add(nums[i]);
                i++;
            }
            else{
                arr.add(nums[j]);
                j++;
            }
        }

        while(i<=m){
            arr.add(nums[i]);
            i++;
        }

        while(j<=r){
            arr.add(nums[j]);
            j++;
        }

        for (int k: arr){
            nums[l++] = k;
        }
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
}