package easy;

import root.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    //root left right
    public List<Integer> preorderTraversal(TreeNode root) {

       List<Integer> result=new ArrayList<>();
       preOrder(root,result);

        return result;
    }

    private void preOrder(TreeNode root, List<Integer> result) {
        if(root==null)
            return;

        result.add(root.val);
        preOrder(root.left,result);
        preOrder(root.right,result);
    }
}
