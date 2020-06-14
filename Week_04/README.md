# 学习笔记

### 本周学习内容：BFS， DFS，贪心算法，二分查找

DFS代码模板
1、递归写法

```python
visited = set()
def dfs(node, visited):
    if node in visited: # terminator
    # already visited 
    return
    
    visited.add(node)

    # process current node here
    for next_node in node.children():
        if next_node not in visited:
            dfs(next_node, visited)

```

2、非递归写法
```python
def DFS(self, tree):
    if tree.root id None:
        return []

    visited, stack = [], [tree.root]

    while stack:
        node = stack.pop()
        visited.add(node)

        process(node)
        nodes = generate_ralated_nodes(node)
        stack.push(nodes)

    # other processing work

```

BFS代码模板

```python

def BFS(graph, start, end):
    visited = set()
    queue = []
    queue.append([start])
    
    while queue:
    node = queue.pop()
    visited.add(node)

    process(node)
    nodes = generate_ralated_nodes(node)
    queue.push(nodes)

    # other processing work

```
        



使用二分查找，需要满足三个条件：函数单调性、有边界、能够通过索引访问
二分查找代码模板
#Python
```python

left, right = 0, len(array) - 1
    while left <= right:
    mid = (left + right) / 2
    if array[mid] == target:
        # find the target
        break or return result

    elif array[mid] < target:
        left = mid + 1
    else:
        right = mid -1

```
    
