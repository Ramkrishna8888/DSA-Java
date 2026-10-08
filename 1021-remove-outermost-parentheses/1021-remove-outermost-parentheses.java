class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);
         StringBuilder sb2 = new StringBuilder();
        int depth = 0;
        for(int i = 0; i<sb.length(); i++){
            if(sb.charAt(i)=='('){
                if(depth>0){
                    sb2.append(sb.charAt(i));
                }
                depth++;
            }
            else if(sb.charAt(i)==')'){
                depth--;
                if(depth>0){
                    sb2.append(sb.charAt(i));
                }
            }
        }
        return sb2.toString();
    }
}