class Solution {
    public long sumArr(int[] arr){
        long sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    
    public int maxArr(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    
    public long possiblePages(int[] arr, long pages){
        int stud = 1; long allocatedPgs = 0;
        for(int i = 0; i<arr.length; i++){
            if((arr[i]+allocatedPgs) > pages){
                stud++;
                allocatedPgs = arr[i];
            }
            else{
                allocatedPgs+=arr[i];
            }
        }
        return stud;
    }
    
    public int findPages(int[] arr, int k) {
      long low = maxArr(arr);
      long high = sumArr(arr);
      if(k>arr.length) return -1;
      long ans = -1;
      while(low<=high){
         long mid = low + (high - low)/2;
          long studs = possiblePages(arr,mid);
          if(studs > k){
              low = mid + 1;
          }
          else{
              ans = mid;
              high = mid - 1;
          }
      }
      return (int)ans;
        
    }
}
