class Quad{
    int max;
    int min;
    boolean isbst;
    int sum;
    Quad(int max,int min,boolean isbst,int sum){
        this.max=max;
        this.min=min;
        this.isbst=isbst;
        this.sum=sum;
    }
}
class Solution {
    static int maxSum;
    public int maxSumBST(TreeNode root) {
        maxSum=0;
        sum(root);
        return maxSum;
    }
    public Quad sum(TreeNode root){
        if(root==null) return new Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,true,0);
        Quad left= sum(root.left);
        Quad right=sum(root.right);
        int max=Math.max(root.val,Math.max(left.max,right.max));
        int min=Math.min(root.val,Math.min(left.min,right.min));
        boolean isbst=left.isbst && right.isbst && (left.max<root.val && right.min>root.val);
        int sum=root.val+left.sum+right.sum;
        if(isbst) maxSum=Math.max(maxSum,sum);
        return new Quad(max,min,isbst,sum);
    }
}