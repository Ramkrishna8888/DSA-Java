class Solution {
    public int sumOfArr(int[] nums){
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
    public int countPartitions(int[] nums) {
        int count = 0;
        int sum2 = 0;
        int sum = sumOfArr(nums);
        for(int i = 0; i<nums.length-1; i++){
            sum2 += nums[i];
            if((sum2 - (sum - sum2)) % 2 == 0){
                count++;
            }
        }
        return count;
    }
}