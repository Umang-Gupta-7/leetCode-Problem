class Solution {
    public TreeNode sortedArrayToBST(int[] arr) {
        int n=arr.length;
        return bst(0,n-1,arr);
    }
    public TreeNode bst(int low,int high,int[] arr){
        if(low>high) return null;
        int mid=low+ (high-low)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=bst(low,mid-1,arr);
        root.right=bst(mid+1,high,arr);
        return root;
    }
}