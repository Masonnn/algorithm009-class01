class Solution {
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? helper(x, N) : 1.0 / helper(x, -N);
    }

    public double helper(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = helper(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }
}