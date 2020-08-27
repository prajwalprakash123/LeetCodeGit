package diameterOfATree;




class TreeNode {
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
  }
class diameterOfATree {
    int ans = 0;

    public int diameterOfATree(TreeNode root) {
        getDiameter(root);
        return ans = 0 ? 0 : ans - 1;
    }

    public int getDiameter(TreeNode root) {
        if (root == null)
            return 0;
        int l = getDiameter(root.left);
        int r = getDiameter(root.right);
        ans = Math.max(ans, l + r + 1);
        return Math.max(l, r) + 1;
    }





    public static void main(String[] args) {
        TreeNode testTree(1,2,3,4);

    }

}