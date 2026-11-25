class Solution {
    public int minimumRateToEatBananas(int[] nums, int h) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        int l = 1;
        int r = max;
        int ans = max;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            int hours = 0;

            for (int i = 0; i < nums.length; i++) {
                hours += (nums[i] + mid - 1) / mid;
            }

            if (hours <= h) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }
}