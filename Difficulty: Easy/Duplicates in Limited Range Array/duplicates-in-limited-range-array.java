class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        boolean[] seen = new boolean[arr.length + 1];

        for (int num : arr) {
            if (seen[num]) {
                ans.add(num);
            } else {
                seen[num] = true;
            }
        }

        return ans;
    }
}
