
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int arr[]={k,-1};
        kth(root,arr);
        return arr[1];
    }
    public void kth(TreeNode root,int[] arr){
        if(root==null) return;
        kth(root.left,arr);
        arr[0]--;
        if(arr[0]==0){
            arr[1]=root.val;
            return;
        }
        kth(root.right,arr);
    }
}