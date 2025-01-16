class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        //TreeNode node =new TreeNode<>();
        if(root==null) return new TreeNode(val);
        if(root.val>val){
             if(root.left==null) root.left=new TreeNode(val);
             else insertIntoBST(root.left,val);
        }
        else{
            if(root.right==null) root.right=new TreeNode(val);
             else insertIntoBST(root.right,val);
        }
        return root;
    }
}