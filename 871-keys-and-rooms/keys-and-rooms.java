class Solution {
    public void dfs(boolean[] visited,List<List<Integer>> rooms,int i){
        visited[i]=true;
        for(int ele:rooms.get(i)){
            if(!visited[ele]){
                dfs(visited,rooms,ele);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visited=new boolean[n];
        dfs(visited,rooms,0);
        for(int i=0;i<n;i++){
            if(!visited[i]) return false;
        }
        return true;
    }
}