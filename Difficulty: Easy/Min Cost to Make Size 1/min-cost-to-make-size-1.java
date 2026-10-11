class Solution {
    public int cost(int[] arr) {
        // code here
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        return min * (arr.length - 1);
        
    }
}