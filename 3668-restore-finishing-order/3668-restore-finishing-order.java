class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[friends.length];
        int index = 0;
        for(int i : friends){
           set.add(i);
        }

        for(int i = 0; i<order.length; i++){
            if(set.contains(order[i])){
                arr[index] = order[i];
                index++;
            }
        }

        return arr;
    }
}