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
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root,0);
        
    }
    int dfs(TreeNode root, int val){
        int ans=0;
        if(root== null)
            return 0;
        val= val <<1 | root.val;
        if(root.left == null && root.right == null)
            return val;
        ans+= dfs(root.left, val);
        ans+=dfs(root.right, val);
    return ans;
    }
}
