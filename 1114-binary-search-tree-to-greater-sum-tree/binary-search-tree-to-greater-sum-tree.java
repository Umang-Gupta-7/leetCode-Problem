class Solution {
    public TreeNode bstToGst(TreeNode root) {
        TreeNode curr=root;
        int[] sum={0};
        Gst(curr,sum);
        return root;
    }
    public void Gst(TreeNode root,int[] sum){
        if(root==null) return ;
        Gst(root.right,sum);
        sum[0]+=root.val;
        root.val=sum[0];
        Gst(root.left,sum);
    }
}