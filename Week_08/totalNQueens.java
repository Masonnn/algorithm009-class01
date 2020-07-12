class Solution {

    private int size;
    private int count;

    public int totalNQueens(int n) {
        count = 0;
        size = (1 << n) - 1; // 所有可以放皇后的位置
        solve(0, 0, 0);
        return count;
    }

    private void solve(int row, int ld, int rd) {
        if (row == size) {
            count++;
            return;
        }
        int pos = size & (~(row | ld | rd)); // 当前层能放皇后的所有位置
        while (pos != 0) {
            int p = pos & (-pos); // 获得最低位的1
            pos -= p;  // 在该位置放上皇后
            solve(row | p, (ld | p) << 1, (rd | p) >> 1);
        }
    }

}