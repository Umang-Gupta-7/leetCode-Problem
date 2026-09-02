class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node,int level){
        this.node=node;
        this.level=level;
    }
}
class Solution {
    // public int level(TreeNode root){
    //     if(root==null) return 0;
    //     int leftLevel=level(root.left);
    //     int rightLevel=level(root.right);
    //     int total=1+Math.max(leftLevel,rightLevel);
    //     return total;
    // }
    public int findBottomLeftValue(TreeNode root) {
        if(root.left==null && root.right==null) return root.val;
        Queue<Pair> q=new LinkedList<>();
        int maxLevel=0,value=0;
        q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front=q.remove();
            TreeNode node=front.node;
            int level=front.level;
            if(maxLevel<level) {
                value=node.val;
                maxLevel=level;
            }
            if(node.left!=null) q.add(new Pair(node.left,level+1));
            if(node.right!=null) q.add(new Pair(node.right,level+1));
        }
        return value;
    }
}