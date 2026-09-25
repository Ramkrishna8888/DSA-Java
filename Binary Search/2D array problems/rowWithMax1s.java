class Solution {
    public int lowerBound(int[] arr, int len, int num){
        int low = 0;
        int high = len-1;
        int mid = 0;
        int ans = len;
        while(low<=high)
        {
            mid = low + (high - low) / 2;
            if(arr[mid]>=num){
                ans = mid;
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    
    
    public int rowWithMax1s(int[][] arr) {
        int countOnes = 0;
        int index = 0;
        int minIndex = Integer.MAX_VALUE;
        int ans = -1;
        for(int i = 0; i<arr.length; i++){
            index = lowerBound(arr[i], arr[i].length, 1);
            if(index < minIndex){
                minIndex = index;
                ans = i;
            }
        }
        if(minIndex==arr[0].length){
            return -1;
        }
        
        return ans;
        
    }
};
