class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]%3==0){
                continue;
            }
            if((nums[i]-1)%3==0){
                count++;
                continue;
            }
            if((nums[i]+1)%3==0){
                count++;
                continue;
            }
        }
        return count;
    }
}