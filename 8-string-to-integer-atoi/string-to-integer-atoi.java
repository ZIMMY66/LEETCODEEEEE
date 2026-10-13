
class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int sign = 1;
        long num = 0;

        // Step 1: Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Check the sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // Step 3: Read digits and build the number
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';
            num = num * 10 + digit;

            // Step 4: Handle integer overflow
            if (sign * num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign * num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (sign * num);
    }
}
