package hard;

import root.TreeNode;

public class BinaryTreeMaximumPathSum {

    public int maxPathSum(TreeNode root) {
        int max[]=new int[1];
        max[0]=Integer.MIN_VALUE;
        maxPath(root,max);
        return max[0];
    }

    private int maxPath(TreeNode node, int[] max) {
        if(node==null)
            return 0;

        int lh=Math.max(0,maxPath(node.left,max));
        int rh=Math.max(0,maxPath(node.right,max));

        max[0]=Math.max(max[0],lh+rh+node.val);
        return Math.max(lh,rh)+node.val;
    }
}
