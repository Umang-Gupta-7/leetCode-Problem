class Solution {
     public class Triplet implements Comparable<Triplet>{
        int ele;
        int row;
        int col;
        Triplet(int ele,int row,int col){
            this.ele=ele;
            this.row=row;
            this.col=col;
        }
        public int compareTo(Triplet t){
            return this.ele-t.ele;
        }
    }
    public int[] smallestRange(List<List<Integer>> arr) {
         PriorityQueue<Triplet> heap=new PriorityQueue<>();
        int k=arr.size();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            min=Math.min(arr.get(i).get(0),min);
            max=Math.max(arr.get(i).get(0),max);
            heap.add(new Triplet(arr.get(i).get(0),i,0));
        }
        int a=min,b=max;
        while(true){
            Triplet top=heap.remove();
            int ele=top.ele,row=top.row,col=top.col;
            if(max-ele<b-a){
                a=ele;
                b=max;
            }
            if (col + 1 == arr.get(row).size()) break;
            int next = arr.get(row).get(col+1);
            heap.add(new Triplet(next,row,col+1)); 
            max=Math.max(next,max);
            
        }
        int[] ans={a,b};
        return ans;
    }
}