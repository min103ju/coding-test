# Maximum Depth Of BinaryTree_BFS

- 하나의 이진 트리에서 최고 깊이를 구하는 문제, BFS로 문제풀이

> 1. Input
> TreeNode t1 = new TreeNode(3);          //root
> t1.left = new TreeNode(1);              //depth1
> t1.right = new TreeNode(4);             //depth1
> t1.left.left = new TreeNode(5);         //depth2
> t1.left.right = new TreeNode(8);        //depth2
> t1.left.left.left = new TreeNode(7);    //depth3
> 2. Output : 4

> **BFS**로 풀이
> Queue을 사용
> BFS에서 Queue사용에 대한 코드는 암기 할 것.

```
while(!queue.isEmpty){
    T t = queue.poll();

    for(int i=0; i<queue.size(); i++){
        // Search & Insert Queue
    }
}
```
