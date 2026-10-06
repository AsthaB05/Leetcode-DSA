class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        int positiveCount = n - left;      
        left = 0;
        right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } 
        int negativeCount = left;

        return Math.max(positiveCount, negativeCount);
    }
}