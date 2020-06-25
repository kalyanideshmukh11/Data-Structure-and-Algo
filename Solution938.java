//Definition for a binary tree node.
  
 
class Solution938 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    };

    static int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null){
            return 0;
        }
        else if (L> root.val){
            return rangeSumBST(root.right, L, R);
        }
        else if (R < root.val){
            return rangeSumBST(root.left, L, R);
        }
        else{
            return  rangeSumBST(root.left,L,R)+ rangeSumBST(root.right, L,R)+root.val;
        }
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(10);  
        root.left = new TreeNode(5);  
    root.right = new TreeNode(15);  
    root.left.left = new TreeNode(3);  
    root.left.right = new TreeNode(7);  
    root.right.right = new TreeNode(18);  
        int  L = 7, R = 15;
        int output= Solution938.rangeSumBST(root, L, R);
        System.out.println(output);
    
    }
}


           
        