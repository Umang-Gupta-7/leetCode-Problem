class Solution {
    public List<String> buildArray(int[] arr, int n) {
        List<String> ans=new ArrayList<>();
        int s=arr.length;
        int i=0,m=1;
        while(m!=arr[s-1]){
            ans.add("Push");
             if(arr[i]!=m){
                ans.add("Pop");
                m++;
             }else{
                m++;
                i++;
             }
        }
        ans.add("Push");
        return ans;
    }
}