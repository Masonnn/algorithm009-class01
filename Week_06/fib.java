class Solution {
    public int fib(int N) {
        if (N <= 1) return N;
        int[] nums = new int[N + 1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i <= N; i++) {
            nums[i] = nums[i - 2] + nums[i - 1];
        }

        return nums[N];
    }
}