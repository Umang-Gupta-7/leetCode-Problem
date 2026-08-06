class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        return built(0,n-1,0,n-1,inorder,postorder);
    }
    public TreeNode built(int inLow,int inHigh,int postLow,int postHigh,int[] inorder,int[] postorder){
        if(postLow>postHigh) return null;
        int val=postorder[postHigh],r=-1;
        TreeNode root=new TreeNode(val);
        for(int i=inLow;i<=inHigh;i++){
            if(inorder[i]==val)
            {
                r=i;
                break;
            }
        }
        int cnt=r-inLow;
        root.left=built(inLow,r-1,postLow,postLow+cnt-1,inorder,postorder);
        root.right=built(r+1,inHigh,postLow+cnt,postHigh-1,inorder,postorder);
        return root;
    }
}