class Solution {
    public int reverse(int x) {
        int c = 0;
        while (x != 0) {
            int b = x % 10;
            if (c > Integer.MAX_VALUE / 10 ||
                (c == Integer.MAX_VALUE / 10 && b > 7))
                return 0;
            if (c < Integer.MIN_VALUE / 10 ||
                (c == Integer.MIN_VALUE / 10 && b < -8))
                return 0;
            c = c * 10 + b;
            x /= 10;
        }
        return c;
    }
}