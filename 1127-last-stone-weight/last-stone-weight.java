class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            heap.add(arr[i]);
        }
        while(heap.size()>1){
            int top=heap.remove();
            int secTop=heap.remove();
            if(top!=secTop){
                top=top-secTop;
                heap.add(top);
            }
        }
        if(heap.size()>0) return heap.peek();
        else return 0;
    }
}