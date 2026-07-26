package Trees.Questions;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class findSuccessor {
    public TreeNode findSuccessor(TreeNode root, int key){
        if(root==null) return null;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr.left!=null){
                q.add(curr.left);
            }            
            if(curr.right!=null){
                q.add(curr.right);
            } 
            if(curr.val==key) break;           
        }
        return q.peek();
    }
}
