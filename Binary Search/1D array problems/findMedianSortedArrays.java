class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // optimal approach and easy to understand
        //x1 elements taken from nums 1 (left side)
        //x2 reruired element to be taken from nums 2 (left side)
        //y1 rest elements of nums 1 (right side)
        //y2 rest elemet of nums 2 (right side)  
        // mid the no. elements taking from nums 1
        // reqEle required elements to be taken from nums 2 ((m+n+1)/2) - mid;

       // performing binary search on the smallest array in case nums1 is greater then following recursive approach to swap arrays
       if(nums1.length>nums2.length){
        return findMedianSortedArrays(nums2, nums1);
       }

         int m = nums1.length;
         int n = nums2.length;

         int low = 0;
         int high = m;

         while(low<=high){
           int mid = low + (high - low) / 2; // taking numbers from nums 1;
           int reqEle = ((m+n+1)/2) - mid; // requried elements from nums 2;

            // left half 
            int x1 = (mid == 0) ? Integer.MIN_VALUE : nums1[mid - 1];
            int x2 = (reqEle == 0) ? Integer.MIN_VALUE : nums2[reqEle - 1];


            // right half
            int y1 = (mid == m) ? Integer.MAX_VALUE : nums1[mid];
            int y2 = (reqEle == n) ? Integer.MAX_VALUE : nums2[reqEle];

            if(x1<=y2 && x2 <=y1){
            if((m+n)%2==1){
                return (double)Math.max(x1,x2);
            }
            else{
                return (double)(Math.max(x1,x2)+Math.min(y1,y2))/2.0;
            }
        }

            if(x1>y2){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

         }
         return -1;

    }
}
