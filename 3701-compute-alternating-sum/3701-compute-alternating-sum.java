class Solution {
    public int alternatingSum(int[] nums) {
        int subtract = 0;
        int addition = 0;
        for(int i = 0; i<nums.length; i++){
            if(i%2==0){
                addition += nums[i];
            }
            else{
            subtract += nums[i];
            }
        }
       return addition-subtract;
    }
}