学习笔记

### 字典树

**概念：** 字典树，即Trie树， 又称单词查找树 或 键树，是一种树形结构。
典型应用于统计和排序大量字符串（不限于字符串），所以经常被搜索引擎系统用于文本词频统计。

**优点：** 最大限度地减少无谓的字符串笔记，查询效率比哈希表高。


**基本性质：** 
1、结点本身不存完整单词。
2、从根结点到某一结点，路径上经过的字符连接起来，为该结点对应的字符串。
3、每个结点的所有子节点路径 代表的字符都不相同。

**结点内部结构：**


**基本操作：**


```java
class Trie {

    private Trie[] links;
    private final int R = 26;
    private boolean isEnd;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        links = new Trie[R];
    }

    public boolean containsKey(char ch) {
        return links[ch - 'a'] != null;
    }

    public Trie get(char ch) {
        return links[ch - 'a'];
    }

    public void put(char ch, Trie node) {
        links[ch - 'a'] = node;
    }

    public void setEnd() {
        isEnd = true;
    }

    public boolean isEnd() {
        return isEnd;
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!node.containsKey(currentChar)) {
                node.put(currentChar, new Trie());
            }
            node = node.get(currentChar);
        }
        node.setEnd();
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        Trie node = searchPrefix(word);
        return node != null && node.isEnd();
    }

    private Trie searchPrefix(String prefix) {
        Trie node = this;
        for (int i = 0; i < prefix.length(); i++) {
            char curLetter = prefix.charAt(i);
            if (node.containsKey(curLetter)) {
                node = node.get(curLetter);
            } else {
                return null;
            }
        }
        return node;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        Trie node = searchPrefix(prefix);
        return node != null;
    }
}

```

### 并查集

**基本操作：**

* makeSet(s): 新建集合，其中包含s个单元素集合。


* unionSet(x,y):


* find(x):

初始化，parent指向自己

路径压缩？？？


### 高级搜索

###### 初级搜索复习


#### 剪枝

#### 双向搜索

#### 启发式搜索（A* 算法）优先级优先


### 高级树、AVL树和红黑树


