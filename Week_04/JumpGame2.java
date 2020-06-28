class Solution {
    public int jump(int[] nums) {
        // 贪心， 正向
        int len = nums.length - 1;
        int end = 0;
        int currFarthest = 0;
        int steps = 0;
        for (int i = 0; i < len; i++) {
            currFarthest = Math.max(currFarthest, i + nums[i]);
            if (i == end) {
                end = currFarthest;
                steps++;
            }
        }
        return steps;
    }
}