class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            res[i] = count(i);
        }
        return res;
    }

    private int count(int i) {
        int one = 0;
        while (i != 0) {
            one++;
            i = i & (i - 1);
        }
        return one;
    }
}


class Solution {
    public int[] countBits(int num) {
        int[] ans = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}