class Solution {
    public int[] transformArray(int[] nums) {
        int index = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2==0){
                nums[index] = 0;
                index++;
            }
            else{
                count++;
            }
        }
        for(int j = 0; j<count; j++){
            nums[index] = 1;
            index++;
        }
        return nums;        
    }
}