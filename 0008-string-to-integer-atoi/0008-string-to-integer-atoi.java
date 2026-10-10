class Solution {
    public int myAtoi(String s) {
        int isNeg = 1;
        int len = s.length();
        int i = 0;
        int ans = 0;

        while (i < len && s.charAt(i) == ' ') {
            i++;
        }
        if (i < len) {
            if (s.charAt(i) == '-') {
                isNeg = -1;
                i++;
            } else if (s.charAt(i) == '+') {
                i++;
            }
        }
        while (i < len && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int dig = s.charAt(i) - '0'; // ASCII thing is taken care

            if (ans == Integer.MAX_VALUE/10) {
                if (isNeg == 1) {
                    if (dig >= 7)
                        return Integer.MAX_VALUE;
                }
             else if (isNeg == -1) {
                    if (dig >= 8) {
                        return Integer.MIN_VALUE;
                    }
                }
            }

            if (ans > Integer.MAX_VALUE / 10) {
                if (isNeg == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            ans = ans * 10 + dig;
            i++;
        }

        return isNeg * ans;
    }
}