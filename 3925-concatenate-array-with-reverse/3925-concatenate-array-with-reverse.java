class Solution {
    public int[] concatWithReverse(int[] nums) {
        int lastIndex = nums.length - 1;
        int lastIndexTemp = lastIndex;
        int multipleSize = nums.length * 2;
        int[] arr = new int[multipleSize];
        for(int i = 0; i<multipleSize; i++){
            if(i>lastIndex){
                arr[i] = nums[lastIndexTemp];
                lastIndexTemp--;
            }
            else{
            arr[i] = nums[i];
            }
        }
        return arr;
    }
}