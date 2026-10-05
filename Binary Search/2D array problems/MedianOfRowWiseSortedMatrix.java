class Solution {
    public int upperBound(int[] arr, int num, int m){
        int low = 0;
        int high = m-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid]<=num){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
    
    public int countSmaller(int[][] mat,int mid,int n,int m){
        int count = 0;
        for(int i = 0; i<n; i++){
            count += upperBound(mat[i], mid, m);
        }
        return count;
    }
    
    public int median(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            low = Math.min(low, mat[i][0]);
            high = Math.max(high, mat[i][m-1]);
        }
        int reqNoOfEle = (n*m)/2;
        while(low<=high){
            int mid = low + (high - low)/2;
            int smallerCount = countSmaller(mat,mid,n,m);
            if(smallerCount <= reqNoOfEle){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
            
        }
        return low;
    }
}
