class Pair{
    TreeNode node;
    int time;
    Pair(TreeNode node,int time){
        this.node=node;
        this.time=time;
    }
}
class Solution {
    static TreeNode start;
    HashMap<TreeNode,TreeNode> parent;
    public int amountOfTime(TreeNode root, int target) {
        int totalTime=0;
        parent=new HashMap<>();
        dfs(root,target);
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(start,0));  // hum start se start krenge
        HashSet<TreeNode> burned=new HashSet<>();
        burned.add(start);
        while(q.size()>0){
            Pair front=q.remove();
            TreeNode node=front.node;
            int time=front.time;
            totalTime=Math.max(totalTime,time);
            if(node.left!=null && !burned.contains(node.left)){
                q.add(new Pair(node.left,time+1));
                burned.add(node.left);
            }
            if(node.right!=null && !burned.contains(node.right)){
                q.add(new Pair(node.right,time+1));
                burned.add(node.right);
            }
            if(parent.containsKey(node) && !burned.contains(parent.get(node))){
                q.add(new Pair(parent.get(node),time+1));
                burned.add(parent.get(node));
            }
        }
        return totalTime;
    }
    public void dfs(TreeNode root,int target){
        if(root==null) return;
        if(root.val==target) start=root;
        if(root.left!=null) parent.put(root.left,root);
        if(root.right!=null) parent.put(root.right,root);
        dfs(root.left,target);
        dfs(root.right,target);
    }
}