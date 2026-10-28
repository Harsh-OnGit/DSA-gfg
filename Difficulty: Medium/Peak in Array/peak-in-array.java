class Solution {
    public int peakElement(int[] arr) {
        // code here
        int n = arr.length;
                if (n == 1) return 0;

                int low = 0, high = n - 1;

                while (low <= high) {
                    int mid = low + (high - low) / 2;

                    // Check if mid is a peak element
                    boolean leftOk = (mid == 0 || arr[mid] > arr[mid - 1]);
                    boolean rightOk = (mid == n - 1 || arr[mid] > arr[mid + 1]);

                    if (leftOk && rightOk) {
                        return mid;
                    } 
                    // If the element to the left is greater, then a peak must exist on the left half
                    else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                        high = mid - 1;
                    } 
                    // Otherwise, a peak must exist on the right half
                    else {
                        low = mid + 1;
                    }
                }

                return -1;
    }
}