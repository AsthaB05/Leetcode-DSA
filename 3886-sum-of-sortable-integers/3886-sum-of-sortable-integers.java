class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) {
                continue;
            }

            boolean sortable = true;

            for (int start = 0; start < n; start += k) {
                int descents = 0;

                for (int i = start; i < start + k - 1; i++) {
                    if (nums[i] > nums[i + 1]) {
                        descents++;
                    }
                }

                if (descents > 1) {
                    sortable = false;
                    break;
                }

                if (descents == 1) {
                    int last = start + k - 1;

                    if (nums[last] > nums[start]) {
                        sortable = false;
                        break;
                    }
                }
            }

            if (sortable) {
                // Check boundaries between blocks after rotation
                int prev = Integer.MIN_VALUE;

                for (int start = 0; start < n; start += k) {
                    int min = nums[start];
                    int max = nums[start];

                    for (int i = start; i < start + k; i++) {
                        min = Math.min(min, nums[i]);
                        max = Math.max(max, nums[i]);
                    }

                    if (prev > min) {
                        sortable = false;
                        break;
                    }

                    prev = max;
                }
            }

            if (sortable) {
                ans += k;
            }
        }

        return ans;
    }
}