class Solution {
    public boolean validPath(int n, int[][] arr, int source, int destination) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> list=new ArrayList<>();    // this is use to create adj list
            adj.add(list);
        }
        for(int i=0;i<arr.length;i++){
            int a=arr[i][0];int b=arr[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[n];
        q.add(source);
        visited[source]=true;
        while(q.size()>0){
            int front=q.remove();
            for(int ele:adj.get(front)){
                if(!visited[ele]){
                    q.add(ele);
                    visited[ele]=true;
                    if(ele==destination) return true;
                }
            }
        }
        if(!visited[destination]) return false;
        else return true;
    }
}