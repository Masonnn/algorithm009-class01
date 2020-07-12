// 位1的个数
class Solution {
    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n = n & (n - 1); // 数字n中最低位的1，总是对应n-1中的0
        }
        return sum;
    }
}

class Solution {
    public int hammingWeight(int n) {
        int bits = 0;
        int mask = 1; //任何数字跟掩码1进行逻辑与运算，都可以获得这个数字的最低位
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) bits++;
            mask <<= 1;
        }
        return bits;
    }
}

