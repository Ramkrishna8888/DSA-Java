class Solution {
    public int maxSum(List<Integer> nums, int k) {

        long MOD = 1_000_000_007L;

        int[] count = new int[32];

        // Count set bits
        for (int num : nums) {
            for (int bit = 0; bit < 32; bit++) {
                if ((num & (1 << bit)) != 0) {
                    count[bit]++;
                }
            }
        }

        long ans = 0;

        // Build the largest number k times
        for (int i = 0; i < k; i++) {

            long curr = 0;

            for (int bit = 0; bit < 32; bit++) {

                if (count[bit] > 0) {
                    curr += (1L << bit);
                    count[bit]--;
                }
            }

            ans = (ans + curr * curr) % MOD;
        }

        return (int) ans;
    }
}