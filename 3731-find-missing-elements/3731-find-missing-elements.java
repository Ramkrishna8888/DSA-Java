class Solution {
    public int LargestEle(int[] arr){
        int maxx = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>maxx){
                maxx = arr[i];
            }
        }
        return maxx;
    }

       public int SmallestEle(int[] arr){
        int minn = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<minn){
                minn = arr[i];
            }
        }
        return minn;
    }

    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int end = LargestEle(nums);
        int start = SmallestEle(nums);
        for(int i = start; i<end; i++){
            boolean yes = false;
            for(int j = 0; j<nums.length; j++){
            if(i == nums[j]){
                yes = true;
            }
            }
            if(!yes){
                ls.add(i);
            }
        }
        return ls;
    }
}