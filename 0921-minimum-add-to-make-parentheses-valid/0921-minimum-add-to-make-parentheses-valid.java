/*- depth > 0 → Unmatched opening ( available hai.
- depth == 0 → Koi unmatched opening ( nahi hai.
- depth < 0 → Valid parentheses string mein nahi hona chahiye; extra ) aa gaya.
minAddToMakeValid() mein:
- ( mile → depth++
- ) mile aur depth > 0 → depth-- (pair ban gaya).
- ) mile aur depth == 0 → ans++ (unmatched closing bracket).
Final answer: ans + depth
- ans = unmatched closing brackets ).
- depth = unmatched opening brackets (.
*/

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
