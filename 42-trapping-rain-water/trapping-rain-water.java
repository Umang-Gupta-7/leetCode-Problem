class Solution {
    public int trap(int[] arr) {
        int leftMax=arr[0],n=arr.length,totalVolume=0;
        int rightMax=arr[n-1],i=0,j=n-1;
        while(i<j){
            if(arr[i]<arr[j]){
                totalVolume+=Math.min(leftMax,rightMax)-arr[i];
                i++;
                leftMax=Math.max(leftMax,arr[i]);
            }
            else{
                totalVolume+=Math.min(leftMax,rightMax)-arr[j];
                j--;
                rightMax=Math.max(rightMax,arr[j]);
            }
        }
        return totalVolume;
    }
}