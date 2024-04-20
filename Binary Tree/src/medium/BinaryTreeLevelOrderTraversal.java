package medium;

import root.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> result=new ArrayList<>();
        //if root is empty
        if(root==null)
            return result;
        //add/push elemments to queue
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int levelNum=queue.size();
            for(int i=0;i<levelNum;i++){
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                //queue.poll() is similar to stack.pop()
                list.add(queue.poll().val);
            }
            result.add(list);
        }
        return result;
    }
}
