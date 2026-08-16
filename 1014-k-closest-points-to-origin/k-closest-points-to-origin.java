class Triplet implements Comparable<Triplet>{
    int dist;
    int x;
    int y;
    Triplet(int dist,int x,int y){
        this.dist=dist;
        this.x=x;
        this.y=y;
    }
    public int compareTo(Triplet t){
        return this.dist-t.dist;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplet> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int[] point: points){
            int x=point[0],y=point[1];
            int dist=x*x+y*y;
            heap.add(new Triplet(dist,x,y));
            if(heap.size()>k) heap.remove();
        }
        int[][] ans=new int[k][2];
        for(int i=0;i<k;i++){
            Triplet top=heap.remove();
            ans[i][0]=top.x;
            ans[i][1]=top.y;
        }
        return ans;
    }
}