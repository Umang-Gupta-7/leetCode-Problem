class Solution {
    public int findPairs(int[] arr, int k) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<String> ans = new HashSet<>();

        set.add(arr[0]);

        for(int i = 1; i < arr.length; i++) {

            int diff1 = arr[i] - k;
            int diff2 = arr[i] + k;

            if(set.contains(diff1))
                ans.add(Math.min(arr[i], diff1) + "," + Math.max(arr[i], diff1));

            if(set.contains(diff2))
                ans.add(Math.min(arr[i], diff2) + "," + Math.max(arr[i], diff2));

            set.add(arr[i]);
        }

        return ans.size();
    }
}