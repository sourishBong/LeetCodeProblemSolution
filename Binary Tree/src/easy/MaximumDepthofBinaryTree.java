package easy;

import root.TreeNode;

public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
            if(root==null)
                return 0;
            //1(for the root) + then max of left,right
            return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
