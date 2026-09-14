class Solution {
    public int search(int[] nums, int target) {
        int ans = -1;
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while (low <= high){
            mid = low + (high - low)/2;
            if(target == nums[mid]){
              ans = mid;
              break;
            }
            else if(target > nums[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;

    }
}
