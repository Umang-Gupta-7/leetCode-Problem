class Solution {
    public void Gst(TreeNode root,int[] sum){
        if(root==null) return ;
        Gst(root.right,sum);
        sum[0]+=root.val;
        root.val=sum[0];
        Gst(root.left,sum);
    }
    public TreeNode convertBST(TreeNode root) {
        int[] sum={0};
        Gst(root,sum);
        return root;
    }
}