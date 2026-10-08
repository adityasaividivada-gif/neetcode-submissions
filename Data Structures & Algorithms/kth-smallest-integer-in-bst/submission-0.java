/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    ArrayList<Integer> inorderarray=new ArrayList<Integer>();
    public void inorder(TreeNode node)
    {
        if(node.left!=null)
        {
            inorder(node.left);
        }
        inorderarray.add(node.val);
        if(node.right!=null){
            inorder(node.right);
        }

    }
    public int kthSmallest(TreeNode root, int k) {
        
        inorder(root);
        System.out.println(inorderarray);
        return inorderarray.get(k-1);
    }
}
