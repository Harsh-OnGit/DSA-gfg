class Solution {
    public int minOps(int[] arr, int k) {
        // code here
        int max = arr[0];

                for (int num : arr) {
                    max = Math.max(max, num);
                }

                int operations = 0;

                for (int num : arr) {
                    if ((max - num) % k != 0) {
                        return -1;
                    }
                    operations += (max - num) / k;
                }

                return operations;
    }
}