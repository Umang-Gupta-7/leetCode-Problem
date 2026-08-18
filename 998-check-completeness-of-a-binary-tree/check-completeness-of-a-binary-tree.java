
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        int s=size(root);
        return isCbt(root,s,1);
    }
    private int size(TreeNode root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    private boolean isCbt(TreeNode root,int size,int count){
        if(root==null) return true;
        if(count>size) return false;
        return isCbt(root.left,size,2*count) && isCbt(root.right,size,2*count+1);
    }
}