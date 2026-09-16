class Solution {
    public long maxArr(int[] arr){
        long max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
           max = Math.max(max, arr[i]);
        }
        return max;
    }

    public long sumArray(int[] arr){
        long sum = 0;
        for(int i = 0; i<arr.length; i++){
          sum = sum + arr[i];
        }
        return sum;
    }

    public boolean possibleSplit(int[] arr, int mid, int k){
        long currentSum = arr[0]; int counter = 1;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]+currentSum<=mid){
               currentSum += arr[i];
            }
            else{
                counter++;
                currentSum = arr[i];
            }
        }
        if(counter<=k){ // confusion remember k is the maximum allowed number of subarrays so we have to check less than equal to
            return true;
        }
        return false;
    }

    public int splitArray(int[] nums, int k) {
        long low = maxArr(nums);
        long high = sumArray(nums);
        long mid = 0;
        long ans = 0;
        while(low<=high){
            mid = low + (high - low)/2;
            if(possibleSplit(nums,(int)mid,k)){
                ans = mid;
                high = mid -1 ;
            }
            else{
               low = mid + 1;
            }
        }

        return (int)ans;

    }
}
