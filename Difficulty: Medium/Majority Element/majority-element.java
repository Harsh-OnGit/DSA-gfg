class Solution {
    int majorityElement(int arr[]) {
        // code here
        int candidate = 0;
                int count = 0;

                // Find a potential majority element
                for (int num : arr) {
                    if (count == 0) {
                        candidate = num;
                    }

                    if (num == candidate) {
                        count++;
                    } else {
                        count--;
                    }
                }

                // Verify the candidate
                count = 0;
                for (int num : arr) {
                    if (num == candidate) {
                        count++;
                    }
                }

                if (count > arr.length / 2) {
                    return candidate;
                }

                return -1;
    }
}