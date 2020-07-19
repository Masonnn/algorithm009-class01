学习笔记

[路径2](https://leetcode-cn.com/problems/unique-paths-ii/)状态转移方程：

无障碍物：
dp[i][j] = dp[i-1][j] + dp[i,j-1]
有障碍物：
dp[i][j] = 0