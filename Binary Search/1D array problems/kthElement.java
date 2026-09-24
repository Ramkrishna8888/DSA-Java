class Solution {
  // most important question to revise and unserstand
    public int kthElement(int[] a, int[] b, int k) {

        if (a.length > b.length) {
            return kthElement(b, a, k);
        }

        int m = a.length;
        int n = b.length;

        int low = Math.max(0, k - n);
        int high = Math.min(k, m);

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int reqEle = k - mid;

            int x1 = (mid == 0) ? Integer.MIN_VALUE : a[mid - 1];
            int x2 = (reqEle == 0) ? Integer.MIN_VALUE : b[reqEle - 1];

            int y1 = (mid == m) ? Integer.MAX_VALUE : a[mid];
            int y2 = (reqEle == n) ? Integer.MAX_VALUE : b[reqEle];

            if (x1 <= y2 && x2 <= y1) {
                return Math.max(x1, x2);
            }

            if (x1 > y2) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
