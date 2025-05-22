class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1}; // Default values if target is not found

        if (nums.length == 0) {
            return result;
        }

        // Find first occurrence
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // Check if target exists
        if (left >= nums.length || nums[left] != target) {
            return result; // Target not found
        }
        result[0] = left; // First occurrence

        // Find last occurrence
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        result[1] = right; // Last occurrence
        return result;
    }
}