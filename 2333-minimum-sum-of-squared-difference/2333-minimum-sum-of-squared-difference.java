
class Solution {
    // a good one must revisit
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long[] diff = new long[nums1.length];
        long max = 0, total = 0;

        for (int i = 0; i < nums1.length; i++) {
            diff[i] = Math.abs((long) nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
            total += diff[i];
        }

        long k = (long) k1 + k2;
        if (k >= total) return 0;

        long low = 0, high = max;

        while (low < high) {
            long mid = low + (high - low) / 2;
            long needed = 0;

            for (long d : diff) {
                if (d > mid) needed += d - mid;
            }

            if (needed <= k) high = mid;
            else low = mid + 1;
        }

        long remaining = k;
        long answer = 0;

        for (long d : diff) {
            if (d > low) {
                remaining -= d - low;
                d = low;
            }
            answer += d * d;
        }

        // Reduce remaining differences at the threshold by one.
        for (long d : diff) {
            if (remaining == 0) break;

            if (d >= low && d > 0) {
                answer -= low * low - (low - 1) * (low - 1);
                remaining--;
            }
        }

        return answer;
    }
}
