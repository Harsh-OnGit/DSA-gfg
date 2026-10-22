class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        // code here
        List<List<Integer>> result = new ArrayList<>();

               for (int i = 0; i < arr.length; i++) {
                   List<Integer> subarray = new ArrayList<>();

                   for (int j = i; j < arr.length; j++) {
                       subarray.add(arr[j]);
                       result.add(new ArrayList<>(subarray));
                   }
               }

               return result;
    }
}