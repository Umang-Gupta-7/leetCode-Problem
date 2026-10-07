class Solution {
    public void dfs(boolean[] visited,int[][] arr,int i){
        visited[i]=true;
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==1 && !visited[j]){
                dfs(visited,arr,j);
            }
        }
    }
    public int findCircleNum(int[][] arr) {
        int n=arr.length,count=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(visited,arr,i);
                count++;
            }
        }
        return count;
    }
}