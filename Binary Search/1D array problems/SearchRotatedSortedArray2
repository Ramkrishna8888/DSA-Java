class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while(low<=high){
            mid = low + (high - low)/2;
            if(target == nums[mid]){
                 return true;
            }
            // trim down the array if the low high and mid is same
            if(nums[low] == nums[mid] && nums[high] == nums[mid]){
                low++;
                high--;
                continue;
            }
            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target <= nums[mid])
                high = mid - 1;
                else
                low = mid +1;
            }
            // writing else condition so that easy to remind
            else if (nums[high]>=nums[mid]){
                if(target >= nums[mid] && target <= nums[high])
                    low = mid + 1;
                else
                high = mid -1;
            }
        }
        return false;    
        // same solution for finding how many 
    }
}
