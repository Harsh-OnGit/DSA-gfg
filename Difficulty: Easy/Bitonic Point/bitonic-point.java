class Solution {
    public int findMaximum(int[] arr) {
        // code here
    int low = 0;
            int high = arr.length - 1;

            while (low < high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] < arr[mid + 1]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

            return arr[low];    
    }
}