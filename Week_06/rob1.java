class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length <= 0) return 0;

        int len = nums.length;
        int[][] A = new int[len][2];

        A[0][0] = 0;
        A[0][1] = nums[0];

        for (int i = 1; i < len; i++) {
            A[i][0] = Math.max(A[i - 1][0], A[i-1][1]);
            A[i][1] = A[i - 1][0] + nums[i];
        }

        return Math.max(A[len - 1][1], A[len - 1][0]);
    }
}

class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length <= 0) return 0;
        if (nums.length == 1) return nums[0];

        int len = nums.length;
        int[] A = new int[len]; // 前i个且最后一个房子一定偷时的最大值

        A[0] = nums[0];
        A[1] = Math.max(nums[0], nums[1]);
        int res = Math.max(A[0], A[1]);
        for (int i = 2; i < len; i++) {
            A[i] = Math.max(A[i - 1], A[i - 2] + nums[i]); //
            res = Math.max(res, A[i]);
        }
        return res;
    }
}


class Solution {
    public int rob(int[] nums) {
        int prevMax = 0;
        int currMax = 0;
        for (int x : nums) {
            int temp = currMax;
            currMax = Math.max(prevMax + x, currMax);
            prevMax = temp;
        }
        return currMax;
    }
}