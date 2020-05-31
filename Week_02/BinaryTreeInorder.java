class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        helper(root, ans);
        return ans;

    }

    public void helper(TreeNode root, List<Integer> ans) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, ans);
            }
            ans.add(root.val);
            if (root.right != null) {
                helper(root.right, ans);
            }
        }
    }
}