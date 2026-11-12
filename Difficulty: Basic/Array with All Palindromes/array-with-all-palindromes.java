class Solution {
    public static boolean isPalinArray(int[] arr) {
        // code here.
        for (int num : arr) {
                    int original = num;
                    int reverse = 0;

                    while (num > 0) {
                        int digit = num % 10;
                        reverse = reverse * 10 + digit;
                        num = num / 10;
                    }

                    if (original != reverse) {
                        return false;
                    }
                }

                return true;
    }
}