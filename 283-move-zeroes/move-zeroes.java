class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0; // Pointer for the last non-zero element

        // Iterate through the array
        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                // Swap the current non-zero element with the last found non-zero element
                swap(nums, lastNonZeroFoundAt, current);
                lastNonZeroFoundAt++; // Move the pointer to the next position
            }
        }
    }

    // Helper method to swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
