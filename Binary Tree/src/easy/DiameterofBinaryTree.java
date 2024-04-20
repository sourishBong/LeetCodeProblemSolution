package easy;

import root.TreeNode;

public class DiameterofBinaryTree {

    //Diameter is the longest path between any two nodes
    //This path does not need to pass via root
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter[]=new int[1];
         height(root,diameter);
         return diameter[0];
    }

    private int height(TreeNode root, int[] diameter) {
        if(root==null)
            return 0;

        int lh=height(root.left,diameter);
        int rh=height(root.right,diameter);

        diameter[0]=Math.max(diameter[0],lh+rh);

        return Math.max(lh,rh)+1;
    }
}
