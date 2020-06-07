class Solution {
    List<String> res = null;

    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        helper(0, 0, n, "");
        return res;
    }

    public void helper(int left, int right, int max, String s) {
        if (left == max && right == max) {
            res.add(s);
            return;
        }

        if (left < max)
            helper(left + 1, right, max, s + "(");
        if (right < left)
            helper(left, right + 1, max, s + ")");


    }
}