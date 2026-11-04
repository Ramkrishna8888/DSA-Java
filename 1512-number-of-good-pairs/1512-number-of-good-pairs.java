class Solution {
    public int numIdenticalPairs(int[] nums) {
     HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int freq = map.getOrDefault(nums[i], 0);
            count += freq;
            map.put(nums[i], freq + 1);
        }
        return count;
    }
}