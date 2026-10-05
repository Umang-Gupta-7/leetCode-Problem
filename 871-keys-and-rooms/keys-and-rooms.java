class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visited=new boolean[n]; // initaily all false
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
        // for(int i=0;i<n;i++){
            while(!q.isEmpty()){
                int top=q.remove();
                for(int j=0;j<rooms.get(top).size();j++){
                    int val=rooms.get(top).get(j);
                    if(!visited[val]){
                        q.add(val);
                        visited[val]=true;
                    }
                }
            }
            boolean flag=true;
            for(int i=0;i<n;i++){
                if(!visited[i]){
                    flag=false;
                    break;
                }
            }
            return flag;
        
    }
}