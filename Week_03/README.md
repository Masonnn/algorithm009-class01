学习笔记

本周学习递归、分治、回溯等内容，概念理解起来不难，做起题来很头疼。

主要难点在找最小重复子问题和找到递归终止条件。要避免人肉递归。

还是要多做题，边做题边理解。多过遍数。


递归代码模板
```
public void recur(int level, int param){}
    // terminator
    
    if (level > max_level){
        process_result();
        return;
    }
    // process current logic
    process(level, param);

    // drill down
    recur(level + 1, newParam)

    // restore current status       

```

分治代码模板
```
public void divideConquer(problem, param1, param2, ...){
    // recursion terminator
    if (problemsSovled){
        print result;
        return;
    }

    // prepare data 
    data = prepare_data(problem) 
    subproblems = split_problem(problem, data) 

    // conquer subproblems 
    subresult1 = self.divide_conquer(subproblems[0], p1, ...) 
    subresult2 = self.divide_conquer(subproblems[1], p1, ...) 
    subresult3 = self.divide_conquer(subproblems[2], p1, ...) 

    // process and generate the final result
    result = process_result(subresult1, subresult2, subresult3, …)


    // restore current status       


}

```