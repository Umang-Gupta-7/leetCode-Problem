class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        // TreeNode curr=root;
        if(root.val<key) root.right=deleteNode(root.right,key);
        else if(root.val>key) root.left=deleteNode(root.left,key);
        else{
            // for that node---
            if(root.left==null && root.right==null) return null; // delete if node is single child---
            if(root.left==null) return root.right; // delte when deleting node has one child 
            if(root.right==null ) return root.left; // samee one child
            // now for deleting node has two child
            TreeNode pred=root.left;
            while(pred.right!=null) pred=pred.right;
            root.left=deleteNode(root.left,pred.val);
            pred.left=root.left;
            pred.right=root.right;
            return pred;
        }
        return root;
    }
}