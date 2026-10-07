class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int ans = 0;
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i<sb.length(); i++){
            if(sb.charAt(i)=='('){
                depth++;
            }
            else if(sb.charAt(i)==')'){
                if(depth>0){
                    ans = Math.max(ans,depth);
                    depth--;
                }
            }
        }
        return ans;
    }
}