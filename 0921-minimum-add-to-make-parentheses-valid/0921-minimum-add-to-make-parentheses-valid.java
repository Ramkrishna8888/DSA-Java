class Solution {
    public int minAddToMakeValid(String s) {
        char[] arr = s.toCharArray();
        int depth = 0;
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == '('){
                depth++;
            }
            else {
            if (depth > 0) {
                depth--; 
            } else {
             ans++;
            }
        }
    }
      return ans + depth;
    }
}