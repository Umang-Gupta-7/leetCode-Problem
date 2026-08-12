class Solution {
    public int findKthLargest(int[] arr, int k) {
        // MINHEAP----
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for(int ele:arr){
            heap.add(ele);
            if(heap.size()>k) heap.remove();
        }
        return heap.peek();
    }
}