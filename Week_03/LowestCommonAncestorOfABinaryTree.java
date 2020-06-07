class Solution {
    private TreeNode ans;

    public Solution() {
        this.ans = null;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.ans;

    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        boolean lSon = dfs(root.left, p, q);
        boolean rSon = dfs(root.right, p, q);

        if ((lSon && rSon) || ((root.val == p.val || root.val == q.val)) && (lSon || rSon)) {
            ans = root;
        }

        return lSon || rSon || (root.val == p.val || root.val == q.val);

    }

}

