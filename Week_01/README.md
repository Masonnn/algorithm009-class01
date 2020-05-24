**学习笔记**

```java
// deque代码使用新API改写
        Deque<String> deque = new LinkedList<String>();
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");
        System.out.println(deque);

        String string = deque.peekFirst();
        System.out.println(string);
        System.out.println(deque);

        while (deque.size() > 0){
            System.out.println(deque.removeFirst());
        }
        System.out.println(deque);
```

PriorityQueue 是 Class，继承AbstractQueue类，Queue 是 Interface。


本周学习的主要内容： 数组、链表、栈、队列等最最基本的数据结构，
数组：申请的是连续内存，查询时间复杂度是O(1)，但插入和删除的时间复杂度是O(n).
链表：申请非连续内存，通过指针链接数据。理论上的增删时间复杂度是O(1)，查询是O(n).
跳表：加索引升维，以空间换时间。查询复杂度O(logn)

栈：先进后出（LIFO）
队列：先进先出（LILO）
双端队列：可理解成栈和队列的结合，工程中更常用。


理论知识理解起来很容易，但做题总是没思路。
有的题即便看了别人的解法，会了，自己也做过了，但第二天再做，也有可能完全忘记，让人难免沮丧。
仔细分析原因，主要还是因为接触的次数还是太少，熟练程度不够。
所以超哥说的过遍数，是最朴素有效的道理。
有点类似于背单词，见得次数多了，自然就会了。

但还是太容易陷入死磕当中了。磕着磕着，不知不觉时间就过去了。到最后也没什么用，还是要看别人的解法。这方面下周一定要避免。


总结：避免死磕，做题多过遍数。

