class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        List<Integer> ans=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<n;i++){
            min=(min>arr[i])?arr[i]:min;
            max=(max<arr[i])?arr[i]:max;
        }
        for(int i=min;i<=max;i++){
            if(!(set.contains(i))) ans.add(i);
        }
        return ans;
    }
}