/*depth > 0 → hum parentheses ke group ke andar hain.
depth == 0 → hum kisi group ke andar nahi hain. Ye group ke start hone se pehle ya group complete hone ke baad ho sakta hai.
depth < 0 → valid parentheses string mein aisa nahi hona chahiye. Iska matlab kisi closing bracket ka matching opening bracket nahi tha.
*/

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                if(depth>0){
                    sb.append(s.charAt(i));
                }
                depth++;
            }
            else{
                depth--;
                if(depth>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
