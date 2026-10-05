class Solution {
    public int KthMissingElement(int[] arr, int k) {
        for (int i = 1; i < arr.length; i++) {
            int missing = arr[i] - arr[i - 1] - 1;

            if (k <= missing) {
                return arr[i - 1] + k;
            }

            k -= missing;
        }

        return -1;
    }
}
