package easy;


import root.TreeNode;

public class BalancedBinaryTree {
    //balanced binary tree -> height(left)-height(right)<=1
    public boolean isBalanced(TreeNode root) {
        int check=height(root);
        if(check==-1)
            return false;
        else
            return true;
    }

    private int height(TreeNode root) {
        if(root==null)
            return 0;

        //left height
        int lh=height(root.left);

        //right height
        int rh=height(root.right);

        //if lh or rh height is -1 then not a balanced binary tree
        if(lh==-1 || rh==-1)
            return -1;

        //if > 1 then not balanced binary tree
        if(Math.abs(lh-rh)>1)
            return -1;

        return 1+ Math.max(lh,rh);
    }
}
