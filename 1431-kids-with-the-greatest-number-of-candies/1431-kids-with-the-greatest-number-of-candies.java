class Solution {
    public int MaxCandies(int[] candy){
        int max = 0;
        for(int i =0; i<candy.length; i++){
            max = Math.max(candy[i], max);
        }
        return max;
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> ls = new ArrayList<>();
       int max = MaxCandies(candies);
        for(int i = 0; i<candies.length; i++){
            int currentCandy = candies[i] + extraCandies;
            ls.add(currentCandy>=max);
        }
        return ls;
    }
}