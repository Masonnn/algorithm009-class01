学习笔记

## 位运算

#### 位运算符

| 含义 | 运算符 | 示例 |
| --- | --- | --- |
| 左移 | << | 0011 => 0110 |
| 右移 | >> | 0110 => 0011 |
| 按位或 | \| | ~~0011 <br/> ----- <br/> 1001~~|
| 按位与 | & |  |
| 按位取反 | ~ |  |
| 按位异或（相同为零不同为一） | ^ |  |

![3829b9ce3901c16c896de81da50ce836.png](evernotecid://F481C5C1-AA36-4BAD-9D1F-5C9D27099F65/appyinxiangcom/7433901/ENResource/p359)


##### XOR - 异或
异或：相同为0，不同为1。也可用”不进位加法“来理解。

x^0 = x
x^1s = ~x //注：1s = ~0
x^(~x) = 1s
x^x = 0

c = a ^ b => a ^ c = b, b ^ c = a //交换两个数
a^b^c = a^(b^c) = (a^b)^c //associative

##### 指定位置的位运算
1、将x最右边的n位清零： x & (~0 << n)
2、获取x的第n位值（0或1）：（x >> n）& 1
3、获取x的第n位幂值： x & (1 << n)
4、仅将第n位 置为1 ：x | (1 << n)
5、仅将第n位 置为0 ： x & (~(1<<n))
6、将x最高位至第n位（含）清零： x & ((1<<n)-1)


##### 实战位运算要点

![a476240fa4ea0dfc023edb9a4a40ab1a.png](evernotecid://F481C5C1-AA36-4BAD-9D1F-5C9D27099F65/appyinxiangcom/7433901/ENResource/p385)


#### 算数移位与逻辑移位




## 布隆过滤器、LRU Cache

#### 布隆过滤器 vs Hash Table
一个很长的**二进制向量**和一系列**随机影射函数**。
布隆过滤器可以用于检索一个元素是否在一个集合中。

优点：空间效率和查询时间远远超过一般算法。（模糊查询）
缺点：有一定误识别率、删除困难。

布隆过滤器当缓存用，查询不存在一定不存在，查询存在不一定存在。






#### LRU Cache
两个要素：大小、替换策略
实现方式： HashTable + DoubleLinkedList
O(1)查询
O(1)修改、更新


LRU - least recently used

## 排序算法
![52bc8ac626fa0ec3f49475e13c66c45e.png](evernotecid://F481C5C1-AA36-4BAD-9D1F-5C9D27099F65/appyinxiangcom/7433901/ENResource/p361)
