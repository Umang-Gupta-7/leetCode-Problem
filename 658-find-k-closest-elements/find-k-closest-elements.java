class Pair implements Comparable<Pair>{
    int number;
    int diff;
    Pair(int number,int diff){
        this.number=number;
        this.diff=diff;
    }
    public int compareTo(Pair t){
        if(this.diff==t.diff) return this.number-t.number;
        else return this.diff-t.diff;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        List<Integer> ans=new ArrayList<>();
        PriorityQueue<Pair> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            int number=arr[i];
            int diff =Math.abs(number-x);
            heap.add(new Pair(number,diff));
            if(heap.size()>k) heap.remove();
        }
        for(int i=0;i<k;i++){
            ans.add(heap.remove().number);
        }
        Collections.sort(ans);
        return ans;
    }
}