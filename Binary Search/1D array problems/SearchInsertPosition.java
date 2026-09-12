class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid = 0;
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while (low <= high){
            mid = low + (high - low)/2;
            if(target > nums[mid]){
              ans = mid;
              low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans+1;
    }
}
