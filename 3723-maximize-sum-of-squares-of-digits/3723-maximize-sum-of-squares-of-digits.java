class Solution {
    public String maxSumOfSquares(int num, int sum) {

        if (sum > num * 9) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int remaining = sum;

        for (int i = 0; i < num; i++) {

            if (remaining >= 9) {
                sb.append(9);
                remaining -= 9;
            } else {
                sb.append(remaining);
                remaining = 0;

                while (sb.length() < num) {
                    sb.append(0);
                }
                break;
            }
        }

        return sb.toString();
    }
}