class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length-2;
        int max = nums.length-1;
        int mid = 0;
        if(nums.length == 1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[max] != nums[max-1]){
            return nums[max];
        }

        while(low<=high){
            mid = low + (high - low) / 2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid -1]){
                return nums[mid];
            }
            if((mid%2==0 && nums[mid]==nums[mid+1]) ||(mid%2==1 && nums[mid]==nums[mid-1]))
                low = mid + 1;
            else
               high = mid - 1;
        }

        return -1;
    }
}
