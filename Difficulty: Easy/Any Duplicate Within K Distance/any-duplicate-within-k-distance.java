class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        HashMap<Integer, Integer> map = new HashMap<>();

                for (int i = 0; i < arr.length; i++) {
                    if (map.containsKey(arr[i])) {
                        int prevIndex = map.get(arr[i]);

                        if (i - prevIndex <= k) {
                            return true;
                        }
                    }

                    map.put(arr[i], i);
                }

                return false;
    }
}