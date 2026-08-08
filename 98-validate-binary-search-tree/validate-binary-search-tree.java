class Triplet{
    long max;
    long min;
    boolean isbst;
    Triplet(long max,long min,boolean isbst){
        this.max=max;
        this.min=min;
        this.isbst=isbst;
    }
}
class Solution {
    public boolean isValidBST(TreeNode root) {
        return check(root).isbst;
    }
    public Triplet check(TreeNode root){
        if(root==null) return new Triplet(Long.MIN_VALUE,Long.MAX_VALUE,true);
        Triplet lst=check(root.left);
        Triplet rst=check(root.right);
        long max=Math.max(root.val,Math.max(lst.max,rst.max));
        long min=Math.min(root.val,Math.min(lst.min,rst.min));
        boolean isbst=lst.isbst && rst.isbst && (lst.max<root.val && rst.min>root.val); 
        // ye hum lst ka aur rst ka isbst ish liy liye dekh rhe hai l=ki left bst ho aur right tree bhbi bst ho phir uska comprasion root.val se max aur min sw krke check kr rhe hai taki total bst hai ki nhi dekh ske-->
        return new Triplet(max,min,isbst);
    }
}