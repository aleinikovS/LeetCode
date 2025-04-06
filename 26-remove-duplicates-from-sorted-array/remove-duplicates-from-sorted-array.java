class Solution {
    public int removeDuplicates(int[] nums) {
        int pivot = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[pivot] < nums[i]) {
                nums[++pivot] = nums[i];
            }

        }
        return pivot + 1;
    }
}