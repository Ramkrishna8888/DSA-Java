class Solution {
    
    public int firstOccurance(int[] nums, int t){
         int low = 0;
         int high = nums.length-1;
         int mid = 0;
         int ans = -1;
         while(low<= high){
            mid = low + (high-low)/2;
            if(t == nums[mid]){
                ans = mid;
                high = mid - 1;
            }
            else if(t>nums[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
         }
         return ans;
    }

    public int lastOccurance(int[] nums, int t){
         int low = 0;
         int high = nums.length-1;
         int mid = 0;
         int ans = -1;
         while(low<= high){
            mid = low + (high-low)/2;
            if(t == nums[mid]){
                ans = mid;
                low = mid + 1;
            }
            else if(t>nums[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
         }
         return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurance(nums,target);
        int last = lastOccurance(nums,target);
        return new int[] {first,last};
    }
}
