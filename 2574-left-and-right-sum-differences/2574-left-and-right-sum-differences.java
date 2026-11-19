class Solution {
    public int[] leftRightDifference(int[] nums) {

        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum > rightSum) {
                arr[i] = leftSum - rightSum;
            } else {
                arr[i] = rightSum - leftSum;
            }

            leftSum += nums[i];
        }

        return arr;
    }
}